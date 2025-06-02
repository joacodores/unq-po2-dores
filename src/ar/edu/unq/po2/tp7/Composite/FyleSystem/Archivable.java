package ar.edu.unq.po2.tp7.Composite.FyleSystem;

import java.time.LocalDate;

public interface Archivable {

	public  String getNombre();

	public double totalSize() ;

	public void printStructure(); 
	
	public LocalDate lastModified();
	
	public Archivo oldestElement();
}
