package ar.edu.unq.po2.tp6.solid;

public class GestorClienteServidor {

	public IServidorSimple server;
	private Buzon inbox ;
	
	public GestorClienteServidor(IServidorSimple server, Buzon inbox) {
		this.inbox = inbox;
		this.server = server;
	}

	public IServidorSimple getServer() {
		return server;
	}

	public void setServer(IServidorSimple server) {
		this.server = server;
	}

	public Buzon getInbox() {
		return inbox;
	}

	public void setInbox(Buzon inbox) {
		this.inbox = inbox;
	}
	
	
}
