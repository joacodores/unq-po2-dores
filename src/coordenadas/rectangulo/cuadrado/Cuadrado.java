package coordenadas.rectangulo.cuadrado;
import coordenadas.point.Point;
import coordenadas.rectangulo.Rectangulo;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Point pointA, float size ) {
		super(pointA, size, size);
	}
	
	@Override
	public void setWidth(float width) {
	    throw new UnsupportedOperationException("No se puede modificar solo el ancho de un cuadrado.");
	}
	
	@Override
	public void setHeigth(float heigth) {
	    throw new UnsupportedOperationException("No se puede modificar solo el alto de un cuadrado.");
	}
}
