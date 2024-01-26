import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Libro 
{
	
	private String titulo;
	private int nPaginas;
	private String autor;
	private String genero;
	private String editorial;
	private String ISBN;
	private int aPublicacion;
	
	
	public Libro(String titulo, int nPaginas, String autor, String genero, String editorial, String iSBN,
			int aPublicacion) {
		this.titulo = titulo;
		this.nPaginas = nPaginas;
		this.autor = autor;
		this.genero = genero;
		this.editorial = editorial;
		this.setISBN(iSBN);
		this.aPublicacion = aPublicacion;
	}
	
	public Libro(String titulo, String autor,  String iSBN,
			int aPublicacion)
	{
		this.titulo = titulo;
		this.nPaginas = 0;
		this.autor = autor;
		this.setISBN(iSBN);
		this.aPublicacion = aPublicacion;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	/**
	 * @return the nPaginas
	 */
	public int getnPaginas() {
		return nPaginas;
	}
	
	
	/**
	 * @param nPaginas the nPaginas to set
	 */
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	
	
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	
	
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	
	
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	
	
	/**
	 * @param iSBN the iSBN to set
	 */
	private boolean setISBN(String iSBN) {
		this.ISBN = iSBN;
		return true;
		/*
		boolean isOk = this.isbnValidator(iSBN);
		if(isOk)
		{
			this.ISBN = iSBN;
		}
		else {
			System.out.println("Formato incorrecto");
		}
		
		return isOk;*/
	}
	
	
	private boolean isbnValidator(String iSBN)
	{
		boolean isFormatOk = false;
		String regex = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(iSBN);
		if(matcher.matches())
		{
			this.ISBN = iSBN;
			isFormatOk = true;
		}

		return isFormatOk;
	}
	
	
	/**
	 * @return the aPublicacion
	 */
	public int getaPublicacion() {
		return aPublicacion;
	}
	
	
	/**
	 * @param aPublicacion the aPublicacion to set
	 */
	public void setaPublicacion(int aPublicacion) {
		this.aPublicacion = aPublicacion;
	}
	
	public String mostrarInfoLibro()
	{
		String s = "Titulo: "+this.titulo + ", Autor: "+this.autor +
				", ISBN: "+this.ISBN +", Editoria: "+this.editorial +
				", Año de publicacion: "+this.aPublicacion + 
				", Numero de paginas: "+this.nPaginas +
				", Genero: "+this.genero;
		
		return s;
	}
	

}//clase
