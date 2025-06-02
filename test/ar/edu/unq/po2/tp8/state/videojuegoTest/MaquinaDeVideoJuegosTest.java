package ar.edu.unq.po2.tp8.state.videojuegoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.state.videojuego.MaquinaDeVideoJuegos;

class MaquinaDeVideoJuegosTest {
	private MaquinaDeVideoJuegos maquina;
	
	@BeforeEach
	public void setUp() throws Exception{
		maquina = new MaquinaDeVideoJuegos();
	}
	
	@Test
	void testMaquinaNoTieneFichas() {
		maquina.presionarBotonInicio();;
		assertEquals(maquina.getFichas(), 0);
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		assertEquals(maquina.getFichas(), 2);
		maquina.presionarBotonInicio();;
		assertEquals(maquina.getFichas(), 0);
	}

}
