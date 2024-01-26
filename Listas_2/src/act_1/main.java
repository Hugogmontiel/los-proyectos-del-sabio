package act_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		Taller a = new Taller();
		
		
		String color = "amarillo";
		String marca = "amarillo";
		String matricula = "1234AAA";
		
		
		
		a.anadeElemento(matricula, color, marca);
		
		a.eliminarElemento(matricula);
		
		a.anadeElemento("1222BBB", color, marca);
		
		System.out.println(a.visualizaMatriculas());
		
		System.out.println(a.visualizaCoches());
		
		System.out.println(a.visualizaTaller());
		
		boolean bucle = true;
		
		while(bucle == true) {
			
			System.out.println("1) Añadir coche");
			System.out.println("2) Eliminar coche");
			System.out.println("3) Salir");
	
			String opcion = reader.nextLine();
			
			if(opcion.equalsIgnoreCase("1")) {
				System.out.println("Introduce un color del coche");
				
				String c = reader.nextLine();
				
				System.out.println("Introduce la marca del coche");
				
				String m = reader.nextLine();
				
				System.out.println("Introduce la matricula del coche (EJ: 1111AAA)");
				
				String matri = reader.nextLine().toUpperCase();
				
				if(a.anadeElemento(matri, c, m)) {
					System.out.println("Se ha añadido correctamente");
					
				}	
				
				else {
					System.out.println("No se ha añadido");
					
				}
				
			}
			
			else if(opcion.equalsIgnoreCase("2")) {
				
				System.out.println("Introduce la matricula para eliminar el coche (EJ: 1111AAA)");
				
				String matri1 = reader.nextLine().toUpperCase();
				
				if(a.eliminarElemento(matri1)) {
					System.out.println("Se ha eliminado correctamente");
					
				}
				
				else {
					System.out.println("No se ha eliminado");
					
				}
				
			}
			
			else if(opcion.equalsIgnoreCase("3")) {
				System.out.println(a.visualizaMatriculas());
				System.out.println(a.visualizaCoches());
				System.out.println(a.visualizaTaller());
				
				bucle = false;
				
				System.out.println("\nSaliendo del programa");
				
					
			}
				
				
			}
			
		}
		
	}


