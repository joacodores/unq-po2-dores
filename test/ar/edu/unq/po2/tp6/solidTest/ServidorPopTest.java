package ar.edu.unq.po2.tp6.solidTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.solid.*;

class ServidorPopTest {
	
	public ServidorPop server;
	public ClienteEMail cliente1;
	public ClienteEMail cliente2;
	
	@BeforeEach
	public void setUp() {
		server = new ServidorPop();
		cliente1 = new ClienteEMail("joaquin", "123", server);
		cliente2 = new ClienteEMail("martin", "123", server);
	}
	@Test
	void testCliente1MandaMailACliente2YLoRecibe() throws Exception {
		cliente1.enviarCorreo("Test re piola", "martin", "si esto se muestra en pantalla soy la cabra");
		cliente1.enviarCorreo("Test re pila", "martin", "si est se muestra en pantalla soy la cabra");
		cliente2.recibirNuevos();
		assertEquals(cliente2.contarInbox(), 2);
	}

}
