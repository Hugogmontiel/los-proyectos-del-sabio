package herencia_1;

public class Satelites extends Astros{

	private int distanciaPlaneta;
	private int orbitaPlanetaria;
	private String planetaPertenece;
	
	public Satelites(int masa, double diametroMedio, int periodoEje, int periodoCuerpo, double distanciaMedia,
			int distanciaPlaneta, int orbitaPlanetaria, String planetaPertenece) {
		
		super(masa, diametroMedio, periodoEje, periodoCuerpo, distanciaMedia);
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planetaPertenece = planetaPertenece;
		
	}

	
	
	public void mostrarAstro() {
		
		String x = "Satelites [distanciaPlaneta=" + distanciaPlaneta + " metros, orbitaPlanetaria=" + orbitaPlanetaria
				+ " segundos, planetaPertenece=" + planetaPertenece + "]\n";
		
		System.out.println(x);
		
		super.mostrarAstro();
	}



	public int getDistanciaPlaneta() {
		return distanciaPlaneta;
	}

	public void setDistanciaPlaneta(int distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}

	public int getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	public void setOrbitaPlanetaria(int orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	public String getPlanetaPertenece() {
		return planetaPertenece;
	}

	public void setPlanetaPertenece(String planetaPertenece) {
		this.planetaPertenece = planetaPertenece;
	}
	
	
}
