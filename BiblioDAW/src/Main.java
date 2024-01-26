import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca jadoBiblio = new Biblioteca(50);
		jadoBiblio.setNombre("Biblioteca Jado");
		jadoBiblio.setDireccion("Paseo de General Davila, 73");
		jadoBiblio.setTelefono("942-33-33-33");
		jadoBiblio.setEmail("bibliotecajado@santander.com");
		jadoBiblio.setHorario("9H a 20H");
		
		Libro l1 = new Libro("El se�or de los anillos", 532, "JRR Tolkien",
				"Fantasia", "Minotauro", "EDSLA001", 1945);
		Libro l2 = new Libro("Las Dos Torres", 567, "JRR Tolkien",
				"Fantasia", "Minotauro", "EDSLA002", 1947);
		Libro l3 = new Libro("El Retorno del Rey", 589, "JRR Tolkien",
				"Fantasia", "Minotauro", "EDSLA003", 1950);
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el titulo del libro: ");
		String titulo = reader.nextLine();
		
		System.out.println("Inserte el Autor del libro: ");
		String autor = reader.nextLine();
		
		System.out.println("Inserte la editorial del libro: ");
		String editorial = reader.nextLine();
		
		System.out.println("Inserte el ISNB del libro: ");
		String ISBN = reader.nextLine();
		
		System.out.println("Inserte el genero del libro: ");
		String genero = reader.nextLine();
		
		System.out.println("Inserte el numero de paginas del libro: ");
		int nPaginas = reader.nextInt();
		
		System.out.println("Inserte el a�o de publicacion del libro: ");
		int aPublicacion = reader.nextInt();
		
		Libro l4 = new Libro(titulo,nPaginas, autor, genero, editorial, ISBN, aPublicacion);
		
		if(jadoBiblio.insertarLibro(l1) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l2) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}

		jadoBiblio.mostrarInfoBiblioteca();
		
		jadoBiblio.eliminarLibro(l3);
		
		jadoBiblio.mostrarInfoBiblioteca();
		
		jadoBiblio.eliminarLibro(l1);
		
		jadoBiblio.mostrarInfoBiblioteca();
				

		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		jadoBiblio.mostrarInfoBiblioteca();

	}

}
