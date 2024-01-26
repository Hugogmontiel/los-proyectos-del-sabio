import java.util.Scanner;
public class UD2_examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		
		
		
		//actividad 1
		System.out.println("\nActividad 1\n");
		
		System.out.println("Inserta la cantidad de números para nuestro array");
		
		int cantidad = reader.nextInt(); //valor maximo array
		
		int array [] = new int [cantidad];
		
		int variableArray = 0; //variable para dar valor a cada posicion del array
		
		int valorMax = Integer.MIN_VALUE;
		
		int valorMin = Integer.MAX_VALUE; //para hacer valor minimo
		
		int numerosNoNulos = 0; //numeros no nulos para hacer la media
		
		int totales = 0; //la suma total de todo el array
		
		
		System.out.println("Seleccione una opción: ");
		
		for (int i = 0; i > -1; i++) {
			
			System.out.println("\n1) Modificar colección");
			System.out.println("2) Estadística de la colección");
			System.out.println("3) Ampliar valor de la cantidad");
			System.out.println("4) Salir");
			
			int seleccionPrincipal = reader.nextInt();
			
			//seleccion 1
			
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
			
			if (seleccionPrincipal == 1) {
				
				
				System.out.println("\n1) Insertar número");
				System.out.println("2) Borrar número de una posición especifica");
				System.out.println("3) Modificar número de una posición especifica");
				
				int seleccion1 = reader.nextInt();
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				if (seleccion1 == 1) {
					
					
						if (variableArray < cantidad) { 
						
						System.out.println("Inserta un número para guardar en el array: ");
						
						array[variableArray] = reader.nextInt();
						
						
						System.out.println("\nNuevo valor añadido");
						
						variableArray++;
						
						System.out.println("Quedan " + (cantidad - variableArray) + " valor/es disponibles");	
					
					}

					else {
						
						System.out.println("No caben más valor/es en el array");
						
					}
				}
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				else if (seleccion1 == 2 ) {
					
					System.out.println("Seleccione una posición del array para que sea borrado: ");
					
					int borrarArray = reader.nextInt();
					
					array [borrarArray] = 0;
					
					System.out.println("El valor en la posición " + borrarArray + " ha sido borrado");
						
				}
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				else if (seleccion1 == 3) {
					
					System.out.println("Selecciona una posición en el array: ");
					
					int modArray = reader.nextInt();
					
					System.out.println("Introduzca el nuevo valor de la posición "+ modArray);
					
					array [modArray - 1] = reader.nextInt();
					
					System.out.println("El valor en la posición " + modArray + " ha sido modificado");
					
				}
				
			}
			
			//seleccion 2
			
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
			
			if (seleccionPrincipal == 2) {
				
				System.out.println("\n1) Media de los valores no núlos");
				System.out.println("2) Suma todos los valores");
				System.out.println("3) Número maximo del array");
				System.out.println("4) Número minimo del array");
				
				
				int seleccion2 = reader.nextInt();
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				if (seleccion2 == 1) {
					
					
					for (int z = 0; z < array.length; z++) {
						
						totales += array[z] ;
						
						if (array[z] > 0 || array[z] < 0) {
							
							 numerosNoNulos++;
						}
					}
					
					System.out.println("La media es "+ (totales/numerosNoNulos));
					
				}
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				else if (seleccion2 == 2) {
					
					for (int z = 0; z < array.length; z++) {
						
						totales += array[z];
						
					}
					
					System.out.println("La suma total es: " + totales);
					
				}
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				else if (seleccion2 == 3 ) {
					
					for (int z = 0; z < array.length; z++) {
						
						if (array[z] > valorMax) {
							
							valorMax = array[z];
							
						}
					}
					
					System.out.println("El valor maximo es " + valorMax);
				}
				
/// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
				
				else if (seleccion2 == 4 ) {
					
					for (int z = 0; z < array.length; z++) {
						
						if (array[z] < valorMin) {
							
							valorMin = array[z];
							
						}
					}
					
					System.out.println("El valor minimo es " + valorMin);
					
				}
				
			}
			
			//seleccion 3
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
			
			if (seleccionPrincipal == 3) {
				
				System.out.println("Intrudozca un valor mayor a " + cantidad + " para ampliar la cantidad de números en el array:");
				
				cantidad = reader.nextInt();
				
				System.out.println("La nueva cantidad maxima del array es: "+ cantidad);
			}
			
			
			if (seleccionPrincipal == 4) {
				
				i = -2;
			}
			
		}
		
		System.out.println("Programa finalizado");
	}

}