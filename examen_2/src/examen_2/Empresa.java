package examen_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empresa {
	private String nombreEmpresa;
	private String CIF;
	private LocalDate fechaFundacion;
	private ArrayList<Persona> coleccion = new ArrayList<Persona>();
	
	public Empresa(String nombreEmpresa, String cIF, LocalDate fechaFundacion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		CIF = cIF;
		this.fechaFundacion = fechaFundacion;
		this.coleccion = coleccion;
	}

	public boolean registrarTrabajador(Trabajador trabajador) {
		boolean existeDNI = true;
		for (int i = 0; i < coleccion.size(); i++) {
			if (coleccion.get(i).getDNI().equalsIgnoreCase(trabajador.getDNI())) {
				existeDNI = false;
			}
		}
		
		if (existeDNI == true) {
			coleccion.add(trabajador);
			System.out.println("He sido añadido");
		}
		return existeDNI;

	}
	
	public boolean registrarGerente(GerenteDep gerente) {
		boolean existeDNI = true;
		for (int i = 0; i < coleccion.size(); i++) {
			if (coleccion.get(i).getDNI().equalsIgnoreCase(gerente.getDNI())) {
				existeDNI = false;
			}
		}
		
		if (existeDNI == true) {
			coleccion.add(gerente);
			System.out.println("He sido añadido");
		}
		return existeDNI;

	}
	
	public boolean registrarDirector(Director director) {
		boolean existeDNI = true;
		for (int i = 0; i < coleccion.size(); i++) {
			if (coleccion.get(i).getDNI().equalsIgnoreCase(director.getDNI())) {
				existeDNI = false;
			}
		}
		
		if (existeDNI == true) {
			coleccion.add(director);
		}
		return existeDNI;

	}
	
	public boolean eliminarTrabajador(String DNI) {
		boolean eliminado = false;
		int pos = 0;
		for(int i = 0; i < coleccion.size(); i++) {
			if(coleccion.get(i).getDNI().equalsIgnoreCase(DNI)) {
				pos = i;
				eliminado = true;
			}
		}
		
		if (eliminado == true) {
			coleccion.remove(pos);
		}
		return eliminado;
	}
	
	
	
	@Override
	public String toString() {
		return "Empresa [nombreEmpresa=" + nombreEmpresa + ", CIF=" + CIF + ", fechaFundacion=" + fechaFundacion + "]";
	}

	
	public void mostrarInformacionTrabajadores() {
		for(int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i).toString()); 
		}
	}
		
	
	public boolean reunirEmpresa(Trabajador trabajador, Director director) {
		boolean reunidos = false;
		for(int i = 0; i < coleccion.size(); i++) {
			if(coleccion.get(i).getDNI().equalsIgnoreCase(trabajador.getDNI()) || trabajador.isEstarEnOficina() == true) {
				if(director.isFueraOficina() == false && director.isEstaReunido() == false && director.isEstarEnOficina())  {
					coleccion.get(i).toString();
					reunidos = true;
				}
			}
			
		}
		
		return reunidos; 
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		String regex = "^[A-Z]{1}//d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(CIF);
		
		if(matcher.matches()) {
			CIF = cIF;
		}
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	
	
	
}
