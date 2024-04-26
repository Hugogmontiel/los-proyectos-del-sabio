package examen;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int entero = 0;
		 char letra_1, letra_2;
		 boolean parar = 7 != 6;
		 String texto = "Hola Pepe";

		 System.out.println (texto.charAt(1));
		 double d2 = 10.002;
		 double d3 = 10.002D;
		 boolean seguir = 3 > 5;
		 int resultado = 20;

		 System.out.print("El resultado es" + (resultado + 5));
		 char letra = 'A';
		 letra++;
		 System.out.println(letra);
		 float f2 = 10.5f;
		 String nombre = "Pepe";

		 String apellido = "Martinez";

		 String todo = nombre + apellido;

		 System.out.println (todo);
		 
		 String texto1 = "Hola Pepe";

		 System.out.println (texto1.charAt(2));
		 
		 String nombre1 = " Hola Pepe";

		 String todo1 = nombre1.trim();

		 System.out.println (todo1);
		 int c = 5;
		 c += c;
		 System.out.println(c);
		 
		 int x = 3;

		 if(x == 3){

		    System.out.print("x es 3");

		    x = 2;

		 } else {

		   System.out.print("x no es 3");

		   x = 1;

		 }

		 System.out.print(x);
		 
		 int d = 5;
		 d -= d;
		 System.out.println(d);
	}

}
