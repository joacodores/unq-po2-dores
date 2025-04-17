package ar.edu.unq.po2.tp3.coordenadas.rectangulo.cuadrado;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.coordenadas.point.Point;
import ar.edu.unq.po2.tp3.coordenadas.rectangulo.cuadrado.Cuadrado;

class CuadradoTestCase {
	private Cuadrado cuadrado; 
	private Point pointA;
	
	@BeforeEach 
	public void setUp() throws Exception{
		pointA = new Point(5, 5);
		cuadrado = new Cuadrado(pointA, 10); 
	}
	@Test
	void testCuadrado() {
		Point pointB = cuadrado.getB();
		Point pointC = cuadrado.getC();
		Point pointD = cuadrado.getD();
		
		float size = cuadrado.getSize();
		
		assertEquals(pointB.getX(),15);
		assertEquals(pointB.getY(),5 );
		
		assertEquals(pointC.getX(),15 );
		assertEquals(pointC.getY(),15 );
		
		assertEquals(pointD.getX(),5 );
		assertEquals(pointD.getY(),15 );

		assertEquals(size, 10);
		
	}
	void testRectangleArea() {
		float rArea = cuadrado.getRectangleArea();
		assertEquals(rArea, 100);
	}
	void testRectanglePerimeter() {
		float rPerimeter = cuadrado.getRectanglePerimeter();
		assertEquals(rPerimeter, 40);
	}
	
	

}
