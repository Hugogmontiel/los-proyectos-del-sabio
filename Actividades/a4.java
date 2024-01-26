import java.util.Scanner;
public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner reader = new Scanner(System.in);
	
	//Actividad 1 
	
	System.out.println("\nActividad 1\n");
	
	System.out.println("Introduce 10 números reales: ");
	
	int numeros[] = new int[10];
	
	for(int i= 0;i < 10; i++) {
	
	numeros[i] = reader.nextInt();
	
	}	
	
	for(int i = 0;i < 10; i++) {

	System.out.println((i + 1)+ " Sus números son: "+ numeros[i]);
	
	}
	
	//Actividad 2
	System.out.println("\nActividad 2\n");
	
	System.out.println("Introduce 10 números reales: ");
	
	int b[] = new int[10];
	int suma = 0;
	
	for(int i= 0;i < 10; i++) {
		
	b[i] = reader.nextInt();	
	
	}
	
	for(int i= 0;i < 10; i++) {
		
	suma += b[i];	
	
	}
		
	System.out.println("La suma es: "+ suma);
	
	//actividad 3
	System.out.println("\nActividad 3\n");
	
	System.out.println("Introduce 10 números reales: ");
	
	int c[] = new int[10];
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int i= 0;i < 10; i++) {
		
	c[i] = reader.nextInt();	
	
	}
	
	for(int i= 0;i < 10; i++) {
		
	max = Math.max(c[i], max);
	min = Math.min(c[i], min);
		
	}
	
	System.out.println("El número mayor es: "+ max);
	System.out.println("El número menor es: "+ min);
	
	//actividad 4
	System.out.println("\nActividad 4\n");
	
	System.out.println("Introduce 20 números enteros: ");
	
	int d[] = new int[20];
	int suma1 = 0;
	int resta1 = 0;
	
	for(int i = 0;i < 20; i++) {
		
		d[i] = reader.nextInt();
		
		if (d[i] < 0) {		
			
			resta1 += d[i];
		}
		
		else {
			suma1 += d[i];
		}
		
	}
	
	System.out.println("La suma de los números negativos es: "+ resta1);
	System.out.println("La suma de los números positivos es: "+ suma1);
	
	//actividad 5
	System.out.println("\nActividad 5\n");
	
	System.out.println("Introduce 20 números enteros: ");
	
	double e[] = new double[20];
	double media = 0;
	
	for(int i = 0; i < 20; i++) {
	
		e[i] = reader.nextDouble();
		
		media += e[i];
		
	}
	
	System.out.println("La media es: "+ media/e.length);
	
	//actividad 6
	System.out.println("\nActividad 6\n");
	
	System.out.println("Introduce el valor de N y de M: ");
	
	int n = reader.nextInt();
	int m = reader.nextInt();
	int f[] = new int [n];
	
	for(int i = 0; i < n; i++) {
		
		f[i] = m;
		
		System.out.println((i + 1) + ". "+ f[i]);
	}
	
	//actividad 7
	System.out.println("\nActividad 7\n");
	
	System.out.println("Introduce el valor de P y de Q: ");
	
	int p = reader.nextInt();
	int q = reader.nextInt();
	int g[] = new int[Math.abs(p - q)];
	
	if (p < q) {
		for (int i = 1; i < g.length ; i++) {
			g[i] = 1 + p++;
			
			System.out.println((i) + ". "+ g[i]);
		}
	}
	
	else {
		for (int i = 1; i < g.length; i++) {
			g[i] = 1 + q++;
			
			System.out.println((i) + ". "+ g[i]);
		}
	}
	
	//actividad 8 
	System.out.println("\nActividad 8\n");
	
	System.out.println("Introduce un valor mayor de 0.0 y menor de 1.0: ");
	double h[] = new double[100];
	double valor = reader.nextDouble();
	int cuantos = 0;
	
	for (int i = 0; i < 100; i++) {
		
		h[i] = Math.random();
		
		if (h[i] >= valor) {
			cuantos++;
		}
	}
	System.out.println(cuantos + " Números son mayores o iguales que el número introducido");
	
	//actividad 9
	System.out.println("\nActividad 9\n");
	
	System.out.println("Introduce un valor mayor de 1 y menor de 10: ");
	
	int j[] = new int[100];
	int valor1 = reader.nextInt();
	
	System.out.println("En esta posición del Array son el número es igual a "+ valor1);
	
	for (int i = 0; i < 100; i++) {
		
		j[i] = (int) (1 + Math.random()*10); 
		
		if (j[i] == valor1) {
			System.out.println(i);
		}	
	}
	
	//actividad 10
	System.out.println("\nActividad 10\n");
	
	System.out.println("Introduce cuantas alturas: ");
	
	double alturas = reader.nextDouble();
	double k[] = new double[(int) alturas]; 
	double total = 0;
	double max1 = Integer.MIN_VALUE;
	double min1 = Integer.MAX_VALUE;
	int PorDebajoMedia = 0;
	int PorEncimaMedia = 0;
	double media1 = 0;
	
	System.out.println("Introduce "+ alturas + " alturas en metros: ");
	
	for (int i = 0; i < k.length; i++) {
		
		k[i] = reader.nextDouble();
		total +=  k[i];
		
		media1 = total/alturas;
		
		max1 = Math.max(k[i], max1);
		min1 = Math.min(k[i], min1);
		
	}
	
	for (int i = 0; i <k.length; i++) {
		
		if (k[i] < (media1)) {
			PorDebajoMedia++;
		}
		
		else  {
			PorEncimaMedia++;
		}
	}
	
	System.out.println("La media es: "+ (media1));
	System.out.println("El número mayor es: "+ max1);
	System.out.println("El número menor es: "+ min1);
	System.out.println("Por encima de la media hay: "+ PorEncimaMedia);
	System.out.println("Por debajo de la media hay: "+ PorDebajoMedia);
	
	
	//actividad 11
	System.out.println("\nActividad 11\n");
	
	int l[] = new int[100];
	int o[] = new int[100];
	
	System.out.println("Los números del 1 al 100: ");
	
	for (int i = 0; i < 100; i++) {
		
		l[i] = i + 1;
		
		System.out.println(l[i]);
		
	}
	
	System.out.println("En orden reverso: ");
	
	for (int i = 0; i < 100; i++) {
		
		o[i] = l[l.length - i - 1];
		
		System.out.println(o[i]);
		
	}
	
	//actividad 12
	System.out.println("\nActividad 12\n");
	
	System.out.println("Escoge una de las 3 opciones: ");
	
	
	
	int r[] = new int[10];
	
	reader.nextLine(); //para que no se repitan dos veces los system.out.println
	
	while(true) {
		
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valor");
		System.out.println("c. Salir");
		
		String string1 = reader.nextLine();
		
		if (string1.equals("a")) {
			
			for(int i = 0; i < 10; i++) {
				System.out.println((i + 1) +". "+ r[i]);
			}
		}
		
		else if (string1.equals("b")) {
			
			System.out.println("Introduce un valor:" );
			
			int valorArray = reader.nextInt(); 
			
			reader.nextLine();
			
			System.out.println("Introduce una posición: ");
		
			int posicionArray = reader.nextInt();
			
			reader.nextLine();
			
				r[posicionArray - 1] = valorArray;
			
				System.out.println("El nuevo valor en la posición "+ posicionArray + " es "+ valorArray);
			}
			
		else if (string1.equals("c")) {
			break;
		}
		
	}
	
	System.out.println("Programa finalizado");
	

	//actividad 13
	
	System.out.println("\nActividad 13\n");
	
	System.out.println("Introduce un valor inicial: ");
	int valorInicial = reader.nextInt();
	
	System.out.println("Introduce el incremento de la sucesión: ");
	int diferencia = reader.nextInt();
	
	System.out.println("Introduce la cantidad de números de la sucesión: ");
	int cantidadSucesion = reader.nextInt();
	
	int s[] = new int [cantidadSucesion];
	
	for(int i = 0; i < s.length; i++) {
		
		s[i] = valorInicial;
		valorInicial += diferencia;
		
		System.out.println(s[i]);
		
	}
	
	//actividad 14
	System.out.println("\nActividad 14\n");
	
	int valorPosicion = 0;
	
	int cantidadMaxima = 0;
	
	for(int i = 1; i <= 10; i++) {  //creo el maximo del array 
		cantidadMaxima += i;
	}
	int t[] = new int[cantidadMaxima];
	
	
	for(int i = 1; i <= 10; i++) {
		
		for(int z = 0; z < i; z++) {
			
			t[valorPosicion] = i;
			valorPosicion++;
		}
	}
	
	for (int i = 0; i < t.length; i++) {
		System.out.println(t[i]);
	}
	
	
	}
}