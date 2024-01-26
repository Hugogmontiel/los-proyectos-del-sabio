package Agenda;

public class Contactos {
	private String nombre;
	private String telefono;
	
	public Contactos(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	
	public void mostrarContactos() {
		String s =  "Contactos [nombre=" + nombre + ", telefono=" + telefono + "]";
		System.out.println(s);
	}
	
	public void mostrarNombre() {
		String s = nombre;
		System.out.println(s);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
