package ar.edu.unq.po2.tp5.mercadoCentral;

public class Impuesto implements Facturable{
    private Agencia agencia;
    private double montoImpuesto; 

    public Impuesto(Agencia agencia, double montoImpuesto) {
        this.agencia = agencia;
        this.montoImpuesto = montoImpuesto;
    }

    public double facturar() {
        // Before returning the amount, notify the agency
        agencia.registrarPago(new Factura(montoImpuesto, "Impuesto"));
        return montoImpuesto;
    }
}
