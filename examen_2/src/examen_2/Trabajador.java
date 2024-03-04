package examen_2;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trabajador extends Persona{
	private String numeroSS;
	private String emailEmpresa;
	private Double salario;
	private Departamento departamento;
	private boolean estarEnOficina;
	
	
	public Trabajador(String nombre, LocalDate fechaNacimiento, String DNI, String direccion, String numeroSS,
			String emailEmpresa, Double salario, Departamento departamento, boolean estarEnOficina) {
		super(nombre, fechaNacimiento, DNI, direccion);
		this.numeroSS = numeroSS;
		this.emailEmpresa = emailEmpresa;
		this.salario = salario;
		this.departamento = departamento;
		this.estarEnOficina = estarEnOficina;
	}


	@Override
	public String toString() {
		return  super.toString() + "Trabajador [numeroSS=" + numeroSS + ", emailEmpresa=" + emailEmpresa + ", salario=" + salario
				+ ", departamento=" + departamento + ", estarEnOficina=" + estarEnOficina + "]\n";
		
	}


	public String getNumeroSS() {
		return numeroSS;
	}


	public void setNumeroSS(String numeroSS) throws numeroSSException{
		String regex = "^d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numeroSS);
		if(matcher.matches()) {
			this.numeroSS = numeroSS;
		}
		else {
			throw new numeroSSException();
		}
		
	}


	public String getEmailEmpresa() {
		return emailEmpresa;
	}


	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public boolean isEstarEnOficina() {
		return estarEnOficina;
	}


	public void setEstarEnOficina(boolean estarEnOficina) {
		this.estarEnOficina = estarEnOficina;
	}
	
	
	
}
