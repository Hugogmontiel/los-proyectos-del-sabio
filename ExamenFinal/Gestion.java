import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa gestorEmpresa = new Empresa(20);
			
		Scanner reader = new Scanner(System.in);
		
		boolean validCIF = false;
		boolean bucleInfinito = true;
		
		while(validCIF == false) {
		
			System.out.println("Por favor introduzca: ");
				
				System.out.println("Nombre de la empresa: ");
				gestorEmpresa.setNombre(reader.nextLine());
		
			if(validCIF == false) {
			
				System.out.println("CIF de la empresa (EJ: A0123456789) : ");
				gestorEmpresa.setCIF(reader.nextLine());
		
				if(CIFValidator(gestorEmpresa.getCIF())) {
					System.out.println(gestorEmpresa.getCIF());
					validCIF = true;
				}
				
				else {
					System.out.println("No es el formato correcto");
					gestorEmpresa.setCIF(null);
			
				}
			}//CIF
		
		
			System.out.println("Fecha de fundacion de la empresa (YYYY-MM-DD): ");
			gestorEmpresa.setFechaFundacion(LocalDate.parse(reader.nextLine()));
		
		}//cierro bucle
		
		while (bucleInfinito == true) {
			
			System.out.println("1) Crear persona");
			System.out.println("2) Registrar trabajador en empresa");
			System.out.println("3) Mostrar información general de la empresa");
			System.out.println("4) Mostrar el número de trabajadores actuales");
			System.out.println("5) Mostrar información de todos los trabajadores");
			System.out.println("6) Eliminar trabajador de la empresa");
			System.out.println("7) Eliminar persona del programa");
			System.out.println("8) Salir de la aplciación");
			
			String menuPrincipal = reader.nextLine();
			
			if (menuPrincipal.equalsIgnoreCase("1")) {
				
				System.out.println("Nombre de la persona: ");
				
				String nombre = reader.nextLine();
				
				System.out.println("Fecha de nacimiento (YYYY-MM-DD): ");
				
				LocalDate fechaNacimiento = LocalDate.parse(reader.nextLine());
				
				System.out.println("DNI (Ej: 72221980W): ");
				
				String DNI = reader.nextLine();
				/*
				if(DNIValidator(DNI)) {
					System.out.println("Formato valido");
				}
				
				else {
					System.out.println("Formato invalido");
					DNI = "ERROR";
					
				}
				*/
				
				System.out.println("Direccion: ");
				
				String direccion = reader.nextLine();
				
				System.out.println("Número seguridad social (10 digitos): ");
				
				
				String numeroSS = reader.nextLine();
				/*
				if(SSValidator(numeroSS)) {
					System.out.println("Formato valido");
				}
				
				else {
					System.out.println("Formato invalido");
					numeroSS = "Formato incorrecto";
					
				}
				*/
				gestorEmpresa.nuevaPersona(nombre, fechaNacimiento, DNI, direccion, numeroSS);
				
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("2")) {
				
				gestorEmpresa.registrarTrabajador();
				
				
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("3")) {
				gestorEmpresa.mostrarInfoEmpresa();
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("4")) {
				gestorEmpresa.mostrarTrabajadoresActuales();
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("5")) {
				gestorEmpresa.mostrarInfoTrabajadores();
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("6")) {
				gestorEmpresa.eliminarTrabajadorEmpresa();
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("7")) {
				
				
			}
			
			if (menuPrincipal.equalsIgnoreCase("8")) {
				bucleInfinito = false;
			}
		}
		
	
	}

	
	public static boolean CIFValidator(String CIF) {
		boolean isCIFValid = false;
		String regex = "[A-Z]{1}\\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(CIF);
		if (matcher.matches()) {
        	isCIFValid = true;
        }
		return isCIFValid;
		
	}
	/*
	public static boolean DNIValidator(String DNI) {
		boolean isDNIValid = false;  
		String regex = "d{8}\\[A-Z]{1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(DNI);
		if (matcher.matches()) {
        	isDNIValid = true;
        }
		return isDNIValid;
	}
	
	public static boolean SSValidator(String numeroSS) {
		boolean isSSValid = false;  
		String regex = "d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numeroSS);
		if (matcher.matches()) {
        	isSSValid = true;
        }
		return isSSValid;		
	}
	*/
}
