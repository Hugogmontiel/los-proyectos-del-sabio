package Agenda;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList <Contactos> coleccion;
	
	private int numeroMaximo;

	public Agenda(ArrayList<Contactos> coleccion, int numeroMaximo) {
		this.coleccion = new ArrayList<Contactos>();
		
	}
	
	public Agenda(int numeroMaximo) {
		this.numeroMaximo = numeroMaximo;
		this.coleccion = new ArrayList<Contactos>();
		
	}
	
	public boolean añadirContacto(Contactos contacto) {
		boolean isRepetido = false;
		for(int i = 0; i < coleccion.size(); i++) {
			if (coleccion.get(i).equals(null));
			
			else {
				if (coleccion.get(i).getNombre().equalsIgnoreCase(contacto.getNombre())) {
					isRepetido  = true;
					System.out.println("No se ha podido añadir");
				}
	
			}
			
		}
		
		if(isRepetido == false) {
			coleccion.add(contacto);
			System.out.println("Contacto añadido correctamente");
			
		}
		
		return isRepetido ;
		
	}
	
	public boolean eliminarContacto(String nombre) {
		boolean isRepetido = false;
		for(int i = 0; i < coleccion.size(); i++) {
			if(coleccion.get(i).equals(null));
			
			else {
				if (coleccion.get(i).getNombre().equalsIgnoreCase(nombre)) {
					
					isRepetido = true;
				}
				
			}
			
		}
		if(isRepetido == true) {
			coleccion.remove(nombre);
			System.out.println("Contacto eliminado correctamente");
		}
		
		return isRepetido;
	}
	
	public boolean existeContacto(String nombre) {
		boolean existeContacto = false;
		
		for(int i = 0; i < coleccion.size(); i++) {
			
		
			if(coleccion.get(i).equals(null));
			
			else {
				if (coleccion.get(i).getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Existe el contacto");
					existeContacto = true;
				}
				
				else {
					System.out.println("No existe el contacto");
				}

			}
		}
		return existeContacto;
		
	}
	
	public void listarContactos() {
		for (int i = 0; i < coleccion.size(); i++) {
			coleccion.get(i).mostrarContactos();
		
		}
		
		
	}
	
	public void mostrarNombre() {
		for (int i = 0; i < coleccion.size(); i++) {
			coleccion.get(i).mostrarNombre();
			
		}
	}
	
	public int buscaContactos(String nombre) {
		int resultado = -1;
		for(int i = 0; i < coleccion.size(); i++) {
			if(coleccion.get(i).equals(null));
			
			else {
				if (coleccion.get(i).getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Se ha encontrado el contacto");
					resultado = (i + 1);
				}
				else {
					System.out.println("No se ha encontrado el contacto");
					
				}
			}
		}
		
		return resultado;
	}
	
	
	
}
