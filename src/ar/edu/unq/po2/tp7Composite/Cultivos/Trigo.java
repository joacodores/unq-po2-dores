package ar.edu.unq.po2.tp7Composite.Cultivos;

public class Trigo implements Cultivable {
	private double gananciaAnual;
	
	public Trigo() {
	this.gananciaAnual = 300d;
	}
	
	public double getGananciaAnual() {
		return gananciaAnual;
	}
}
