package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTestCase {
	
	//instance variables generation
	Rectangle rectangle1;
	Rectangle rectangle2;
	Point point;
	
	@BeforeEach
	public void setUp() throws Exception {
	
		// new Rectangle creation
		point = new Point(2,4);
		rectangle1 = new Rectangle(point, 3, 6);
		rectangle2 = new Rectangle(point, 5, 4);
	}
	
	@Test
	void testGetArea() {
		assertEquals(rectangle1.getArea(),18);
	}
	
	@Test
	void testGetPerimeter() {
		assertEquals(rectangle1.getPerimeter(),18);
	}
	
	@Test
	void testOrientationVertical() {
		assertEquals(rectangle1.orientation(),"Vertical");
	}
	
	@Test
	void testOrientationHorizontal() {
		assertEquals(rectangle2.orientation(),"Horizontal");
	}

}
