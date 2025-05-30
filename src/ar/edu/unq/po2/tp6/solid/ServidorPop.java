package ar.edu.unq.po2.tp6.solid;



import java.util.ArrayList;


public class ServidorPop implements IServidorSimple {
	
	public ArrayList<ClienteEMail> clientes;
	public ArrayList<Correo> recibidos;
	
	public ServidorPop() {
		this.clientes = new ArrayList<ClienteEMail>(); 
		this.recibidos = new ArrayList<Correo>(); 
		
	}
	
	public Boolean perteneceAServidor(String user, String pass) { // verifica que el usuario este dentro de los conectados
		return clientes.stream()
						.anyMatch(cliente -> cliente.getUsuario().equals(user)
							              && cliente.getPass().equals(pass));
				
	}
	
	public ArrayList<Correo> recibirNuevos(String user, String pass) throws Exception  {
		ArrayList<Correo> retorno = new ArrayList<Correo>();
		if (perteneceAServidor(user, pass)) {
			for (Correo recibido : recibidos) {
				retorno.add(recibido);
			}
		return retorno;
		}else throw new Exception("El cliente no se encuentra en el servidor");

	}

	public void conectarUsuario(ClienteEMail cliente) {
	   clientes.add(cliente);
	}
	
	public void recibirCorreo(Correo c) {
		recibidos.add(c);
	}
	
	public ClienteEMail getClienteByUser(String user) throws Exception {
		for(ClienteEMail cliente : clientes) {
			if(cliente.getUsuario().equals(user)) {
				return cliente;
			}
		}throw new Exception("El cliente no se encuentra en el servidor");
		
	}
	public void enviarCorreoDePara(ClienteEMail emisor, String userReceptor, Correo correo) throws Exception {
		ClienteEMail receptor = getClienteByUser(userReceptor);
		String pass = receptor.getPass();
		if (perteneceAServidor(userReceptor, pass)) {
			receptor.getServidor().recibirCorreo(correo);
		}else throw new Exception("El cliente no se encuentra en el servidor");
	}

	


}
