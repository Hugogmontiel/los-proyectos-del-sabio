import java.util.Scanner;
public class a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		
		
		//actividad 1
		System.out.println("\nActividad 1\n");
		
		System.out.print("Escriba una cadena de texto: ");
		String texto1 = reader.nextLine();
		
		String[] palabras = texto1.split(" ");
		
		for(String palabra : palabras) {
			System.out.println(palabra);
		
		}
		
		//actividad 2
		System.out.println("\nActividad 2\n");
		
		System.out.print("Escriba una cadena de texto: ");
		String texto2 = reader.nextLine();
		
		System.out.print("Escriba una cadena de texto: ");
		String texto2_1 = reader.nextLine();
		
		if(texto2.equals(texto2_1)) {
			System.out.println("Son identicos");
		}
		
		else if (texto2.equalsIgnoreCase(texto2_1)) {
			System.out.println("Son iguales ignorando mayusculas y minusculas");
		}
		
		else {
			System.out.println("No son iguales");
		}
		
		//actividad 3
		System.out.println("\nActividad 3\n");
		
		System.out.print("Escriba un nombre: ");
		String texto3 = reader.nextLine();
		
		System.out.print("Escriba un apellido: ");
		String texto3_1 = reader.nextLine();
		
		System.out.print("Escriba otro apellido: ");
		String texto3_2 = reader.nextLine();
		
		for(int i = 0; i < 3; i++) {
			System.out.print(texto3.toUpperCase().charAt(i));
			
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(texto3_1.toUpperCase().charAt(i));
			
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(texto3_2.toUpperCase().charAt(i));
			
		}
		
		//actividad 4
		System.out.println("\nActividad 4\n");
		
		System.out.println("Escribe una oración: ");
		String texto4 = reader.nextLine();
		
		int nA = 0;
		int nE = 0;
		int nI = 0;
		int nO = 0;
		int nU = 0;
		
		char a [] = texto4.toCharArray();
		
		for (int i = 0; i < texto4.length(); i++) {
	
				if (texto4.equalsIgnoreCase("a")) {
				nA++;
			}
			
			else if (texto4.equalsIgnoreCase("e")) {
				nE++;
			}
			
			else if (texto4.equalsIgnoreCase("i")) {
				nI++;
			}
			
			else if (texto4.equalsIgnoreCase("o")) {
				nO++;
			}
			
			else if (texto4.equalsIgnoreCase("u")) {
				nU++;
			}
		}
		
		System.out.println("Número de A: "+ nA);
		System.out.println("Número de E: "+ nE);
		System.out.println("Número de I: "+ nI);
		System.out.println("Número de O: "+ nO);
		System.out.println("Número de U: "+ nU);
	}
}
