package act_1;

public class Gato {
	private String nombre;
	private int edad;
	
	public Gato(String nombre, int edad) {	
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void imprimir() {
		String s = "Gato [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreLongitudException {
		if(nombre.length() < 3) {
			throw new NombreLongitudException(nombre.length());
			
		}
		else {
			this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws EdadException {
		if(edad < 0) {
			throw new EdadException(edad);
			
		}
		
		this.edad = edad;
	}
	
	
	
}
