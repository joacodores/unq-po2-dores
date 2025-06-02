package ar.edu.unq.po2.tp7Composite.Cultivos;

public class Soja implements Cultivable {
	private double gananciaAnual;
	
	public Soja() {
	this.gananciaAnual = 500d;
	}
	
	public double getGananciaAnual() {
		return gananciaAnual;
	}
}
