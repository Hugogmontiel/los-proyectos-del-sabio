package act_1;

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
			
		}
		catch (InputMismatchException e) {
			System.out.println("Error, Introduzca un número");
			
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
				
				}
			
				catch(InputMismatchException e) {
					System.out.println("Error, introduzca un número");
				
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
				
				}
			
				catch (InputMismatchException e) {
					System.out.println("Error, introduzca un número");
				
				}
			}
			
		//ejercicio 5
			System.out.println("\nEjercicio 5\n");
			
			Gato [] gato = new Gato[2];
			
			gato [0]= new Gato("",1);
				
			
			try {
				reader = new Scanner(System.in);
				System.out.println("Introduzca un nombre para un gato (3 letras o más)");
				gato[0].setNombre(reader.nextLine());					
				System.out.println("Introduzca una edad para un gato (que no sea negativa)");
				gato[0].setEdad(reader.nextInt());
				reader.nextLine();
				
			}
			
			catch (NombreLongitudException e) {
				System.out.println("Error, nombre de longitud de menos de 3 letras");
				
			}
			
			catch (EdadException e) {
				System.out.println("Error, edad negativa");
				
			}
			
			catch (InputMismatchException e) {
				System.out.println("Error, valor incorrecto");

			}
		
			System.out.println(gato[0].imprimir());
	}
}
