package ar.edu.unq.po2.tp3.multioperador;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.Arrays;


public class  MultipoperadorTestCase  {
	private Multioperador multioperador;

	
	@BeforeEach
	public void setUp() throws Exception {
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(10,15,20,5));
		multioperador = new Multioperador(lista);

	}
	@Test
	public void testSumTotal() {
		int suma = multioperador.sumTodos();
		assertEquals(suma, 50);
	}
	@Test
	public void testRestaTotal() {
		int resta = multioperador.restarTodos();
		assertEquals(resta, -30);
	}
	@Test
	public void testProductoTotal() {
		int producto = multioperador.multiplicarTodos();
		assertEquals(producto, 15000);
	}

}
