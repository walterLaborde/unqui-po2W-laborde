package ar.unqui.po2W.tp3;

public class Rectangle {
	
	// the origin of the rectangle
	private Point origin;
	
	private float height;
	private float width;
	
	// Getters and Setters
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	//constructor with origin determined by origin parameter
	public Rectangle(Point origin, float height, float width) {
		super();
		this.origin = origin ;
		this.height = height;
		this.width = width;
	}
	
	// returns the area of the rectangle 
	public float getArea() {
		return this.getWidth() * this.getHeight();
	}
	
	// returns the perimeter of the rectangle
	public float getPerimeter() {
		return 2 * (this.getWidth() + this.getHeight());
	}
	
	// describes whether the rectangle is horizontal or vertical
	public String orientation() {
		if (this.getWidth()>this.getHeight()) {
			return "Vertical";
		}
		else {
			return "Horizontal";
		}
	}
	
}
