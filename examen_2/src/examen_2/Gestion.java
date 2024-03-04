package examen_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		String selector = "";
		
		boolean informacionEmpresa = false;
		int numeroDeTrabajadores = 0;
		
		//booleanos para asegurar limite en cada gerente/director
		
		boolean director = false;
		boolean gerenteInf = false;
		boolean gerenteGes = false;
		boolean gerenteMark = false;
		
		String nombreEmpresa = "";
		String CIF = "";
		LocalDate fechaInaguracion = null;
		
		
		do {
		informacionEmpresa = true;
		System.out.println("No tiene una empresa registrada, registre una");
		
		System.out.println("Introduzca el nombre de la empresa");
		nombreEmpresa = reader.nextLine();
		
		System.out.println("Introduzca el CIF de la empresa");
		CIF = reader.nextLine();
		try {
			System.out.println("Introduzca la fecha de inaguración de la empresa (dd-MM-yyyy)");
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    	String fechaInaguracionString = reader.nextLine();
	    	fechaInaguracion = LocalDate.parse(fechaInaguracionString, format);
	    	
		}
		catch (DateTimeParseException ex) {
			System.out.print("El error es: "); 
			ex.getErrorIndex();
			ex.printStackTrace();
			informacionEmpresa = false;
		}	
		
		}
		while(informacionEmpresa == false);
		Empresa e = new Empresa(nombreEmpresa, CIF, fechaInaguracion);
		
		do {
			System.out.println("1) Registrar trabajador");
			System.out.println("2) Mostrar información general empresa");
			System.out.println("3) Mostrar número de trabajadores actuales y organigrama empresa");
			System.out.println("4) Mostrar información de un departamento");
			System.out.println("5) Eliminar trabajador");
			System.out.println("6) Agenda director");
			System.out.println("7) Salir");
			
			selector = reader.nextLine();
		
			if(selector.equalsIgnoreCase("1")) {
				System.out.println("1) Registrar director");
				System.out.println("2) Registrar gerenteDep");
				System.out.println("3) Registrar trabajador");
				
				String selectorSub1 = reader.nextLine();
				
				if(selectorSub1.equalsIgnoreCase("1")) {
					if(director == false) {
						boolean informacionCorrecta = true;
						try {
						
						System.out.println("Introduzca nombre: ");
						String nombre = reader.nextLine();
						
						System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
						DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				    	String fechaNacimientoString = reader.nextLine();
				    	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, format);
					
				    	System.out.println("Introduzca el DNI (12345678W): ");
				    	String DNI = reader.nextLine();
				    	
				    	System.out.println("Introduzca la direccion: ");
				    	String direccion = reader.nextLine();
				    	
				    	System.out.println("Introduzca número de la seguridad social: ");
				    	String numeroSS = reader.nextLine();
				    	
				    	System.out.println("Introduzca el email de la empresa");
				    	String email = reader.nextLine();
				    	
				    	System.out.println("Introduzca el salario (double): ");
				    	double salario = reader.nextDouble();
				    	reader.nextLine();
				    	
				    	System.out.println("Introduzca el departamento (Informatica, Gestion, Marketing)");
				    	String departamentoString = reader.nextLine();
				    	Departamento departamento = null;
				    	if(departamentoString.equalsIgnoreCase("Informatica")) {
				    		departamento = Departamento.Informatica;
				    	}
				    	else if(departamentoString.equalsIgnoreCase("Gestion")) {
				    		departamento = Departamento.Gestion;
				    	}
				    	else if(departamentoString.equalsIgnoreCase("Marketing")) {
				    		departamento = Departamento.Marketing;
				    	}
				    	
				    	else {
				    		departamento = Departamento.Informatica;
				    		System.out.println("No has escogido ninguna opcion asi que se ha escogido automaticamente la opcion de informatica");
				    	}
				    	
				    	System.out.println("Esta o no esta en la oficina (true o false)"); 
				    	boolean estarEnOficina = reader.nextBoolean();
				    	reader.nextLine();
				    	
				    	System.out.println("Introduzca el número de telefono: ");
				    	String nTelefono = reader.nextLine();
				    	
				    	System.out.println("Esta o no esta reunido (true o false): ");
				    	boolean estaReunido = reader.nextBoolean();
				    	reader.nextLine();
				    	
				    	System.out.println("Esta o no esta fuera de oficina (true o false): ");
				    	boolean fueraOficina = reader.nextBoolean();
				    	reader.nextLine();
				    	
				    	Director d1 = new Director (nombre, fechaNacimiento, DNI, direccion, numeroSS, email, salario, departamento, estarEnOficina, nTelefono, estaReunido, fueraOficina);
				    	e.registrarDirector(d1);
						}
						catch (InputMismatchException ex) {
							System.out.println("El error es: ");
							ex.printStackTrace();
							informacionCorrecta = false;
							reader.nextLine();
						}
						catch (DateTimeParseException ex) {
							System.out.print("El error es: "); 
							ex.getErrorIndex();
							ex.printStackTrace();
							informacionCorrecta = false;
						}
						if(informacionCorrecta == true) {
							director = true;
							numeroDeTrabajadores++;
						}
					}
					
				}
				
				if(selectorSub1.equalsIgnoreCase("2")) {
					System.out.println("1) Gerente informatica");
					System.out.println("2) Gerente gestion");
					System.out.println("3) Gerente Marketing");
					String selectorSub2 = reader.nextLine();
					
					if(selectorSub2.equalsIgnoreCase("1")) {
						if(gerenteInf == false) {
							boolean informacionCorrecta = true;
							try {
							
							System.out.println("Introduzca nombre: ");
							String nombre = reader.nextLine();
							
							System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
							DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					    	String fechaNacimientoString = reader.nextLine();
					    	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, format);
						
					    	System.out.println("Introduzca el DNI(12345678W): ");
					    	String DNI = reader.nextLine();
					    	
					    	System.out.println("Introduzca la direccion: ");
					    	String direccion = reader.nextLine();
					    	
					    	System.out.println("Introduzca número de la seguridad social: ");
					    	String numeroSS = reader.nextLine();
					    	
					    	System.out.println("Introduzca el email de la empresa");
					    	String email = reader.nextLine();
					    	
					    	System.out.println("Introduzca el salario (double): ");
					    	double salario = reader.nextDouble();
					    	reader.nextLine();
					    	
					    	Departamento departamento = Departamento.Informatica;
					    
					    	System.out.println("Esta o no esta en la oficina (true o false)"); 
					    	boolean estarEnOficina = reader.nextBoolean();
					    	reader.nextLine();
					    	
					    	System.out.println("Introduzca el número de telefono: ");
					    	String nTelefono = reader.nextLine();
					    	
					    	GerenteDep g1 = new GerenteDep (nombre, fechaNacimiento, DNI, direccion, numeroSS, email, salario, departamento, estarEnOficina,numeroDeTrabajadores ,nTelefono);
					    	e.registrarGerente(g1);
					    	
							}
							catch (InputMismatchException ex) {
								System.out.println("El error es: ");
								ex.printStackTrace();
								informacionCorrecta = false;
								reader.nextLine();
							}
							catch (DateTimeParseException ex) {
								System.out.print("El error es: "); 
								ex.getErrorIndex();
								ex.printStackTrace();
								informacionCorrecta = false;
								
							}
							if(informacionCorrecta == true) {
								gerenteInf = true;
								numeroDeTrabajadores++;
							
							}
					
						}
					}
					if(selectorSub2.equalsIgnoreCase("2")) {
						if(gerenteGes == false) {
							boolean informacionCorrecta = true;
							try {
							
							System.out.println("Introduzca nombre: ");
							String nombre = reader.nextLine();
							
							System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
							DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					    	String fechaNacimientoString = reader.nextLine();
					    	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, format);
						
					    	System.out.println("Introduzca el DNI (12345678W): ");
					    	String DNI = reader.nextLine();
					    	
					    	System.out.println("Introduzca la direccion: ");
					    	String direccion = reader.nextLine();
					    	
					    	System.out.println("Introduzca número de la seguridad social: ");
					    	String numeroSS = reader.nextLine();
					    	
					    	System.out.println("Introduzca el email de la empresa");
					    	String email = reader.nextLine();
					    	
					    	System.out.println("Introduzca el salario (double): ");
					    	double salario = reader.nextDouble();
					    	reader.nextLine();
					    	
					    	Departamento departamento = Departamento.Gestion;
					    
					    	System.out.println("Esta o no esta en la oficina (true o false)"); 
					    	boolean estarEnOficina = reader.nextBoolean();
					    	reader.nextLine();
					    	
					    	System.out.println("Introduzca el número de telefono: ");
					    	String nTelefono = reader.nextLine();
					    	
					    	GerenteDep g1 = new GerenteDep (nombre, fechaNacimiento, DNI, direccion, numeroSS, email, salario, departamento, estarEnOficina,numeroDeTrabajadores ,nTelefono);
					    	e.registrarGerente(g1);
					    	
							}
							catch (InputMismatchException ex) {
								System.out.println("El error es: ");
								ex.printStackTrace();
								informacionCorrecta = false;
								reader.nextLine();
							}
							catch (DateTimeParseException ex) {
								System.out.print("El error es: "); 
								ex.getErrorIndex();
								ex.printStackTrace();
								informacionCorrecta = false;
								
							}
							if(informacionCorrecta == true) {
								gerenteGes = true;
								numeroDeTrabajadores++;
							
							}
					
						}
					}
					if(selectorSub2.equalsIgnoreCase("3")) {
						if(gerenteMark == false) {
							boolean informacionCorrecta = true;
							try {
							
							System.out.println("Introduzca nombre: ");
							String nombre = reader.nextLine();
							
							System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
							DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					    	String fechaNacimientoString = reader.nextLine();
					    	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, format);
						
					    	System.out.println("Introduzca el DNI (12345678W): ");
					    	String DNI = reader.nextLine();
					    	
					    	System.out.println("Introduzca la direccion: ");
					    	String direccion = reader.nextLine();
					    	
					    	System.out.println("Introduzca número de la seguridad social: ");
					    	String numeroSS = reader.nextLine();
					    	
					    	System.out.println("Introduzca el email de la empresa");
					    	String email = reader.nextLine();
					    	
					    	System.out.println("Introduzca el salario (double): ");
					    	double salario = reader.nextDouble();
					    	reader.nextLine();
					    	
					    	Departamento departamento = Departamento.Marketing;
					    
					    	System.out.println("Esta o no esta en la oficina (true o false)"); 
					    	boolean estarEnOficina = reader.nextBoolean();
					    	reader.nextLine();
					    	
					    	System.out.println("Introduzca el número de telefono: ");
					    	String nTelefono = reader.nextLine();
					    	
					    	GerenteDep g1 = new GerenteDep (nombre, fechaNacimiento, DNI, direccion, numeroSS, email, salario, departamento, estarEnOficina,numeroDeTrabajadores ,nTelefono);
					    	e.registrarGerente(g1);
					    	
							}
							catch (InputMismatchException ex) {
								System.out.println("El error es: ");
								ex.printStackTrace();
								informacionCorrecta = false;
								reader.nextLine();
							}
							catch (DateTimeParseException ex) {
								System.out.print("El error es: "); 
								ex.getErrorIndex();
								ex.printStackTrace();
								informacionCorrecta = false;
								
							}
							if(informacionCorrecta == true) {
								gerenteMark = true;
								numeroDeTrabajadores++;
							
							}
					
						}
					}
					
				}//menu gerentes
				
				if(selectorSub1.equalsIgnoreCase("3")) {
					
						boolean informacionCorrecta = true;
						try {
						
						System.out.println("Introduzca nombre: ");
						String nombre = reader.nextLine();
						
						System.out.println("Introduzca fecha de nacimiento(dd-MM-yyyy): ");
						DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				    	String fechaNacimientoString = reader.nextLine();
				    	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, format);
					
				    	System.out.println("Introduzca el DNI (12345678W): ");
				    	String DNI = reader.nextLine();
				    	
				    	System.out.println("Introduzca la direccion: ");
				    	String direccion = reader.nextLine();
				    	
				    	System.out.println("Introduzca número de la seguridad social: ");
				    	String numeroSS = reader.nextLine();
				    	
				    	System.out.println("Introduzca el email de la empresa");
				    	String email = reader.nextLine();
				    	
				    	System.out.println("Introduzca el salario (double): ");
				    	double salario = reader.nextDouble();
				    	reader.nextLine();
				    	
				    	System.out.println("Introduzca el departamento (Informatica, Gestion, Marketing)");
				    	String departamentoString = reader.nextLine();
				    	Departamento departamento = null;
				    	if(departamentoString.equalsIgnoreCase("Informatica")) {
				    		departamento = Departamento.Informatica;
				    	}
				    	else if(departamentoString.equalsIgnoreCase("Gestion")) {
				    		departamento = Departamento.Gestion;
				    	}
				    	else if(departamentoString.equalsIgnoreCase("Marketing")) {
				    		departamento = Departamento.Marketing;
				    	}
				    	
				    	else {
				    		departamento = Departamento.Informatica;
				    		System.out.println("No has escogido ninguna opcion asi que se ha escogido automaticamente la opcion de informatica");
				    	}
				    	
				    	System.out.println("Esta o no esta en la oficina (true o false)"); 
				    	boolean estarEnOficina = reader.nextBoolean();
				    	reader.nextLine();
				    	
				    	
				    	Trabajador t1 = new Trabajador (nombre, fechaNacimiento, DNI, direccion, numeroSS, email, salario, departamento, estarEnOficina);
				    	e.registrarTrabajador(t1);
				    	
						}
						catch (InputMismatchException ex) {
							System.out.println("El error es: ");
							ex.printStackTrace();
							informacionCorrecta = false;
							reader.nextLine();
						}
						catch (DateTimeParseException ex) {
							System.out.print("El error es: "); 
							ex.getErrorIndex();
							ex.printStackTrace();
							informacionCorrecta = false;
						}
						if(informacionCorrecta == true) {
							numeroDeTrabajadores++;
							
						}
					
					
				}//Trabajadores
				
			}//opcion 1 principal
			
			if(selector.equalsIgnoreCase("2")) {
				System.out.println(e.toString());
				
			}//opcion 2 principal
			
			if(selector.equalsIgnoreCase("3")) {
				System.out.println(numeroDeTrabajadores);
				e.mostrarInformacionTrabajadores();
				
			}//opcion 3 principal
			
			if(selector.equalsIgnoreCase("4")) {
				System.out.println("Introduzca un departamento para ver a sus trabajadores: ");
				String departamento = reader.nextLine();
				
				
			}
			
			if(selector.equalsIgnoreCase("5")) {
				System.out.println("Introduzca un dni que quiera borrar: ");
				String DNI = reader.nextLine();
				
				e.eliminarTrabajador(DNI);
			}
			
			if(selector.equalsIgnoreCase("6")) {
				System.out.println("A) Reunion");
				System.out.println("B) Fuera de la Oficina");
				System.out.println("C) Convocar toda la empresa");
				
				String selectorSubMenu = reader.nextLine();
				
				if(selectorSubMenu.equalsIgnoreCase("A")) {
					try {
					GerenteDep g = new GerenteDep ("", null, "", "", "", "", null, null, false ,0 ,"");
					System.out.println("Introduzca el departamento (Informatica, Gestion, Marketing)");
			    	String departamentoString = reader.nextLine();
			    	Departamento departamento = null;
			    	if(departamentoString.equalsIgnoreCase("Informatica")) {
			    		departamento = Departamento.Informatica;
			    	}
			    	else if(departamentoString.equalsIgnoreCase("Gestion")) {
			    		departamento = Departamento.Gestion;
			    	}
			    	else if(departamentoString.equalsIgnoreCase("Marketing")) {
			    		departamento = Departamento.Marketing;
			    	}
			    	
			    	else {
			    		departamento = Departamento.Informatica;
			    		System.out.println("No has escogido ninguna opcion asi que se ha escogido automaticamente la opcion de informatica");
			    	}
					
			    	System.out.println("Introduzca fecha para la reunion(dd-MM-yyyy HH:mm): ");
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			    	String fechaString = reader.nextLine();
			    	LocalDateTime fecha = LocalDateTime.parse(fechaString, format);
			    	
					g.convocarReunionDepartamento(fecha, departamento);
					}
					
					catch(DateTimeParseException ex) {
						System.out.println("El error es: ");
						ex.printStackTrace();
						
					}
					
				}
				
				if(selectorSubMenu.equalsIgnoreCase("B")) {
					
					
				}
			}
		
			
			
				
			
		
	}//do
	
		while (!selector.equalsIgnoreCase("7"));
	}
	
	public static void dniValidator(String DNI) throws DNIException{
		String regex = "^d{8}//[A-Z]{1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(DNI);
		if(matcher.matches()) {
			
		}
		else {
			throw new DNIException();
		
		
		
		}
	}

}
