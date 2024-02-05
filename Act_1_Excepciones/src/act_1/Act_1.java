package act_1;

import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Act_1 {
	
	public static void imprimePositivo(int p) throws NumeroNegativoException {
		
		if(p < 0) {
			throw new NumeroNegativoException();
			
		}
	}
	
	public static void imprimeNegativo(int n) throws NumeroPositivoException {
		
		if(n > 0) {
			throw new NumeroPositivoException();
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio 1
		
		System.out.println("\nEjercicio 1\n");
		
		
		
		Scanner reader = new Scanner (System.in);
		
		try {
			
			System.out.println("Introduzca un valor númerico entero para A");
			int a = reader.nextInt();
			
		}
		
		catch (InputMismatchException e) {
			System.out.println("Valor introducido incorrecto");
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("Ejercicio 1 terminado");
		}
	
		
		
		//ejercicio 2
		
		System.out.println("\nEjercicio 2\n");
		
		
		
		try {
			reader = new Scanner(System.in);
			System.out.println("Introduzca un numerador: ");
			int a = reader.nextInt();
			System.out.println("Introduzca un denominador: ");
			int b = reader.nextInt();
			
			int resultado = a/b;
			System.out.println(resultado);
		}
		catch (ArithmeticException e){
			System.out.println("Error, no se puede dividir entre 0");
			e.printStackTrace();
			
		}
		catch (InputMismatchException e) {
			System.out.println("Error, Introduzca un número");
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("Ejercicio 2 terminado");
		}
		
		//ejercicio 3
		
		System.out.println("\nEjercicio 3\n");
		Double [] vector = new Double[5];
		for(int i = 0; i < vector.length; i++) {
		
		
			try {
				System.out.println("Introduzca número");
				reader = new Scanner(System.in);
				vector[i] = reader.nextDouble();
			}
				
			
			
		
			catch (InputMismatchException e) {
				System.out.println("Error, Introduzca un número");
				i--;
				e.printStackTrace();
			}
		}
		
		
			for(int i = 0; i < vector.length; i++) {
				System.out.println(vector[i]);
			
		}
			
		//ejercicio 4
			
			System.out.println("\nEjercicio 4\n");
			for(int i = 0; i < 1; i++) {
				try {
					System.out.println("Introduzca un número positivo");
					reader = new Scanner(System.in);
					int p = reader.nextInt();
					imprimePositivo(p);
				
				}
				catch(NumeroNegativoException e) {
					System.out.println("Error, introduzca un número positivo");
					e.printStackTrace();
				
				}
			
				catch(InputMismatchException e) {
					System.out.println("Error, introduzca un número");
					e.printStackTrace();
				
				}
			
				finally {
					System.out.println("Introduzca un número negativo: ");
				
				}
			
				try {
					reader = new Scanner(System.in);
					int n = reader.nextInt();
					imprimeNegativo(n);
				}
				catch (NumeroPositivoException e) {
					System.out.println("Error, introduzca un número negativo");
					e.printStackTrace();
				
				}
			
				catch (InputMismatchException e) {
					System.out.println("Error, introduzca un número");
					e.printStackTrace();
				
				}
			}
			
		//ejercicio 5
			System.out.println("\nEjercicio 5\n");
			
			
			try {
				Gato gato = new Gato();
				gato.setNombre("Leo");
				gato.setEdad(2);
				System.out.println(gato.imprimir());
				
				Gato gatoError = new Gato();
				gatoError.setNombre("Leo");
				gatoError.setEdad(-1);
				System.out.println(gatoError.imprimir());
			}
			
			catch (NombreLongitudException e) {
				System.out.println("Error, nombre de longitud de menos de 3 letras");
				e.printStackTrace();
			}
			
			catch (EdadException e) {
				System.out.println("Error, edad negativa");
				e.printStackTrace();	
			}
			
			catch (InputMismatchException e) {
				System.out.println("Error, valor incorrecto");
				e.printStackTrace();
			}
			
				
			
				
				
			
			
	
	
		//ejercicio 6
			System.out.println("\nEjercicio 6\n");
				
			ArrayList<Gato> g = new ArrayList<Gato>();
			
			boolean error = false;
			
			for(int i = 0; i < 5; i ++) {
				try {
					Gato gatu = new Gato();
					reader = new Scanner(System.in);
					error = false;
					
					System.out.println("Introduzca un nombre para un gato (3 letras o más)");
					String nombre = reader.nextLine();
					gatu.setNombre(nombre);
									
					System.out.println("Introduzca una edad para un gato (que no sea negativa)");
					int edad = reader.nextInt();
					reader.nextLine();
					gatu.setEdad(edad);
					
					g.add(gatu);
					
				
				}
			
				catch (NombreLongitudException e) {
					System.out.println("Error, nombre de longitud de menos de 3 letras");
					error = true;
					e.printStackTrace();
					i--;
				}
			
				catch (EdadException e) {
					System.out.println("Error, edad negativa");
					error = true;
					e.printStackTrace();
					i--;
				}
			
				catch (InputMismatchException e) {
					System.out.println("Error, valor incorrecto");
					error = true;
					e.printStackTrace();
					i--;
				}
			}
			
			
			if(error == false) {
				for (int i = 0; i < g.size(); i++) {
					System.out.println(g.get(i).imprimir());
				}				
			}
			
		
			
			
			
	}
}
