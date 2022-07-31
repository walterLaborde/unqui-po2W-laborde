package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTestCase {

	//instance variables declaration
	Square square;
	Point origin;
	
	@BeforeEach
	public void setUp() throws Exception {
		//new Square creation
		origin = new Point(3,5);
		square = new Square(origin, 9);
	}
	
	@Test
	void testArea() {
		assertEquals(square.getArea(),81);
	}
	
	@Test
	void testPerimeter() {
		assertEquals(square.getPerimeter(),36);
	}

}
