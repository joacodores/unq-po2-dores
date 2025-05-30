package ar.edu.unq.po2.tp6.solid.tddTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.solid.tdd.*;


class BancoTDDTest {
	private Banco banco;
	private Cliente cliente1;
	
	@BeforeEach
	public void setUp() throws Exception{
		banco = new Banco();
		Propiedad p = new Propiedad("111", "11", 50000d);
		cliente1 = new Cliente("Joaquin", "Dores", "Laprida 123", 64, 5000d, p);
		banco.registrarCliente(cliente1);
	}
	


	@Test
	void un_banco_registra_cliente() {
		
		assertTrue(banco.getClientes().contains(cliente1));
		assertEquals(cliente1.getBanco(),banco);
	}
	
	@Test
	void cliente_cobra_500_al_mes_y_6000_al_anio() {
		assertEquals(cliente1.getSueldoNetoMensual(),5000d);
		assertEquals(cliente1.getSueldoNetoAnual(),60000d);
	}
	
	@Test 
	void solicitud_De_Credito_tiene_700_de_monto_de_cuotas_mensuales() {
		SolicitudDeCredito s1 = new SolicitudDeCreditoPersonal(cliente1, 7000d, 10);
		assertEquals(s1.getMontoCuotasMensuales(), 700d);
	}
	
	@Test
	void solicitud_De_Credito_Personal_Es_Aceptable_Por_Cliente() {
		SolicitudDeCreditoPersonal sp1 = new SolicitudDeCreditoPersonal(cliente1, 700d, 10);
		assertTrue(sp1.esAceptable());
	}
	
	@Test
	void solicitud_De_Credito_Hipotecario_Es_Aceptable_Por_Cliente() {
		SolicitudDeCreditoHipotecario sh1 = new SolicitudDeCreditoHipotecario(cliente1, 700d, 11);
		assertTrue(sh1.esAceptable());
	}
	
	@Test
	void cliente_solicita_solicitud_a_banco_y_este_la_registra() {
		cliente1.solicitarCreditoPersonal(100d, 5);
		assertEquals(banco.getSolicitudes().size(),1);
	}
	

}
