package ar.edu.unq.po2.tp4.supermercado;
import ar.edu.unq.po2.tp4.producto.*;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	private String nombreSupermercado;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String n, String d, List<Producto> ps) {
		this.nombreSupermercado = n;
		this.direccion = d;
		this.productos = ps;
		
	}
	
	public Supermercado(String n, String d) {
		this.nombreSupermercado = n;
		this.direccion = d;
		this.productos = new ArrayList<Producto>() ;
		
	}

	public String getNombreSupermercado() {
		return nombreSupermercado;
	}

	public void setNombreSupermercado(String nombreSupermercado) {
		this.nombreSupermercado = nombreSupermercado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public void setProductos(List<Producto> ps) {
		productos = ps;
	}
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p : productos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
	
	
	
}
