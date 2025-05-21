package ar.edu.unq.po2.tp5.mercadoCentral;

public class Factura {
	private double montoTotal;
	private String tipoDeFactura;
	
	public Factura(double montoTotal, String tipoDeFactura) {
		super();
		this.montoTotal = montoTotal;
		this.tipoDeFactura = tipoDeFactura;
	}
	
	
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getTipoDeFactura() {
		return tipoDeFactura;
	}
	public void setTipoDeFactura(String tipoDeFactura) {
		this.tipoDeFactura = tipoDeFactura;
	}
	
	

}
