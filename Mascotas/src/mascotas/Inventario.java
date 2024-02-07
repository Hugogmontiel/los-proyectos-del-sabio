package mascotas;

import java.time.LocalDate;

import java.util.Scanner;

public class Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		Mascotas [] m = new Mascotas[20];
		
		Gato g = new Gato ("Marcos", 2, "Sano", LocalDate.of(2000, 11, 11), "Negro", true);
		
		Perro p = new Perro ("Roki", 3, "Sano", LocalDate.of(2000, 11, 11), "Labrador", true);
		
		Loro l = new Loro ("Roki", 3, "Sano", LocalDate.of(2000, 11, 11), "Curvado", true, "Negro", true);
		
		Canario c = new Canario ("Roki", 3, "Sano", LocalDate.of(2000, 11, 11), "Curvado", true, "Negro", true);
		
		m[0] = g;
		m[1] = p;
		m[2] = l;
		m[3] = c;
		
		boolean bucle = true;
		int numActualMascotas = 4;
		
		
		while (bucle == true) {
			
			
			System.out.println("1) Mostrar lista animales");
			System.out.println("2) Mostrar todos los datos de un animal");
			System.out.println("3) Mostrar todos los datos de todos los animales");
			System.out.println("4) Insertar animales en el inventario");
			System.out.println("5) Eliminar animales del inventario");
			System.out.println("6) Vaciar inventario");
			System.out.println("7) Salir");
			
			String opcion = reader.nextLine();
			
			if(opcion.equalsIgnoreCase("1")) {
				
				for(int i = 0; i < m.length; i++) {
					if (m[i] == g) {
						
						System.out.println(g.getNombre() + ", Gato");
						
					}
					
					if (m[i] == p) {
						
						System.out.println(p.getNombre() + ", Perro");
						
					}
					
					if (m[i] == l) {
						
						System.out.println(l.getNombre() + ", Loro");
						
					}
					
					if (m[i] == c) {
						
						System.out.println(c.getNombre() + ", Canario");
						
					}
						
						
				}
				
			}
			
			if(opcion.equalsIgnoreCase("2")) {
				
			for(int i = 0; i < m.length; i++) {
				
				if (m[i] != null) {
					System.out.println(i + 1 + (")"));
						
						
				}
				
			}
			
				opcion = reader.nextLine();
				if (opcion.equalsIgnoreCase("1")) {
					m[0].mostrarMascotas();
				}
				
				if (opcion.equalsIgnoreCase("2")) {
					m[1].mostrarMascotas();
				}
				
				if (opcion.equalsIgnoreCase("3")) {
					m[2].mostrarMascotas();
				}
				
				if (opcion.equalsIgnoreCase("4")) {
					m[3].mostrarMascotas();
				}
				
			}

			if(opcion.equalsIgnoreCase("3")) {
				
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) {
					m[i].mostrarMascotas();
				}
			}
	
			}
			
			if(opcion.equalsIgnoreCase("4")) {
			
				System.out.println("1) Perro");
				System.out.println("2) Gato");
				System.out.println("3) Loro");
				System.out.println("4) Canario");
	
				opcion = reader.nextLine();
			
				if(opcion.equalsIgnoreCase("1")) {
					
					System.out.println("Nombre: ");
					
					String nombre = reader.nextLine();
					
					System.out.println("Edad:");
					
					int edad = reader.nextInt();
					
					System.out.println("Estado (Sano, enfermo): ");
					reader.nextLine();
					String estado = reader.nextLine();
					
					System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
					
					LocalDate fechaNacimiento = LocalDate.parse(reader.nextLine());
					
					System.out.println("Raza: ");
					
					String raza = reader.nextLine();
					
					System.out.println("Tiene pulgas(Si o No): ");
					
					String pulgas = reader.nextLine();
					
					boolean hasPulgas = false;
						if (pulgas.equalsIgnoreCase("Si")) {
							hasPulgas = true;
						}
						
						
						if (pulgas.equalsIgnoreCase("No")) {
							hasPulgas = false;
						}
						
						Perro p1 = new Perro(nombre, edad, estado, fechaNacimiento, raza, hasPulgas);
						m[numActualMascotas + 1] = p1;
						numActualMascotas++;
				}
				
				if(opcion.equalsIgnoreCase("2")) {
					
					System.out.println("Nombre: ");
					
					String nombre = reader.nextLine();
					
					System.out.println("Edad:");
					
					int edad = reader.nextInt();
					
					System.out.println("Estado (Sano, enfermo): ");
					reader.nextLine();
					String estado = reader.nextLine();
					
					System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
					
					LocalDate fechaNacimiento = LocalDate.parse(reader.nextLine());
					
					System.out.println("Color: ");
					
					String color = reader.nextLine();
					
					System.out.println("Tiene pelo largo(Si o No): ");
					
					String peloLargo = reader.nextLine();
					
					boolean hasPeloLargo = false;
						if (peloLargo.equalsIgnoreCase("Si")) {
							hasPeloLargo = true;
						}
						
						
						if (peloLargo.equalsIgnoreCase("No")) {
							hasPeloLargo = false;
						}
						
						Gato g1 = new Gato(nombre, edad, estado, fechaNacimiento, color, hasPeloLargo);
						m[numActualMascotas + 1] = g1;
						numActualMascotas++;
					
				}
				
				if(opcion.equalsIgnoreCase("3")) {
					
					System.out.println("Nombre: ");
					
					String nombre = reader.nextLine();
					
					System.out.println("Edad:");
					
					int edad = reader.nextInt();
					
					System.out.println("Estado (Sano, enfermo): ");
					reader.nextLine();
					String estado = reader.nextLine();
					
					System.out.println("Fecha nacimiento (YYYY-MM-DD): ");
					
					LocalDate fechaNacimiento = LocalDate.parse(reader.nextLine());
					
					System.out.println("Pico: ");
					
					String pico = reader.nextLine();
					
					System.out.println("Vuela(Si o No): ");
					
					String vuela = reader.nextLine();
					
					boolean canVuela = false;
						if (vuela.equalsIgnoreCase("Si")) {
							canVuela = true;
						}
						
						
						if (vuela.equalsIgnoreCase("No")) {
							canVuela = false;
						}
						
					System.out.println("Origen: ");
					
					String origen = reader.nextLine();
					
					System.out.println("Habla(Si o No): ");
					
					String habla = reader.nextLine();
					
					boolean canHablar = false;
						if (habla.equalsIgnoreCase("Si")) {
							canHablar = true;
						}
						
						
						if (habla.equalsIgnoreCase("No")) {
							canHablar = false;
						}
						
						Loro l1 = new Loro(nombre, edad, estado, fechaNacimiento, pico, canVuela, origen, canHablar);
						m[numActualMascotas + 1] = l1;
						numActualMascotas++;
		
				}
				
				if(opcion.equalsIgnoreCase("4")) {
					
					System.out.println("Nombre: ");
					
					String nombre = reader.nextLine();
					
					System.out.println("Edad:");
					
					int edad = reader.nextInt();
					
					System.out.println("Estado (Sano, enfermo): ");
					reader.nextLine();
					String estado = reader.nextLine();
					
					System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
					
					LocalDate fechaNacimiento = LocalDate.parse(reader.nextLine());
					
					String pico = reader.nextLine();
					
					System.out.println("Vuela(Si o No): ");
					
					String vuela = reader.nextLine();
					
					boolean canVuela = false;
						if (vuela.equalsIgnoreCase("Si")) {
							canVuela = true;
						}
						
						
						if (vuela.equalsIgnoreCase("No")) {
							canVuela = false;
						}
						
					System.out.println("Color: ");
						
					String color = reader.nextLine();
					
					System.out.println("Habla(Si o No): ");
						
					String canta = reader.nextLine();
						
					boolean canCantar = false;
						if (canta.equalsIgnoreCase("Si")) {
							canCantar = true;
						}
							
							
						if (canta.equalsIgnoreCase("No")) {
							canCantar = false;
						}
							
					Loro l1 = new Loro(nombre, edad, estado, fechaNacimiento, pico, canVuela, color, canCantar);
					m[numActualMascotas + 1] = l1;
					numActualMascotas++;	
					
					
					
				}
				
			}
			
			if(opcion.equalsIgnoreCase("5")) {
				System.out.println("Que numero quieres borrar: ");
				for(int i = 0; i < m.length; i++) {
					
					if (m[i] != null) {
						
						System.out.println(i + 1 + ")");
						
						
					}
		
				}
				
				int borrar = reader.nextInt();
				m[borrar - 1] = null;
				numActualMascotas--;
				
			}
			
			if(opcion.equalsIgnoreCase("6")) {
				m = new Mascotas[20];
			}
			
			if(opcion.equalsIgnoreCase("7")) {
				bucle = false;
				
			}
			
		}
		
	}

}
