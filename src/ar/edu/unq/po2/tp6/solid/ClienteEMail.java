package ar.edu.unq.po2.tp6.solid;

import java.util.ArrayList;


public class ClienteEMail {
	
	 public String nombreUsuario;
	 private String passUsuario;
	 private GestorClienteServidor gestorCS;
	 
	
	public ClienteEMail(String nombreUsuario, String pass, IServidorSimple server){
		
		this.nombreUsuario=nombreUsuario;
		this.passUsuario=pass;
		this.gestorCS = new GestorClienteServidor(server, (new Buzon()));
		this.conectar();
	}
	
	
	 public String getUsuario() {
		return nombreUsuario;
	}

	public void setUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPass() {
		return passUsuario;
	}

	public void setPass(String passusuario) {
		this.passUsuario = passusuario;
	}
	
	public IServidorSimple getServidor() {
		return gestorCS.getServer();
	}

	public void conectar(){
		gestorCS.getServer().conectarUsuario(this);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) throws Exception{
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		gestorCS.getServer().enviarCorreoDePara(this, destinatario, correo);
	}
	
	public void borrarCorreo(Correo correo){
		gestorCS.getInbox().borrarCorreo(correo);
	}
	
	public int contarBorrados(){
		return gestorCS.getInbox().contarBorrados();
	}
	
	public int contarInbox(){
		return gestorCS.getInbox().contarInbox();
	}
	
	public void eliminarBorrado(Correo correo){
		gestorCS.getInbox().eliminarBorrado(correo);
	}
	
	public void recuperarBorrado(Correo c) {
		gestorCS.getInbox().recuperarBorrado(c);
	}
	
	public void recibirNuevos() throws Exception{
		ArrayList<Correo> recibidos = gestorCS.getServer().recibirNuevos(nombreUsuario, passUsuario);
		gestorCS.getInbox().recibirAInbox(recibidos);
	}
	


}