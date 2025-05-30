package ar.edu.unq.po2.tp6.solid.tdd;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private double dineroSolicitado;
	private int plazoEnMeses;
	public SolicitudDeCredito(Cliente cliente, double dineroSolicitado, int plazoEnMeses) {
		super();
		this.cliente = cliente;
		this.dineroSolicitado = dineroSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getDineroSolicitado() {
		return dineroSolicitado;
	}
	public void setDineroSolicitado(double dineroSolicitado) {
		this.dineroSolicitado = dineroSolicitado;
	}
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	public double getMontoCuotasMensuales() {

		return getDineroSolicitado() / getPlazoEnMeses();
	}
	
	public abstract Boolean esAceptable();
	
}
