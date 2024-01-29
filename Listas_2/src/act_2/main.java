package act_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda a = new Agenda();
		Contacto c = new Contacto("Pedro","612345678","aaa@gmail.com");
		
		String nombre = "Alvaro";
		String telefono = "684365128";
		String correo = "hugogm0514@gmail.com";	
		
		a.anadeContacto(nombre, telefono, correo);
		a.anadeContacto("Pedro", telefono, correo);
		
		System.out.println(a.buscarContacto(nombre)); 
		
		System.out.println(a.visualizaAgenda());
		
		boolean bucle = true;
		int numActual = 2;
		
		while(bucle == true) {
			System.out.println("1) Añadir contacto");
			System.out.println("2) Buscar contacto");
			System.out.println("3) Eliminar contacto");
			System.out.println("4) Visualizar agenda");
			System.out.println("5) Número de contactos de mi agenda");
			System.out.println("6) Salir");
			
			Scanner reader = new Scanner(System.in);
			
			String opcion = reader.nextLine();
			
			if(opcion.equalsIgnoreCase("1")) {
				
				System.out.println("Introduce un nombre (Primera letra en mayusculas)");
				String n = reader.nextLine();
				
				System.out.println("Introduce el número de telefono (Que empieze por 6 7 o 9 y tenga 9 digitos)");
				
				String t = reader.nextLine();
				
				System.out.println("Introduce un correo");
				
				String cor = reader.nextLine();
				
				if(c.validatorNombre(n) && c.validatorTelefono(t) && c.validatorCorreo(cor))  {
					if(a.anadeContacto(n, t, cor)) {
						System.out.println("Añadido correctamente");
						numActual++;
						
					}
					
					else {
						System.out.println("No se ha podido añadir");
					}
				}
				
				else {
					System.out.println("No se ha podido añadir");
				}
				
			}
			
			if(opcion.equalsIgnoreCase("2")) {
				
				System.out.println("Introduce un nombre para buscar en la listas (Primera letra en mayusculas)");
				
				String n = reader.nextLine();
				
				a.buscarContacto(n);
				
				
			}
			
			if(opcion.equalsIgnoreCase("3")) {
				
				System.out.println("Introduce un nombre (Primera letra en mayusculas)");
				String n = reader.nextLine();
				
				if(c.validatorNombre(n)) {
					if(a.eliminarElemento(n)) {
						System.out.println("Eliminado correctamente");
						numActual--;
						
					}
					
					else {
						System.out.println("No se ha podido eliminar");
					}
				}
				
				else {
					System.out.println("No se ha podido eliminar");
				}
				
			}
			
			if(opcion.equalsIgnoreCase("4")) {
				
				System.out.println(a.visualizaAgenda());
				
				
			}
			
			if(opcion.equalsIgnoreCase("5")) {
				
				System.out.println("El número actual es: " + numActual);
				
			}
			
			if(opcion.equalsIgnoreCase("6")) {
			
				System.out.println("Saliendo del programa");
				bucle = false;
				
			}
			
		}
	}

}
