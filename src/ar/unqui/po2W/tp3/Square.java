package ar.unqui.po2W.tp3;

public class Square {

	// the origin of the square
		private Point origin;
		private float side;
		
		// Getters and Setters
		public float getSide() {
			return side;
		}
		public void setSide(float side) {
			this.side = side;
		}
		
		//constructor with origin determined by origin parameter
		public Square(Point origin, float side) {
			super();
			this.origin = origin ;
			this.side = side;
		}
		
		// returns the area of the square 
		public float getArea() {
			return (float) Math.pow(this.getSide(),2);
		}
		
		// returns the perimeter of the square
		public float getPerimeter() {
			return 4 * this.getSide();
		}

}
