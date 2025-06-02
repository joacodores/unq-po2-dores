package ar.edu.unq.po2.tp7Composite.Cultivos;

public class CultivoUnico implements Parcela{
	private Cultivable cultivo;
	
	public CultivoUnico(Cultivable cultivo) {
		this.cultivo = cultivo;
		
	}
	
	public double gananciaAnual() {
		return cultivo.getGananciaAnual();
	}
	
}
