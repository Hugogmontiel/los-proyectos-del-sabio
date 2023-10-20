import java.util.Scanner;

public class Prueba_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//prueba 1
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un número");
		int num1 = scanner.nextInt();
		System.out.print("Escribe otro número");
		int num2 = scanner.nextInt();
		
		int mayor = (num1>num2) ? num1 : num2;
		int menor = (num1<num2) ? num1 : num2;
		
		System.out.println("Número mayor: " + mayor);
		System.out.println("Número menor: " + menor);
		
		
		//prueba 2
		System.out.println("Prueba factoriales");
		
		int fact = scanner.nextInt();
		for (int x = fact - 1; x > 0 ; x--) {
		
			fact *= x;
		}
	
		
		
		System.out.println("El factorial es: " + fact);
	}

}
