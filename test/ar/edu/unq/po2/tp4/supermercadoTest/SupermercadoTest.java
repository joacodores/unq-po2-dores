package ar.edu.unq.po2.tp4.supermercadoTest;
import ar.edu.unq.po2.tp4.supermercado.*;
import ar.edu.unq.po2.tp4.producto.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() throws Exception{
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		double n = 0;
		double m = 93.9;
		assertEquals(n, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(m, supermercado.getPrecioTotal());
	}
}
