package daw;

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
		final String myFile = "Libros.dat";
		
		List<Libro> coleccion = new LinkedList<Libro>();
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
				
				if(o instanceof  Libro)
				{
					Libro l = (Libro) o;
					coleccion.add(l);
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
			System.out.println("4) Guardar productos en el fichero");
			System.out.println("5) Salir");
			
			op = reader.nextLine();
			
			if(op.equalsIgnoreCase("1")) {
				
				
				System.out.println("Introduzca el ISBN");
				
				String ISBN = reader.nextLine();
				
				System.out.println("Introduzca el Titulo");
				
				String titulo = reader.nextLine();
				
				System.out.println("Introduzca el autor");
				
				String autor = reader.nextLine();
				
				try {
					System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					String fechaPublicacionString = reader.nextLine();
					LocalDate fechaPublicacion = LocalDate.parse(fechaPublicacionString, format);
					coleccion.add(new Libro(ISBN, titulo, autor, fechaPublicacion));
				}
				
				catch (InputMismatchException ex) {
					System.out.println("El error es: ");
					ex.printStackTrace();
					reader.nextLine();
					
				}
				catch (DateTimeParseException ex) {
					System.out.print("El error es: "); 
					ex.getErrorIndex();
					ex.printStackTrace();
					
				}
				
					
		}//op 1
			
		if(op.equalsIgnoreCase("2")) {
				
			System.out.println(coleccion.toString() + "\n");

		}//op 2
		
		if(op.equalsIgnoreCase("3")) {
			System.out.println("Introduzca el ISBN que desee eliminar:");
			String elim = reader.nextLine();
			int contador = 0;
			int eliminarNumero = -1;
			
			for(Libro l : coleccion) {
				
				
				if(l.getISBN().equalsIgnoreCase(elim)) {
					eliminarNumero = contador;
					
				}
				contador++;
			}
			
			if(eliminarNumero != -1) {
				coleccion.remove(eliminarNumero);
				
			}
	}//op 3
	
		
		if(op.equalsIgnoreCase("4")) {
			try(FileOutputStream file = new FileOutputStream(myPath+myFile);
					ObjectOutputStream buffer = new ObjectOutputStream(file);) {
				for(Libro l : coleccion) {
					buffer.writeObject(l);
				}
				buffer.flush();
			}
			
			catch(IOException ex){
				ex.printStackTrace();
			}
			
		}
		
		if(op.equalsIgnoreCase("5")) {
			try(FileOutputStream file = new FileOutputStream(myPath+myFile);
					ObjectOutputStream buffer = new ObjectOutputStream(file);) {
				for(Libro l : coleccion) {
					buffer.writeObject(l);
					
				}
				 buffer.flush();
			}
			
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
		}//bucle
		
		while(!op.equalsIgnoreCase("5"));
			
	}

}
