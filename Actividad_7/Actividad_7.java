import java.util.Scanner;

public class Actividad_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				
				Scanner reader = new Scanner(System.in);
				
				int opcionMaquina = 0;
				int puntosJugador = 0; int puntosMaquina = 0;
				boolean bucleInfinito = true;
				boolean seguirJugando = true;
				
				while (bucleInfinito = true) {
				
				seguirJugando = true;
					
				System.out.println("1) Jugar");
				System.out.println("2) Ayuda");
				System.out.println("3) Salir");
					
				String seleccion = reader.nextLine();

				if(seleccion.equalsIgnoreCase("1")) {
					
					System.out.println("1) Piedra papel o tijera clásico");
					System.out.println("2) Piedra papel o tijera version Shéldon");
					
					String seleccionMenuJugar = reader.nextLine();
					
					if (seleccionMenuJugar.equalsIgnoreCase("1")) {
						
						while (seguirJugando == true) {
							
						
							System.out.println("\nSelecciona piedra papel o tijera:");
							System.out.println("P (Piedra)\nL (Papel)\nT (Tijera)");
						
							String seleccionJugador = reader.nextLine();
						
							opcionMaquina = (int) (1 +  Math.random()*3); // 1 = Piedra | 2 = Papel | 3 = Tijera
						
						
						
							if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("P")) {
								
								System.out.println("\nPiedra vs Piedra");
								System.out.println("Empate");
							}
						
							if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("L")) {
								
								System.out.println("\nPapel vs Piedra");
								System.out.println("Gana el jugador");
								puntosJugador++;
							
							}
						
							if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("T")) {
								
								System.out.println("\nTijera vs Piedra");
								System.out.println("Gana la maquina");
								puntosMaquina++;
							
							}
						
							if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("P")) {
								
								System.out.println("\nPiedra vs Papel");
								System.out.println("Gana la maquina");
								puntosMaquina++;
						
							}
						
							if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("L")) {
							
								System.out.println("\nPapel vs Papel");
								System.out.println("Empate");
						
						
							}
						
							if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("T")) {
							
								System.out.println("Tijera vs Papel");
								System.out.println("Gana el jugador");
								puntosJugador++;
				
						
							}
							
							if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("P")) {
							
								System.out.println("\nPiedra vs Tijera");
								System.out.println("Gana el jugador");
								puntosJugador++;
						
							}
						
							if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("L")) {
							
								System.out.println("\nPapel vs Tijera");
								System.out.println("Gana la maquina");
								puntosMaquina++;
						
							}
						
							if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("T")) {
							
								System.out.println("\nTijera vs Tijera");
								System.out.println("Empate");
							
						
							}
						
							System.out.println("\n¿Quieres seguir jugando? Si o no");
						
							String preguntaJugar = reader.nextLine();
							
							
							if (preguntaJugar.equalsIgnoreCase("No")) {
								
								seguirJugando = false;
								
							}
							System.out.println("\nLa putuación del jugador es de: " + puntosJugador);
							System.out.println("\nLa putuación dela maquina es de: " + puntosMaquina);
						
						}
						
					}
				if (seleccionMenuJugar.equalsIgnoreCase("2")) {
					
					while (seguirJugando == true) {
						
						
						
						System.out.println("\nSelecciona piedra papel o tijera:");
						System.out.println("P (Piedra) \nL (Papel)\nT (Tijera)\nLa (Lagarto)\nS (Spock)");
					
						String seleccionJugador = reader.nextLine();
					
						opcionMaquina = (int) (1 +  Math.random()*5); // 1 = Piedra | 2 = Papel | 3 = Tijera | 4 = Lagarto | 5 = Spock
					
					
					
						if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("P")) {
							
							System.out.println("\nPiedra vs Piedra");
							System.out.println("Empate");
						}
					
						if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("L")) {
							
							System.out.println("\nPapel vs Piedra");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
						}
					
						if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("T")) {
							
							System.out.println("\nTijera vs Piedra");
							System.out.println("Gana la maquina");
							puntosMaquina++;
						
						}
						
						if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("La")) {
							
							System.out.println("\nLagarto vs Piedra");
							System.out.println("Gana la maquina");
							puntosMaquina++;
						
						}
						if(opcionMaquina == 1 && seleccionJugador.equalsIgnoreCase("S")) {
							
							System.out.println("\nSpockvs Piedra");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
						}
					
						if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("P")) {
							
							System.out.println("\nPiedra vs Papel");
							System.out.println("Gana la maquina");
							puntosMaquina++;
					
						}
					
						if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("L")) {
						
							System.out.println("\nPapel vs Papel");
							System.out.println("Empate");
					
					
						}
					
						if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("T")) {
						
							System.out.println("Tijera vs Papel");
							System.out.println("Gana el jugador");
							puntosJugador++;
			
					
						}
						
						if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("La")) {
							
							System.out.println("\nLagarto vs Papel");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
						}
						
						if(opcionMaquina == 2 && seleccionJugador.equalsIgnoreCase("S")) {
							
							System.out.println("\nSpock vs Papel");
							System.out.println("Gana la maquina");
							puntosMaquina++;
						
						}
						
						if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("P")) {
						
							System.out.println("\nPiedra vs Tijera");
							System.out.println("Gana el jugador");
							puntosJugador++;
					
						}
					
						if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("L")) {
						
							System.out.println("\nPapel vs Tijera");
							System.out.println("Gana la maquina");
							puntosMaquina++;
					
						}
					
						if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("T")) {
						
							System.out.println("\nTijera vs Tijera");
							System.out.println("Empate");
						
					
						}
						
						if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("La")) {
							
							System.out.println("\nLagarto vs Tijera");
							System.out.println("Gana la maquina");
							puntosMaquina++;
						
						}
						
						if(opcionMaquina == 3 && seleccionJugador.equalsIgnoreCase("S")) {
							
							System.out.println("\nSpock vs Tijera");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
						}
						
						if(opcionMaquina == 4 && seleccionJugador.equalsIgnoreCase("P")) {
							
							System.out.println("\nPiedra vs Lagarto");
							System.out.println("Gana el jugador");
							puntosJugador++;
					
						}
					
						if(opcionMaquina == 4 && seleccionJugador.equalsIgnoreCase("L")) {
						
							System.out.println("\nPapel vs Lagarto");
							System.out.println("Gana la maquina");
							puntosMaquina++;
					
						}
					
						if(opcionMaquina == 4 && seleccionJugador.equalsIgnoreCase("T")) {
						
							System.out.println("\nTijera vs Lagarto");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
					
						}
						
						if(opcionMaquina == 4 && seleccionJugador.equalsIgnoreCase("La")) {
							
							System.out.println("\nLagarto vs Lagarto");
							System.out.println("Empate");
						
						}
						
						if(opcionMaquina == 4 && seleccionJugador.equalsIgnoreCase("S")) {
							
							System.out.println("\nSpock vs Lagarto");
							System.out.println("Gana la maquina");
							puntosMaquina++;
						
						}
						
						if(opcionMaquina == 5 && seleccionJugador.equalsIgnoreCase("P")) {
							
							System.out.println("\nPiedra vs Spock");
							System.out.println("Gana el maquina");
							puntosMaquina++;
					
						}
					
						if(opcionMaquina == 5 && seleccionJugador.equalsIgnoreCase("L")) {
						
							System.out.println("\nPapel vs Spock");
							System.out.println("Gana el jugador");
							puntosJugador++;
					
						}
					
						if(opcionMaquina == 5 && seleccionJugador.equalsIgnoreCase("T")) {
						
							System.out.println("Tijera vs Spock");
							System.out.println("Gana el maquina");
							puntosMaquina++;
			
					
						}
						
						if(opcionMaquina == 5 && seleccionJugador.equalsIgnoreCase("La")) {
							
							System.out.println("\nLagarto vs Spock");
							System.out.println("Gana el jugador");
							puntosJugador++;
						
						}
						
						if(opcionMaquina == 5 && seleccionJugador.equalsIgnoreCase("S")) {
							
							System.out.println("\nSpock vs Spock");
							System.out.println("Empate");
							
						
						}
						
						System.out.println("\n¿Quieres seguir jugando? Si o no");
						
						String preguntaJugar = reader.nextLine();
						
						
						if (preguntaJugar.equalsIgnoreCase("No")) {
							
							seguirJugando = false;
						}       
						System.out.println("\nLa putuación del jugador es de: " + puntosJugador);
						System.out.println("\nLa putuación dela maquina es de: " + puntosMaquina);
						
					}
					
						
				}
				
					
				}
				
				if(seleccion.equalsIgnoreCase("2")) {
					
					System.out.println("1) Información sobre piedra papel o tijera clásico");
					System.out.println("2) Información sobre piedra papel o tijera de sheldon");
				
					String seleccionAyuda = reader.nextLine();
					
					if (seleccionAyuda.equalsIgnoreCase("1")) {
						System.out.println("Piedra, papel o tijera es un juego precioso y muy inteligente cuya principal virtud es su simplicidad. Dos jugadores, tres posibles movimientos, un resultado final, y solo unas normas básicas que todos conocemos: la piedra gana a las tijeras, las tijeras ganan al papel, y el papel gana a la piedra");
					
					}
					
					if (seleccionAyuda.equalsIgnoreCase("2")) {
						System.out.println("Tijera corta a papel, papel tapa a piedra, piedra aplasta a lagarto, lagarto envenena a Spock, Spock rompe a tijera, tijera decapita a lagarto, lagarto devora a papel, papel desautoriza a Spock, Spock vaporiza a piedra, y como siempre, piedra aplasta a tijera\n");
						
						
					}
				}
				
				if(seleccion.equalsIgnoreCase("3")) {
					bucleInfinito = false;
				}
				
				
				} //cierro while
			
			System.out.println("Programa finalizado");

			
			
		
		
	}// cierro main

}// cierro class
