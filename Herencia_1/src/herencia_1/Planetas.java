package herencia_1;

public class Planetas extends Astros {

	private int distanciaSol;
	private boolean orbitaSol;
	private boolean tieneSatelites;
	
	public Planetas(int masa, double diametroMedio, int periodoEje, int periodoCuerpo, double distanciaMedia,
			int distanciaSol, boolean orbitaSol, boolean tieneSatelites) {
		
		super(masa, diametroMedio, periodoEje, periodoCuerpo, distanciaMedia);
		
		this.distanciaSol = distanciaSol;
		this.orbitaSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
		
	}
	
	public void mostrarAstro() {
		
		String z = "Planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
				+ tieneSatelites + "]\n";
		
		System.out.println(z);
		
		super.mostrarAstro();
	}

	public int getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public boolean getOrbitaSol() {
		return orbitaSol;
	}

	public void setOrbitaSol(boolean orbitaSol) {
		this.orbitaSol = orbitaSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}
	
}
