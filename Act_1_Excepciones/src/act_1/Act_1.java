package act_1;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Act_1 {

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
	}
}
