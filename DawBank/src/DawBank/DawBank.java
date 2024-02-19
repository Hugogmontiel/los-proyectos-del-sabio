package DawBank;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DawBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
		Scanner reader = new Scanner(System.in);
		CuentaBancaria[] BancoDaw = new CuentaBancaria [5];
		
		for (int i = 0; i < BancoDaw.length; i++) {
		    BancoDaw[i] = new CuentaBancaria();
		    
		}
		
		
		boolean infiniteLoop_1 = true;
		
		int variableParaMenuCuenta = 0;
		int variableParaMenuInfo = 0;
		int variableParaMenuInfo_2 = 0;
		
		while (infiniteLoop_1 == true) {
			System.out.println("\n1) Insertar información de una cuenta");
			System.out.println("2) Ver información de las cuentas");
			System.out.println("3) Salir");
			
			String seleccionMenu = reader.nextLine();
			
			if(seleccionMenu.equalsIgnoreCase("1")) {
				
				if (BancoDaw[0].getCliente() == null) {
					try {
				    System.out.println("No tiene ninguna cuenta añadida: ");
				    System.out.println("Introduzca nombre de la cuenta: ");
				    String nombre = reader.nextLine();

				    System.out.println("Introduzca DNI del cliente: ");
				    String dni = reader.nextLine();
				    
				    System.out.println("Introduzca fecha de nacimiento (Formato DD-MM-YYYY): ");
				    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				    String fechaNacimientoStr = reader.nextLine();
				    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, format);
				    
				    System.out.println("Introduzca número de teléfono: ");
				    String telefono = reader.nextLine();

				    System.out.println("Introduzca el correo electrónico: ");
				    String email = reader.nextLine();

				    System.out.println("Introduzca dirección: ");
				    String direccion = reader.nextLine();
				    
				    Cliente clienteNuevo = new Cliente(nombre, dni, fechaNacimiento, telefono, email, direccion);
				    BancoDaw[variableParaMenuCuenta].setCliente(clienteNuevo);
				    variableParaMenuCuenta++;
					}
				    catch(DateTimeParseException e) {
				    	System.out.println("Error: " + e.getMessage());
						e.printStackTrace();
				    }
				    
				}
				

				
			boolean infiniteLoop_2 = true;
			System.out.println("\nSeleccione una cuenta para modificar sus datos:\n");
			
			while (infiniteLoop_2 == true ) {
				for(int i = 0; i < BancoDaw.length; i++) {
					
					
					/////////////////////////////////////
					
					if(BancoDaw[i].getCliente() == null) {
						
						
					}
					////////////////////////////////////	
						
					
					if(BancoDaw[i].getCliente() != null) {
						
					System.out.println((i + 1) + ") " + BancoDaw[i].getCliente());
					variableParaMenuInfo = i;
					
					}
				}
				
	
				
				if(variableParaMenuCuenta < BancoDaw.length) {
					System.out.println((variableParaMenuInfo + 2) + ") Insertar otra cuenta");
					System.out.println((variableParaMenuInfo + 3)+ ") Salir");
					
				}
				
				else if (variableParaMenuCuenta >= BancoDaw.length) {
					System.out.println((variableParaMenuInfo + 2)+ ") Salir");
				}
				
				
				
				int seleccionSubMenu = reader.nextInt();
				reader.nextLine();
				
				if (seleccionSubMenu <= variableParaMenuInfo + 1) {
					
					if (BancoDaw[seleccionSubMenu - 1].getIBAN() == null) {
						System.out.println("Inserta el valor de IBAN (Ejemplo IBAN ES9121000418450200051332): ");
						
						String IBAN = reader.nextLine();

						if (IBANValidator(IBAN)) {
							BancoDaw[seleccionSubMenu - 1].setIBAN(IBAN);
							System.out.println("Formato IBAN correcto");
							
						}
						
						else {
							System.out.println("IBAN no valido, porfavor utiliza en formato correcto");
							
						}
					
					}
					
					System.out.println("\nEl saldo es de: "+ BancoDaw[seleccionSubMenu - 1].getSaldo());
					
					System.out.println("Inserta un movimiento: ");
					
					System.out.println("ID: ");
					
					int ID = reader.nextInt();
					reader.nextLine();
					
					System.out.println("Fecha (Formato DD-MM.YYYY hh:mm): ");
					
					String fe = reader.nextLine();
					
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
					
					LocalDateTime fecha = LocalDateTime.parse(fe, format);
					
					System.out.println("Tipo (RETIRADA o INGRESO)");
					
					Tipo tipo = null;
					
					String Tipo_1 = reader.nextLine();
					
					if (Tipo_1.equalsIgnoreCase("RETIRADA")) {
						tipo = Tipo.RETIRADA;
						
					}
					
					if(Tipo_1.equalsIgnoreCase("INGRESO")) {
						tipo = Tipo.INGRESO;
						
					}
					
					
					
					System.out.println("Inserta cantidad de: " + tipo);
					
					Double cantidad = reader.nextDouble();
					reader.nextLine();

					Double saldo = BancoDaw[seleccionSubMenu - 1].getSaldo();
					
					if(tipo == tipo.INGRESO) {
						BancoDaw[seleccionSubMenu - 1].setSaldo((saldo + cantidad));
						
					}
					
					if (tipo == tipo.RETIRADA) {
						BancoDaw[seleccionSubMenu - 1].setSaldo((saldo - cantidad));
						
					}
					try {
						BancoDaw[seleccionSubMenu - 1].addMovimiento(ID, fecha, tipo, cantidad);
					} 
					catch (CuentaException e) {
						System.out.println("Error: " + e.getMessage());
						e.printStackTrace();
					}
					catch(AvisarHaciendaException e) {
						System.out.println("Error: " + e.getMessage());
						e.printStackTrace();
					}
					
					
					
					
					
				}
				
				if (seleccionSubMenu == variableParaMenuInfo + 2 && variableParaMenuInfo < BancoDaw.length) {
					
					try {
					    
					    System.out.println("Introduzca nombre de la cuenta: ");
					    String nombre = reader.nextLine();

					    System.out.println("Introduzca DNI del cliente: ");
					    String dni = reader.nextLine();
					    
					    System.out.println("Introduzca fecha de nacimiento (Formato DD-MM-YYYY): ");
					    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					    String fechaNacimientoStr = reader.nextLine();
					    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, format);
					    
					    System.out.println("Introduzca número de teléfono: ");
					    String telefono = reader.nextLine();

					    System.out.println("Introduzca el correo electrónico: ");
					    String email = reader.nextLine();

					    System.out.println("Introduzca dirección: ");
					    String direccion = reader.nextLine();
					    
					    Cliente clienteNuevo = new Cliente(nombre, dni, fechaNacimiento, telefono, email, direccion);
					    BancoDaw[variableParaMenuCuenta].setCliente(clienteNuevo);
					    variableParaMenuCuenta++;
						}
					    catch(DateTimeParseException e) {
					    	System.out.println("Error: " + e.getMessage());
							e.printStackTrace();
					    }
					    
					}

				if (seleccionSubMenu == variableParaMenuInfo + 3) {
					infiniteLoop_2 = false;
					
				}
				
				if (seleccionSubMenu == variableParaMenuInfo + 2 && variableParaMenuInfo >= BancoDaw.length) {
					infiniteLoop_2 = false;
					
				}
				
			}
				
			} //MENU PRINCIPAL INSERTAR INFORMACION
			
			if(seleccionMenu.equalsIgnoreCase("2")) {
			
				for(int i = 0; i < BancoDaw.length; i++) {
					
					if(BancoDaw[i].getCliente() != null) {
						System.out.println((i + 1) + ") " + BancoDaw[i].getCliente());
					
					}
					
				}
				
			int seleccionSubMenu = reader.nextInt();
				reader.nextLine();
				
			if (seleccionSubMenu <= variableParaMenuInfo + 1) {
					
				if(BancoDaw[seleccionSubMenu - 1].getSaldo() <= -50.00) {
					System.out.println("Cuidado saldo por debajo de -50.00");
					
				}
				
				BancoDaw[seleccionSubMenu - 1].MostrarInfoCuentaBancaria();
				
			
			}
				
				
				
			}//MENU PRINCIPAL MOSTRAR INFORMACION
				
			
			
			if(seleccionMenu.equalsIgnoreCase("3")) {
				infiniteLoop_1 = false;
			}
		}
		
		}
		
		
		
	
	
    public static boolean IBANValidator(String IBAN) {
        boolean isFormatOk = false;
        String regex = "[A-Z]{2}\\d{22}$";
        return IBAN.matches(regex);
    }
    
}



