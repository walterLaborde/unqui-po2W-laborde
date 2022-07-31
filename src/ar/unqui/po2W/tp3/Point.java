package ar.unqui.po2W.tp3;


public class Point {

	private float x;
	private float y;
	
	// constructor without fields... starts at (0,0)
	public Point() {
		super();
	}
	
	//constructor using fields
	public Point(float x, float y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	//Getters 
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	// Setters
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	// moves the actual point p1 to new position p2
	public void movePointTo(float nX, float nY) {
		this.setX(nX);
		this.setY(nY);
	}
	
	// returns the result of adding point p1 to point p2 
	public void addPointTo(Point p2) {
		float newX = this.getX() + p2.getX();
		float newY = this.getY() + p2.getY();
		this.setX(newX);
		this.setY(newY);
	}
	
}
