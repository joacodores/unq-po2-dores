package ar.edu.unq.po2.tp4.producto.productoPrimeraNecesidad;
import ar.edu.unq.po2.tp4.producto.Producto;

public class ProductoPrimeraNecesidad extends Producto{
	private int porcentajeDeDescuento;
	
	
	public ProductoPrimeraNecesidad(String n, double precio, Boolean esPrecioCuidado, int porcentaje) {
		super(n, precio, esPrecioCuidado);
		this.porcentajeDeDescuento = porcentaje;
	}
	
	public ProductoPrimeraNecesidad(String n, double precio, Boolean esPrecioCuidado) {
		super(n, precio, esPrecioCuidado);
		this.porcentajeDeDescuento = 10;
	}
	
	public double getPrecioProductoPrimeraNecesidad(){
		return this.precio - (this.precio * this.porcentajeDeDescuento)/100; 
	}
	
	@Override 
	public double getPrecio(){
		return getPrecioProductoPrimeraNecesidad();
	}

	public int getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public void setPorcentajeDeDescuento(int porcentajeDeDescuento) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
}
