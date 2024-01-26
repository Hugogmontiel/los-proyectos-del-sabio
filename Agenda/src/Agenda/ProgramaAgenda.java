package Agenda;

import java.util.Scanner;

public class ProgramaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		
		Agenda a = new Agenda(20);
		
		Contactos c1 = new Contactos("Manuel", "123456789");
		Contactos c2 = new Contactos("Roberto", "123123123");
		Contactos c3 = new Contactos("Carlos", "987654321");
		Contactos c4 = new Contactos("Paco", "321321321");
		
		a.añadirContacto(c1);
		a.añadirContacto(c2);
		a.añadirContacto(c3);
		a.añadirContacto(c4);
		
		int numeroActual = 4;
		
		boolean bucle = true;
		
		while (bucle == true) {
			System.out.println("1) Añadir contacto");
			System.out.println("2) Eliminar contacto");
			System.out.println("3) Comprobar si existe contacto");
			System.out.println("4) Mostrar lista");
			System.out.println("5) Buscar posición de un contacto");
			
			String posicion = reader.nextLine();
			
			if(posicion.equalsIgnoreCase("1")) {
				
				System.out.println("El nombre del contacto: ");
				
				String nombre = reader.nextLine();
				
				System.out.println("El número de telefono");
				
				String numero = reader.nextLine();
				
				Contactos c5 = new Contactos(nombre, numero);
				
				a.añadirContacto(c5);
				
				numeroActual++;
				
			}
			
			if(posicion.equalsIgnoreCase("2")) {
				
				a.mostrarNombre();
					
				System.out.println("Selecciona un nombre para borrar");
				
				String nombre = reader.nextLine();
					
					a.eliminarContacto(nombre);
					numeroActual--;
			}
			
			if(posicion.equalsIgnoreCase("3")) {
				
				
			}

			if(posicion.equalsIgnoreCase("4")) {
					a.listarContactos();
				
	
			}
			
		}

	}

}
