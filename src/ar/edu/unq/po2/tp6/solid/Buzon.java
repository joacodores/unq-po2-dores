package ar.edu.unq.po2.tp6.solid;

import java.util.ArrayList;

public class Buzon {
	public ArrayList<Correo> inbox;
	public ArrayList<Correo> borrados;
	
	public Buzon() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}

	public void setInbox(ArrayList<Correo> inbox) {
		this.inbox = inbox;
	}

	public ArrayList<Correo> getBorrados() {
		return borrados;
	}

	public void setBorrados(ArrayList<Correo> borrados) {
		this.borrados = borrados;
	}
	
	public void recibirAInbox(ArrayList<Correo> recibidos) {
		inbox.addAll(recibidos);
	}
	
	public void borrarCorreo(Correo c) { // c debe ser parte de inbox
		inbox.remove(c);
		borrados.add(c);
	}
	public void eliminarBorrado(Correo c) { // c debe ser parte de borrados
		borrados.remove(c);
	}
	
	public void recuperarBorrado(Correo c) {// c debe ser parte de borrados
		borrados.remove(c);
		inbox.add(c);
	}
	
	public int contarBorrados() {
		return borrados.size();
	}
	
	public int contarInbox() {
		return inbox.size();
	}
	
	
	
}
