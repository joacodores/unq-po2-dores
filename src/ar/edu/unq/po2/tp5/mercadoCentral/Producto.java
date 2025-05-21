package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Producto implements Facturable{
	protected String nombre;
	protected double precioBase;
	protected int stock;
	
	public Producto(String n, double p, int s) {
		this.nombre = n;
		this.precioBase = p;
		this.stock = s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public boolean hayStockDisponible() {
		return stock > 0; 
	}
	
	public void decrementarStock() {
		this.stock -= 1;
	}
	
	public double facturar() {
		if (hayStockDisponible() ){
			decrementarStock();
			return getMontoFinal();
		} else throw new RuntimeException("No hay Stock");
	}
	
	public abstract double getMontoFinal();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
