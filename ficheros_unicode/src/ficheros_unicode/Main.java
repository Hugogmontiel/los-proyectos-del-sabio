package ficheros_unicode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		final String myFileTxt ="Almacen.txt";
		String op;
		Scanner reader = new Scanner(System.in);
		
		List<Producto> coleccion = new LinkedList<Producto>();
		
		boolean eof = false;
		
		try(FileInputStream  myreader =  new FileInputStream(myPath+myFile);
				DataInputStream  buffer = new DataInputStream(myreader);)
		{
			while (eof == false) {
			String codigo = buffer.readUTF();
			String nombre = buffer.readUTF();
			int cantidad = buffer.readInt();
			double precio = buffer.readDouble();
					
					
			coleccion.add(new Producto(codigo, nombre, cantidad, precio));
			}
		}
		catch(EOFException e)
		{
			eof = true;
			System.out.println("Hemos llegado al final de la escritura del fichero \n");	
		}
		catch(IOException e)
		{
			System.out.println("Ha ocurrido un error al I/O");
			System.out.println(e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println("Ha ocurrido un error inexperado");
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
				int eliminarNumero = -1;
				
					for(Producto p : coleccion) {
						
						
						if(p.getCodigo().equalsIgnoreCase(elim)) {
							eliminarNumero = contador;
							
						}
						contador++;
					}
					
					if(eliminarNumero != -1) {
						coleccion.remove(eliminarNumero);
						
					}
			}//op 3
			
			if(op.equalsIgnoreCase("4")) {
			    try(FileOutputStream  myWriter = new FileOutputStream (myPath + myFile, false);
			    		DataOutputStream  buffer = new DataOutputStream(myWriter)) {
			        for (Producto p : coleccion) {
			          
			                buffer.writeUTF(p.getCodigo());
			                buffer.writeUTF(p.getNombre());
			                buffer.writeInt(p.getCantidad());
			                buffer.writeDouble(p.getPrecio());

			              
			            }
			        
			    } 
			    catch(IOException e) {
			        System.out.println("Se ha producido un error en el manejo del fichero");
			        System.out.println(e.getMessage());
			        
			    }
			    
			    try (BufferedWriter writer = new BufferedWriter(new FileWriter(myPath + myFileTxt))) {
			        for (Producto p : coleccion) {
			            	
			            writer.write(p.getCodigo() + "," + p.getNombre() + "," + p.getCantidad() + "," + p.getPrecio());
			            writer.newLine(); 
			        }
			        System.out.println("Los productos se han guardado en el archivo de texto correctamente.");
			    } 
			    catch (IOException e) {
			        System.out.println("Se ha producido un error al guardar los productos en el archivo de texto.");
			        System.out.println(e.getMessage());
			    }
			
			    
			    
			}		
			
		}
		while(!op.equalsIgnoreCase("5"));
		
	}
}

		
