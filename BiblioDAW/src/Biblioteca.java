
public class Biblioteca 
{
	private String direccion;
	private int numMaxLibros;
	private String nombre;
	private String email;
	private String horario;
	private String telefono;
	
	private Libro[] coleccion;
	
	private int numLibrosActuales = 0;


	public Biblioteca(String direccion, int numMaxLibros, String nombre, String email, String horario, String telefono) {
		this.direccion = direccion;
		this.numMaxLibros = numMaxLibros;
		this.nombre = nombre;
		this.email = email;
		this.horario = horario;
		this.telefono = telefono;
		this.coleccion = new Libro[this.numMaxLibros];
	}
	
	public Biblioteca(int numMaxLibros) 
	{
		this.numMaxLibros = numMaxLibros;
		this.coleccion = new Libro[this.numMaxLibros];
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public boolean insertarLibro(Libro libro)
	{
		boolean libroIsertado = false;
		if(this.coleccion != null)
		{
			if(this.numLibrosActuales >= 0 && this.numLibrosActuales < this.numMaxLibros)
			{
				boolean existeLibro = false;
				for(int i = 0; i< this.numLibrosActuales; i++)
				{
					if(this.coleccion[i].getISBN().equalsIgnoreCase(libro.getISBN()))
					{
						existeLibro = true;
					}
				}
				
				if(existeLibro == false)
				{
					coleccion[numLibrosActuales] = libro;
					numLibrosActuales ++;
					libroIsertado = true;
				}
				else {
					System.out.println("El libro ya existe en la coleccion");
				}

			}
			else {
				System.out.println("La coleccion esta completa");
			}
		}
		
		return libroIsertado;
	}
	
	
	public void mostrarInfoBiblioteca()
	{
		String s;
		s = "\nNombre: "+this.nombre + ", Direccion: "+this.direccion +
				", Email: "+this.email + ", Telefono: "+this.telefono +
				", Horario: "+this.horario;
		
		if(this.numLibrosActuales > 0)
		{
			s = s + "\nColeccion de libros: \n";
			for(int i =0; i <numLibrosActuales; i++)
			{
				s = s + this.coleccion[i].mostrarInfoLibro() + "\n";
			}
		}
		
		System.out.println(s);
	}
	
	
	public boolean eliminarLibro(Libro libro)
	{
		boolean isRemoved = false;
		if(this.coleccion != null)
		{
			if(this.numLibrosActuales > 0)
			{
				int pos = -1;
				for(int i =0; i< this.numLibrosActuales; i++)
				{
					if(this.coleccion[i] != null)
					{
						if(this.coleccion[i].getISBN().equalsIgnoreCase(libro.getISBN()))
						{
							this.coleccion[i] = null;
							isRemoved = true;
							numLibrosActuales --;
							pos = i;
						}
					}
				}
				
				for(int i = pos; i < this.coleccion.length-1; i++)
				{
					this.coleccion[i] = this.coleccion[i+1];
				}
				this.coleccion[coleccion.length-1] = null;
				
				
			}
			else {
				System.out.println("La coleccion esta vacia");
			}	
		}
		
		return isRemoved;
	}
	

}//clase
