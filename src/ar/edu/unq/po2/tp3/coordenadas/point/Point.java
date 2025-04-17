package ar.edu.unq.po2.tp3.coordenadas.point;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	public void setPointer(float x, float y) {
		setX(x);
		setY(y);
	}
	
	
	
	public void sumPointer(float x, float y) {
		float newX = getX() + x;
		float newY = getY() + y;
		setX(newX);
		setY(newY);
	}
	
	public Point getSumPoint(float x, float y) {
		float newX = getX() + x;
		float newY = getY() + y;
		Point p = new Point(newX,newY);
		return p;
	}
	
	
	
	

}
