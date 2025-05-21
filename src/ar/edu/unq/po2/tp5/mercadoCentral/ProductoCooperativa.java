package ar.edu.unq.po2.tp5.mercadoCentral;

public class ProductoCooperativa extends Producto {
	private double descuentoIVA;
	
    public ProductoCooperativa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
        this.descuentoIVA = 10;
    }
    


	public double getDescuentoIVA() {
		return descuentoIVA;
	}

	public void setDescuentoIVA(float descuentoIVA) {
		this.descuentoIVA = descuentoIVA;
	}
	
	public double aplicarDescuento(double p, double descuento) {
		return p - p * (descuento/100);
	}
	
    @Override 
    public double getMontoFinal() {
    	double p = getPrecioBase();
    	double descuentoIVA = getDescuentoIVA();
    	return aplicarDescuento(p, descuentoIVA);
    }
}
