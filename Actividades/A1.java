import java.util.Scanner;
public class A1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		//ejercicio 1
		System.out.println("buenos días");

		//ejercicio 2
		int L = 3;
		System.out.println("El area de un cuadrado de lado 3 es: "+L*L);
		
		//ejercicio 3
		Scanner reader = new Scanner(System.in);
		System.out.print("introduce el lado de un cuadrado para sacar el area: ");
		int lado = reader.nextInt();
		System.out.println("El area del cuadrado es "+lado*lado);
		
		//ejercicio 4
		System.out.print("introduce dos números: ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		System.out.print("La multiplicación de los números es: "+num1*num2);
	}
	
	

}
