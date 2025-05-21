package ar.edu.unq.po2.tp4.ingreso;

public class Ingreso {
	private String mesDePercepcion;
	private String concepto;
	protected double monto;
	
	public Ingreso(String mdp, String c, double m) {
		this.mesDePercepcion = mdp; 
		this.concepto = c; 
		this.monto = m; 
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public double getMontoImponible() {
		return this.monto; 
	}
	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.2;
	}
	
	public double getMontoTotalPercibido() {
		return this.monto - getImpuestoAPagar();
	}
	
	
	
}
