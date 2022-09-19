package ar.unqui.po2W.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TradicionalTestCase {
	
	Tradicional prodTrad1;
	
	@BeforeEach
	public void setUp() throws Exception {
		prodTrad1 = new Tradicional(200,1);
	}
	
	@Test
	void testPrecioBase() {
		assertEquals(prodTrad1.precio(),200);
	}

}
