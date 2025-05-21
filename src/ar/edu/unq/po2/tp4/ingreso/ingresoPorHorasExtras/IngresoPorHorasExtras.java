package ar.edu.unq.po2.tp4.ingreso.ingresoPorHorasExtras;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;

public class IngresoPorHorasExtras extends Ingreso{
	private int cantidadDeHorasExtras;
	
	public IngresoPorHorasExtras(String mdp, String c, double m, int cHE) {
		super(mdp, c, m);
		this.cantidadDeHorasExtras = cHE;
	}
	
	
	
	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}



	public void setCantidadDeHorasExtras(int cantidadDeHorasExtras) {
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}

	public double ingresoPorHorasExtras() {
		return getCantidadDeHorasExtras() * 100; 
	}
	

	@Override 
	public double getMontoImponible() {
		return getMonto() + ingresoPorHorasExtras() * 0;
	}
	@Override 
	public double getMontoTotalPercibido() {
		return getMonto() - getImpuestoAPagar() + ingresoPorHorasExtras();
	}
}
