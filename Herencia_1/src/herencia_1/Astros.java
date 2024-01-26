package herencia_1;

public class Astros {
	private int masa;
	private double diametroMedio;
	private int periodoEje;
	private int periodoCuerpo;
	private double distanciaMedia;
	
	public Astros(int masa, double diametroMedio, int periodoEje, int periodoCuerpo, double distanciaMedia) {
		this.masa = masa;
		this.diametroMedio = diametroMedio;
		this.periodoEje = periodoEje;
		this.periodoCuerpo = periodoCuerpo;
		this.distanciaMedia = distanciaMedia;
	}
	
	public void mostrarAstro() {
		String s = "[masa=" + masa + " kg, diametroMedio=" + diametroMedio + " metros, periodoEje=" + periodoEje
				+ " segundos, periodoCuerpo=" + periodoCuerpo + " segundos, distanciaMedia=" + distanciaMedia + " metros]\n";
		
		System.out.println(s);
	}
	

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public double getDiametroMedio() {
		return diametroMedio;
	}

	public void setDiametroMedio(double diametroMedio) {
		this.diametroMedio = diametroMedio;
	}

	public int getPeriodoEje() {
		return periodoEje;
	}

	public void setPeriodoEje(int periodoEje) {
		this.periodoEje = periodoEje;
	}

	public int getPeriodoCuerpo() {
		return periodoCuerpo;
	}

	public void setPeriodoCuerpo(int periodoCuerpo) {
		this.periodoCuerpo = periodoCuerpo;
	}

	public double getDistanciaMedia() {
		return distanciaMedia;
	}

	public void setDistanciaMedia(double distanciaMedia) {
		this.distanciaMedia = distanciaMedia;
	}

}
