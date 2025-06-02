package ar.edu.unq.po2.tp8.state.mp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mp3Test {
	private MP3 mp3;
	private Song almaDeDiamante;
	
	@BeforeEach
	public void setUp() throws Exception{
		mp3 = new MP3();
		almaDeDiamante = new Song("Alma de Diamante");
		
		
	}
	
	@Test
	void testAgregarCancionAlMP3YReproducir() {
		mp3.agregarCancion(almaDeDiamante);
		mp3.seleccionarCancion(almaDeDiamante);
		mp3.botonPlay();
		mp3.botonPause();
		mp3.botonPause();
		mp3.stop();
	}
	
}
