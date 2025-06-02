package ar.edu.unq.po2.tp7.Composite.FyleSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio implements Archivable{
	private String nombre;
	private ArrayList<Archivable> contenido;
	private LocalDate fechaDeCreacion;
	
	public Directorio (String n, LocalDate f ) {
		this.nombre = n;
		this.contenido = new ArrayList<Archivable>();
		this.fechaDeCreacion = f;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void agregarArchivo(Archivable a) {
		contenido.add(a);
	}
	
	public double totalSize() {
		double tSize = 0;
		for(Archivable a : contenido) {
			tSize += a.totalSize();
		}
		return tSize;
	}

	public void printStructure() {
		for(Archivable a : contenido) {
			a.printStructure();
		};
	}
	public static LocalDate max(LocalDate f1, LocalDate f2) {
        if (f1.isAfter(f2)) {
            return f1;
        } else {
            return f2;
        }
    }
	public LocalDate lastModified() {
		LocalDate lastMod = null;
		for(Archivable a : contenido) {
			lastMod =  max(a.lastModified(), lastMod);
		}
		return lastMod;
	}
	
	public Archivo oldestElement() {
		Archivo oldest = null;
		for(Archivable a : contenido) {
			oldest =  oldestBetween(a.oldestElement(), oldest);
		}
		return oldest;
	}

	private Archivo oldestBetween(Archivo a1, Archivo a2) {
        if (a1.lastModified().isAfter(a2.lastModified())) {
            return a2;
        } else {
            return a1;
        }
	}
}
