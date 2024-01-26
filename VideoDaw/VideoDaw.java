import java.time.LocalDate;
	public class VideoDaw {
		private String CIF;
		private String direccion;
		private LocalDate fechaAlta;
		
		private Pelicula [] peliculaRegistrada;
		
		private Cliente [] clienteRegistrado;
		
		private int numActualCliente = 0;

		
	public VideoDaw (String CIF, String direccion, LocalDate fechaAlta) {
		this.CIF = CIF;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
		
	}
	
	public void mostrarInfoVideoClub () {
		
		String s = "CIF: " + this.CIF + "\nDireccion: " + this.direccion + "\nFecha de Alta: " + this.fechaAlta;
		System.out.println(s);
		
	}
	
	public void mostrarPeliculasRegistradas() {
		for(int i = 0; i < peliculaRegistrada.length; i++) {
			if(this.peliculaRegistrada[i].getCOD() != null) {
				System.out.println(this.peliculaRegistrada[i]);
			}
		}
		
	}
/*
	public void mostrarClientessRegistrados() {
		for (int i = 0 ; i < clienteRegistrado.length; i++) {
			boolean existeCliente = false;
			for(int j = 0; j  < i; j++) {
			
            	if(this.clienteRegistrado[i].getDNI().equalsIgnoreCase(this.clienteRegistrado[j].getDNI())) {
            		existeCliente = true;
            		System.out.println("\nSe ha encontrado un cliente repetido!!\n");
            	}
            
            	
				
            	}
			if(this.clienteRegistrado[i].getDNI() != null && existeCliente == false) {
        		System.out.println(this.clienteRegistrado[i]);
			}

		}
	}
*/

	public String getCIF() {
		return CIF;
	}


	public void setCIF(String CIF) {
		this.CIF = CIF;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
}
