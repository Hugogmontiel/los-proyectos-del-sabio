import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DawBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria[] BancoDaw = new CuentaBancaria [5];
		
		for (int i = 0; i < BancoDaw.length; i++) {
		    BancoDaw[i] = new CuentaBancaria();
		    
		}
		
		Scanner reader = new Scanner(System.in);
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
				
				if(BancoDaw[0].getTitular() == null) {
					System.out.println("No tiene ninguna cuenta añadida: ");
					System.out.println("Introduzca nombre de la cuenta: ");
					
					 BancoDaw[variableParaMenuCuenta].setTitular(reader.nextLine());
					 variableParaMenuCuenta++;
				}
				
			boolean infiniteLoop_2 = true;
			System.out.println("\nSeleccione una cuenta para modificar sus datos:\n");
			
			while (infiniteLoop_2 == true ) {
				for(int i = 0; i < BancoDaw.length; i++) {
					
					
					/////////////////////////////////////
					
					if(BancoDaw[i].getTitular() == null) {
						
						
					}
					////////////////////////////////////	
						
					
					if(BancoDaw[i].getTitular() != null) {
						
					System.out.println((i + 1) + ") " + BancoDaw[i].getTitular());
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
					
					System.out.println("Fecha (Formato dd//MM/yyyy): ");
					
					String fecha = reader.nextLine();		
					
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
					
					if(cantidad >= 3000.00) {
						System.out.println("Avisa a hacienda");
					}
					
					Double saldo = BancoDaw[seleccionSubMenu - 1].getSaldo();
					
					if(tipo == tipo.INGRESO) {
						BancoDaw[seleccionSubMenu - 1].setSaldo((saldo + cantidad));
						
					}
					
					if (tipo == tipo.RETIRADA) {
						BancoDaw[seleccionSubMenu - 1].setSaldo((saldo - cantidad));
						
					}
					BancoDaw[seleccionSubMenu - 1].addMovimiento(ID, fecha, tipo, cantidad);
					
					
					
					
				}
				
				if (seleccionSubMenu == variableParaMenuInfo + 2 && variableParaMenuInfo < BancoDaw.length) {
					
					System.out.println("\nInserta el nombre de la cuenta: ");
					
					BancoDaw[variableParaMenuCuenta].setTitular(reader.nextLine());
					variableParaMenuCuenta++;
					
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
					
					if(BancoDaw[i].getTitular() != null) {
						System.out.println((i + 1) + ") " + BancoDaw[i].getTitular());
					
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



