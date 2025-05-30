package ar.edu.unq.po2.tp6.solid.tdd;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	private Propiedad propiedad;
	public SolicitudDeCreditoHipotecario(Cliente cliente, double dineroSolicitado, int plazoEnMeses) {
		super(cliente, dineroSolicitado, plazoEnMeses);
		this.propiedad = getCliente().getPropiedad();
	}
	
	public Boolean esAceptable() {
		int plazoEnAnios = (int) Math.floor((double)getPlazoEnMeses() / 12); 
		int edadAlFinalizarPago = getCliente().getEdad() + plazoEnAnios ;

		return (getMontoCuotasMensuales() < (0.5 * getCliente().getSueldoNetoMensual())) &&
				(propiedad.getValorFiscal() * 0.7 > getDineroSolicitado() ) && (edadAlFinalizarPago < 65 );
	}
}
