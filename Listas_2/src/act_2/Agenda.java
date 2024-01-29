package act_2;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Agenda {
	private LinkedHashMap<String, Contacto> contactoAgenda = new LinkedHashMap<>();
	
	public boolean anadeContacto(String nombre, String telefono, String correo) {
		boolean anadido = false;
		if(contactoAgenda.containsKey(nombre)) {
			
			
		}
		else {
			contactoAgenda.put(nombre, new Contacto(nombre, telefono, correo));
			anadido = true;
		}
		
		return anadido;
		
	}
	
	public String buscarContacto(String nombre) {
		String s = "";
		Contacto c = contactoAgenda.get(nombre);
		
		if(c != null) {
			
			s = c.toString();
			
		}
		
		else {
			s = "No ha sido posible encontrar el contacto";
			
		}
		return s;
		
	}
	
	
	public boolean eliminarElemento(String nombre) {
		boolean eliminado = false;
		
		if(contactoAgenda.containsKey(nombre)) {
			contactoAgenda.remove(nombre);
			eliminado = true;
			
		}
		
		return eliminado;
	}
	
	public String visualizaAgenda() {
		return "El taller tiene" + contactoAgenda.entrySet().toString();
		
		
	}
	
	
}