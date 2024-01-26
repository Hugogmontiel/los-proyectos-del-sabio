package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Actividad 1
		
		Producto p1 = new Producto("Paco", 1);
		Producto p2 = new Producto("Ruben", 2);
		Producto p3 = new Producto("Rodrigo", 3);
		Producto p4 = new Producto("Ernesto", 4);
		Producto p5 = new Producto("Ivan", 5);
		
		//Actividad 2
		
		ArrayList<Producto> a = new ArrayList<Producto>();
		
		//Actividad 3
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
	
		//Actividad 4
		
		Iterator<Producto> itera = a.iterator();
		Producto producto;
		producto = itera.next();
		
		while(itera.hasNext()) {
			if(producto.getNombre().equals("")) {
				itera.remove();
			}
			
			System.out.println(producto.toString());
			
		}
		
		//Actividad 5
		
		a.remove(p5);
		a.remove(p4);
		
		//Actividad 6
		
		a.add(1, new Producto("Ruben", 7));
		
		
		//Actividad 7
		
		Iterator<Producto> itera1 = a.iterator();
		Producto producto1;
		producto1 = itera1.next();
		
		while(itera1.hasNext()) {
			if(producto1.getNombre().equals("")) {
				itera1.remove();
			}
			
			System.out.println(producto1.toString());
			
		}
		
		//Actividad 8
		
		
		
		
		
		
		
	}

}
