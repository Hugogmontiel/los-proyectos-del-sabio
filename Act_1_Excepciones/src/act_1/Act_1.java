package act_1;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Act_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un valor númerico entero para A");
		
		Scanner reader = new Scanner (System.in);
		
		try {
			int a = reader.nextInt();
			
		}
		
		catch (InputMismatchException e) {
			System.out.println("Error, valor incorrecto para A");
			
		}
		
		
	}

}
