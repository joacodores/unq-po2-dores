package ar.edu.unq.po2.tp6.solid.tdd;

import java.util.ArrayList;

public class Banco implements GestorSolicitudes{

	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	};
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void registrarCliente(Cliente cliente1) {
		clientes.add(cliente1);
		cliente1.setBanco(this);
	}
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud); 
	}
	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		if (solicitud.esAceptable()) {
			debitarCredito(solicitud.getCliente(), solicitud.getDineroSolicitado());
		}
		
	}
	public void debitarCredito(Cliente c, double dinero) {
		
	}

	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<SolicitudDeCredito> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	public double getMontoTotalADesembolsar() {
		double monto = 0;
		for (SolicitudDeCredito s : solicitudes) {
			if (s.esAceptable()) {
				monto += s.getDineroSolicitado();
			}
		}
		return monto;
	}


}
