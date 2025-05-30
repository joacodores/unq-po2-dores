package ar.edu.unq.po2.tp6.solid.tdd;

public interface GestorSolicitudes {
	//public void registrarCliente(Cliente c);
	public void registrarSolicitud(SolicitudDeCredito solicitud);
	public void evaluarSolicitud(SolicitudDeCredito solicitud);
	public void debitarCredito(Cliente c, double dinero);
	
}
