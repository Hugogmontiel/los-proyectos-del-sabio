package DawBank;

import java.time.LocalDate;

public class Cliente extends Persona{
	private String nTelefono;
	private String email;
	private String direccion;
	
	public Cliente(String nombre, String dNI, LocalDate fechaNacimiento, String nTelefono, String email,
			String direccion) {
		super(nombre, dNI, fechaNacimiento);
		this.nTelefono = nTelefono;
		this.email = email;
		this.direccion = direccion;
	}
	

	@Override
	public String toString() {
		return super.toString() + " Cliente [nTelefono=" + nTelefono + ", email=" + email + ", direccion=" + direccion + "]";
	}
	

	public String getnTelefono() {
		return nTelefono;
	}

	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
