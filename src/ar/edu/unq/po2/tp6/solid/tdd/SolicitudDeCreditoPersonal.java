package ar.edu.unq.po2.tp6.solid.tdd;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Cliente cliente, double dineroSolicitado, int plazoEnMeses) {
		super(cliente, dineroSolicitado, plazoEnMeses);
	}
	
	public Boolean esAceptable() {
		double ingresoAnual = getCliente().getSueldoNetoAnual();
		return ingresoAnual >= 15000d && getDineroSolicitado() < (0.7 * getCliente().getSueldoNetoMensual() );
		
	}
	
}
