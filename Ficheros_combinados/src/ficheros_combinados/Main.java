package ficheros_combinados;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String myPath = "./src/Resources/";
		final String myFile = "Almacen.dat";
		
		List<Producto> coleccion = new LinkedList<Producto>();
		boolean eof = false;
		String op;
		Scanner reader = new Scanner(System.in);
		
		try(FileInputStream file = new FileInputStream(myPath+myFile);
				ObjectInputStream buffer = new ObjectInputStream(file);) {
			
			while(!eof)
			{
				//reader 
				Object o = buffer.readObject();
				
				//comprobar objeto
				
				if(o instanceof  Producto)
				{
					Producto p = (Producto) o;
					coleccion.add(p);
				}
				else {
					System.out.println("El objeto leido no es un Trabajador");
				}
				
			}
			
		}
		
		catch(EOFException e) {
			eof = true;
			
		}
		
		catch(IOException e)
		{
			System.out.println("Se ha producido un error en la lectura del fichero");
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
		
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Se ha completado la lectura");
		}
		
		do {
			
			System.out.println("1) Crear producto");
			System.out.println("2) Mostrar productos existentes");
			System.out.println("3) Eliminar producto por codigo");
			System.out.println("4) Guardar y salir");
			
			op = reader.nextLine();
			
			if(op.equalsIgnoreCase("1")) {
				
				
				System.out.println("Introduzca la referencia");
				
				String referencia = reader.nextLine();
				
				System.out.println("Introduzca la descripcion");
				
				String descripcion = reader.nextLine();
				
				System.out.println("Introduzca el tipo");
				
				String tipo = reader.nextLine();
				
				System.out.println("Introduzca la cantidad");
				
				int cantidad = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Introduzca el precio");
				
				int precio = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Introduzca el precio");
				
				int descuento = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Introduzca el IVA");
				
				int IVA = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Introduzca si se aplica o no el descuento (Si o no)");
				
				String siONo = reader.nextLine();
				boolean aplicarDto;
				if(siONo.equalsIgnoreCase("Si")) {
					aplicarDto = true;
				}
				
				else if (siONo.equalsIgnoreCase("No")) {
					aplicarDto = false;
				}
				
				else {
					System.out.println("Has introduzido un valor incorrecto, se ha establecido el valor por defecto a 'true'");
					aplicarDto = true;
				}
				
				coleccion.add(new Producto(referencia, descripcion, tipo, cantidad, precio, descuento, IVA, aplicarDto));
					
		}//op 1
			
		if(op.equalsIgnoreCase("2")) {
				
			System.out.println(coleccion.toString() + "\n");

		}//op 2
		
		if(op.equalsIgnoreCase("3")) {
			System.out.println("Introduzca el producto que desee eliminar por su referencia:");
			String elim = reader.nextLine();
			int contador = 0;
			int eliminarNumero = -1;
			
			for(Producto p : coleccion) {
				
				if(p.getReferencia().equalsIgnoreCase(elim)) {
					eliminarNumero = contador;
					
				}
					
				
				contador++;
			}
			
			if(eliminarNumero != -1) {
				coleccion.remove(eliminarNumero);
				
			}
		
	}
		
		if(op.equalsIgnoreCase("4")) {
			try(FileOutputStream file = new FileOutputStream(myPath+myFile);
					ObjectOutputStream buffer = new ObjectOutputStream(file);) {
				for(Producto p : coleccion) {
					buffer.writeObject(p);
				}
				buffer.flush();
			}
			
			catch(IOException ex){
				ex.printStackTrace();
			}
			
		}
		
		}
		while(!op.equalsIgnoreCase("4"));
}
}