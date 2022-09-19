package ar.unqui.po2W.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CooperativaTestCase {

	private Cooperativa prodCoop1;
	
	@BeforeEach
	public void setUp() throws Exception {
		prodCoop1 = new Cooperativa(100,4,20);
	}
	
	@Test
	void testPrecio() {
		assertEquals(prodCoop1.precio(),80);
	}
	

}
