package ar.edu.unq.po2.tp3.coordenadas.rectangulo.cuadrado;
import ar.edu.unq.po2.tp3.coordenadas.point.Point;
import ar.edu.unq.po2.tp3.coordenadas.rectangulo.Rectangulo;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Point pointA, float size ) {
		super(pointA, size, size);
	}
	
	public void setSize(float size) {
		this.setHeigth(size);
		this.setWidth(size);
	}
	public float getSize() {
		float size = this.getHeigth();
		return size;
	}
}
