package examen_2;

import java.time.LocalDate;

public class Director extends Trabajador{
	private String nTelefono;
	private boolean estaReunido;
	private boolean fueraOficina;
	
	public Director(String nombre, LocalDate fechaNacimiento, String DNI, String direccion, String numeroSS,
			String emailEmpresa, Double salario, Departamento departamento, boolean estarEnOficina, String nTelefono,
			boolean estaReunido, boolean fueraOficina) {
		
		super(nombre, fechaNacimiento, DNI, direccion, numeroSS, emailEmpresa, salario, departamento, estarEnOficina);
		this.nTelefono = nTelefono;
		this.estaReunido = estaReunido;
		this.fueraOficina = fueraOficina;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Director [nTelefono=" + nTelefono + ", estaReunido=" + estaReunido + ", fueraOficina=" + fueraOficina
				+ "]\n";
	}



	public String getnTelefono() {
		return nTelefono;
	}

	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
	}

	public boolean isEstaReunido() {
		return estaReunido;
	}

	public void setEstaReunido(boolean estaReunido) {
		this.estaReunido = estaReunido;
	}

	public boolean isFueraOficina() {
		return fueraOficina;
	}

	public void setFueraOficina(boolean fueraOficina) {
		this.fueraOficina = fueraOficina;
	}
	
	
	
}
