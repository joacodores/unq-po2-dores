package ar.edu.unq.po2.tp6.solid;

import java.util.ArrayList;


public interface IServidorSimple {
	
	public ArrayList<Correo> recibirNuevos(String user, String pass) throws Exception;

	public void conectarUsuario(ClienteEMail cliente);

	public void enviarCorreoDePara(ClienteEMail emisor, String recepetor, Correo correo) throws Exception;
	
	public void recibirCorreo(Correo c);
}
	