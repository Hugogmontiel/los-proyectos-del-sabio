package herencia_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		Astros [] a = new Astros [10];
		
		Satelites s = new Satelites(10000000, 4200.00, 50000, 120000, 40000.00, 700000, 60000, " Tierra");
		Planetas p = new Planetas(50000000, 45000.00, 100000, 240000, 60000.00, 800000, true, true);
		Planetas p1 = new Planetas(50000000, 45000.00, 100000, 240000, 60000.00, 800000, true, true);
		
		a[0] = s;
		a[1] = p;
		a[2] = p1;
		
		boolean bucle = true;
		
		while (bucle == true) {
			
			System.out.println("1) Luna");
			System.out.println("2) Tierra");
			System.out.println("3) Marte");
			System.out.println("4) Salir");
			
			String opcion = reader.nextLine();
			
			if (opcion.equalsIgnoreCase("1")) {
				a[0].mostrarAstro();
				
			}
			
			else if (opcion.equalsIgnoreCase("2")) {
				a[1].mostrarAstro();
				
			}
			
			else if (opcion.equalsIgnoreCase("3")) {
				a[2].mostrarAstro();
				
			}
			
			else if (opcion.equalsIgnoreCase("4")) {
				bucle = false;
				
			}
		
		}
		
		System.out.println("Programa finalizado");
			
	}

}
