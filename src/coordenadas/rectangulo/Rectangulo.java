package coordenadas.rectangulo;
import coordenadas.point.Point;

public class Rectangulo {
	
	private Point a; //esquina superior izquierda
	private Point b; //esquina superior derecha
	private Point c; //esquina inferior derecha
	private Point d; //esquina inferior izquierda
	private float width;
	private float heigth;
	
	public Rectangulo(Point a, float width, float heigth) {
		this.a = a;
		this.b = a.getSumPoint(width, 0);
		this.c = a.getSumPoint(width, heigth);
		this.d = a.getSumPoint(0, heigth);
		this.width = width;
		this.heigth = heigth;

	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}
	
	//
	
	public float getRectangleArea() {
		float area = (this.heigth * this.width);
		return area;
	}
	
	public float getRectanglePerimeter() {
		float perimeter = (this.heigth * 2 + this.width * 2 );
		return perimeter;
	}
	
	public boolean isHorizontal() {
		return this.width > this.heigth; 
	}
	public boolean isVertical() {
		return this.width < this.heigth; 
	}
	
	
	
}
