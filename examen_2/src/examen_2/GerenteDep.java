package examen_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenteDep extends Trabajador{
	private int numeroTrabajadores;
	private String nTelefono;
	
	private ArrayList<Trabajador> coleccion = new ArrayList<Trabajador>();

	public GerenteDep(String nombre, LocalDate fechaNacimiento, String DNI, String direccion, String numeroSS,
			String emailEmpresa, Double salario, Departamento departamento, boolean estarEnOficina,
			int numeroTrabajadores, String nTelefono) {
		
		super(nombre, fechaNacimiento, DNI, direccion, numeroSS, emailEmpresa, salario, departamento, estarEnOficina);
		this.numeroTrabajadores = numeroTrabajadores;
		this.nTelefono = nTelefono;
		this.coleccion = coleccion;
		
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "GerenteDep [numeroTrabajadores=" + numeroTrabajadores + ", nTelefono=" + nTelefono + 
				 "]\n";
	}



	public void convocarReunionDepartamento(LocalDateTime fReunion, Departamento departamento) {
		for(int i = 0; i < numeroTrabajadores; i++) {
			if(coleccion.get(i).getDepartamento().equals(departamento)) {
				coleccion.get(i).toString();
			}
			
		}
		
		
	}
	
	public void mostrarInfoDepartamento() {
		
		for(int i = 0; i < numeroTrabajadores; i++) {
			double salarioTotal = 0;
			salarioTotal += coleccion.get(i).getSalario();
		}
		
		String s = coleccion.toString();
		
	}
	
	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public String getnTelefono() {
		return nTelefono;
	}

	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
	}	
	
}
