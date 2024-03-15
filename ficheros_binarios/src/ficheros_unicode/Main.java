package ficheros_unicode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String myPath ="./src/Resources/";
		final String myFile = "Almacen.dat";
		String op;
		Scanner reader = new Scanner(System.in);
		
		List<Producto> coleccion = new LinkedList<Producto>();
		
		
		try(FileReader myreader =  new FileReader(myPath+myFile);
				BufferedReader buffer = new BufferedReader(myreader);)
		{
			String line = null;
			do {

				line = buffer.readLine();
				if(line != null)
				{
					
					
					String [] elementos = line.split(",");
					String codigo = elementos[0];
					String nombre = elementos[1];
					int cantidad = Integer.parseInt(elementos[2]);
					double precio = Double.parseDouble(elementos[3]);
					
					
					coleccion.add(new Producto(codigo, nombre, cantidad, precio));
				}
				
			}
			while(line != null);
			
		}
		catch(IOException e)
		{
			System.out.println("Se ha producido un error en el manejo del fichero");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("La escritura ha finalizado con exito.");
		}
		
		do {
			System.out.println("1) Crear producto");
			System.out.println("2) Mostrar productos existentes");
			System.out.println("3) Eliminar producto por codigo");
			System.out.println("4) Guardar productos en el fichero");
			System.out.println("5) Salir");
			
			op = reader.nextLine();
			
			if(op.equalsIgnoreCase("1")) {
				
	
					System.out.println("Introduzca el codigo");
					
					String codigo = reader.nextLine();
					
					System.out.println("Introduzca el nombre");
					
					String nombre = reader.nextLine();
					
					System.out.println("Introduzca la cantidad de stock");
					
					int cantidad = reader.nextInt();
					reader.nextLine();
					
					System.out.println("Introduzca el precio del producto");
					
					double precio = reader.nextDouble();
					reader.nextLine();
					
					coleccion.add(new Producto(codigo, nombre, cantidad, precio));
					
				
				
				
				
			}//op 1
			
			if(op.equalsIgnoreCase("2")) {
				
				System.out.println(coleccion.toString() + "\n");
				
				
			}//op 2
			
			if(op.equalsIgnoreCase("3")) {
				System.out.println("Introduzca el codigo que desee eliminar:");
				
				String elim = reader.nextLine();
				int contador = 0;
				try(FileReader myreader =  new FileReader(myPath+myFile);
						BufferedReader buffer = new BufferedReader(myreader);)
				{
					String line = null;
					do {

						line = buffer.readLine();
						if(line != null)
						{	
							String [] elementos = line.split(",");
							String codigo = elementos[0];
							
							if(codigo.equalsIgnoreCase(elim)) {
								
								line = null;
								
							}
							
							contador++;
						}
					}
					while (line != null);
					coleccion.remove(contador);
				}
				catch(IOException e)
				{
					System.out.println("Se ha producido un error en el manejo del fichero");
					System.out.println(e.getMessage());
				}
				
				
				
			}//op 3
			
			if(op.equalsIgnoreCase("4")) {
			    try(FileWriter myWriter = new FileWriter(myPath + myFile, true);
			        BufferedWriter buffer = new BufferedWriter(myWriter)) {
			        
			        List<String> codigosExistentes = new LinkedList<>();
			        try (FileReader myreader = new FileReader(myPath + myFile);
			             BufferedReader fileBuffer = new BufferedReader(myreader)) {
			            String line;
			            while ((line = fileBuffer.readLine()) != null) {
			                String[] elementos = line.split(",");
			                String codigo = elementos[0];
			                codigosExistentes.add(codigo);
			            }
			        }

			        for (Producto p : coleccion) {
			            if (!codigosExistentes.contains(p.getCodigo())) {
			                buffer.write(p.getCodigo() + ",");
			                buffer.write(p.getNombre() + ",");
			                buffer.write(Integer.toString(p.getCantidad()) + ",");
			                buffer.write(Double.toString(p.getPrecio()) + "\n");
			                codigosExistentes.add(p.getCodigo());
			            }
			        }
			    } catch(IOException e) {
			        System.out.println("Se ha producido un error en el manejo del fichero");
			        System.out.println(e.getMessage());
			    }
			}		
			
		}
		while(!op.equalsIgnoreCase("5"));
		
		
		
	
		
	}
}

		
