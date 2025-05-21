package ar.edu.unq.po2.tp5.mercadoCentralTest;
import ar.edu.unq.po2.tp5.mercadoCentral.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private ProductoCooperativa cafe;
	private ProductoEmpresaTradicional leche;
	private ArrayList<Facturable> facturables; 
	private Caja caja1;
	
	@BeforeEach
	public void setUp() {
		cafe = new ProductoCooperativa("Cafe", 200d, 4);
		leche = new ProductoEmpresaTradicional("Leche", 100d, 2);
		ArrayList<Facturable> list = new ArrayList<> (Arrays.asList(cafe, cafe, cafe, leche, cafe));
		facturables = list;
		caja1 = new Caja(facturables);
	}
	         
	
	@Test
	public void testFacturarUnCafe() {
		double n = 180d;
		assertEquals(n, cafe.facturar());
		assertEquals(3, cafe.getStock());
	}
	
	@Test
	public void testFacturarTodo() {
		double n = 820d;
		assertEquals(n, caja1.registrarFacturables());
	}
	

}
