package coordenadas.point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PointTestCase {
	
	private Point point;
	private Point pointZero;
	
	@BeforeEach
	public void setUp() throws Exception {
		point = new Point(1, 5);
		pointZero = new Point();
	}
	
	@Test
	public void testPointValues() {
		float x = point.getX();
		float y = point.getY();
		
		float xZero = pointZero.getX();
		float yZero = pointZero.getY();
		
		assertEquals(1, x);
		assertEquals(5, y);
		
		assertEquals(0, xZero);
		assertEquals(0, yZero);
		
	}
	
	@Test
	public void testPointSetter() {
		point.setPointer(15, 20);
		float x = point.getX();
		float y = point.getY();
		
		assertEquals(15, x);
		assertEquals(20, y);
	}
	
	@Test
	public void testPointSum() {
		point.sumPointer(15, 20);
		float x = point.getX();
		float y = point.getY();
		
		assertEquals(16, x);
		assertEquals(25, y);
	}

}
