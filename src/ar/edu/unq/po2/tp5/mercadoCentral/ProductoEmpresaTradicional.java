package ar.edu.unq.po2.tp5.mercadoCentral;

public class ProductoEmpresaTradicional extends Producto {
    public ProductoEmpresaTradicional(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }
    
    @Override
    public double getMontoFinal() {
    	return getPrecioBase();
    }
}
