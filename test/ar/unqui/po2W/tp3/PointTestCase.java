package ar.unqui.po2W.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	//SUT(single unit test)... the class for testing
	// instance variable generation 
	Point point;
	Point pointWithParameters1;
	Point pointWithParameters2;
	
	@BeforeEach
	public void setup() throws Exception {
		//setUp section
		// new Point creation and assignment to the variable
		point = new Point();
		pointWithParameters1 = new Point(2,5);
		pointWithParameters2 = new Point(-4,1);
	}
	
	//@Test
	void testPoint00() {
		// new Point without parameters returns (0,0) coordinates
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);
	}
	
	@Test
	void testPointWithParameters() {
		// new Point with parameters
		assertEquals(pointWithParameters1.getX(),2);
		assertEquals(pointWithParameters1.getY(),5);
	}

	
	@Test
	void testMovePointTo() {
		// the point moved has new parameters
		pointWithParameters1.movePointTo(1, 1);
		assertEquals(pointWithParameters1.getX(), 1);
		assertEquals(pointWithParameters1.getY(), 1);
	}
	
	@Test
	void testAddPointTo() {
		// new Point without parameters returns (0,0) coordinates
		pointWithParameters1.addPointTo(pointWithParameters2.getX(),pointWithParameters2.getY());
		assertEquals(pointWithParameters1.getX(), -2);
		assertEquals(pointWithParameters1.getY(), 6);
	}
}
