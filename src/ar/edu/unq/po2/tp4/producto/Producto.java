package ar.edu.unq.po2.tp4.producto;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean esPreciosCuidados;
	
	public Producto(String n, double p, boolean esPrecioCuidado) {
		this.nombre = n;
		this.precio = p;
		this.esPreciosCuidados = esPrecioCuidado;
	}

	public Producto(String n, double p) {
		this.nombre = n;
		this.precio = p;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPreciosCuidados;
	}

	public void setEsPreciosCuidados(boolean esPreciosCuidados) {
		this.esPreciosCuidados = esPreciosCuidados;
	}
	
	public void aumentarPrecio(double n) {
		this.precio += n;
	}
	

	
	
}
