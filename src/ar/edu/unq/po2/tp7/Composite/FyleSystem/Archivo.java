package ar.edu.unq.po2.tp7.Composite.FyleSystem;

import java.time.LocalDate;

public class Archivo implements Archivable{
	
	private String nombre;
	private double tamanioEnMB;
	private LocalDate fechaDeUltimaModificacion;
	
	public Archivo(String n, double t, LocalDate f ) {
		this.nombre = n;
		this.tamanioEnMB = t;
		this.fechaDeUltimaModificacion = f;
	}
	
	public  String getNombre() {
		return nombre;
	}

	public double totalSize() {
		return tamanioEnMB;
	}

	public void printStructure() {
		System.out.println(nombre);
	}
	
	public LocalDate lastModified() {
		return fechaDeUltimaModificacion;
	}
	
	public Archivo oldestElement() {
		return this;
	}
}
