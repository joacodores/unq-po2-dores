package ar.edu.unq.po2.tp3.coordenadas.rectangulo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.coordenadas.point.*;
import ar.edu.unq.po2.tp3.coordenadas.rectangulo.Rectangulo;

class RectanguloTestCase {
	
	private Rectangulo rectangulo; 
	private Point pointA;
	
	@BeforeEach 
	public void setUp() throws Exception{
		pointA = new Point(10, 5);
		rectangulo = new Rectangulo(pointA, 15, 10); 
	}
	
	@Test
	void testRectangulo() {
		Point pointB = rectangulo.getB();
		Point pointC = rectangulo.getC();
		Point pointD = rectangulo.getD();
		
		float width = rectangulo.getWidth();
		float heigth = rectangulo.getHeigth();
		
		assertEquals(pointB.getX(),25 );
		assertEquals(pointB.getY(),5 );
		
		assertEquals(pointC.getX(),25 );
		assertEquals(pointC.getY(),15 );
		
		assertEquals(pointD.getX(),10 );
		assertEquals(pointD.getY(),15 );

		assertEquals(width, 15);
		assertEquals(heigth, 10);
		
	}
	
	void testRectangleArea() {
		float rArea = rectangulo.getRectangleArea();
		assertEquals(rArea, 150);
	}
	void testRectanglePerimeter() {
		float rPerimeter = rectangulo.getRectanglePerimeter();
		assertEquals(rPerimeter, 50);
	}
	void testIsVertical() {
		assertFalse(rectangulo.isVertical());
	}
	void testIsHorizontal() {
		assertTrue(rectangulo.isHorizontal());
	}
	

}
