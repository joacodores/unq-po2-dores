package ar.edu.unq.po2.tp4.productoPrimeraNecesidadTest;
import ar.edu.unq.po2.tp4.producto.productoPrimeraNecesidad.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(6.4d, leche.getPrecio());
	}
}

