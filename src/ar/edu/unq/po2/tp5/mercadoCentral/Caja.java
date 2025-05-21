package ar.edu.unq.po2.tp5.mercadoCentral;

import java.util.ArrayList;

public class Caja implements Agencia{
	private ArrayList<Facturable> facturables;
	private ArrayList<Factura> facturas;

	
	public Caja(ArrayList<Facturable> facturables) {
		this.facturables = facturables;
		this.facturas = new ArrayList<>();
	}
	
	public void registrarPago(Factura f) {
		facturas.add(f);
	}
	
	public double registrarFacturables() {
		double montoTotal = 0;
		for (Facturable f : facturables) {
			montoTotal += f.facturar();
		}
		return montoTotal;
	}
	
}
