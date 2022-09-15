package ar.unqui.po2W.tp5;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CajaTestCase {

	private Caja caja;
	private Cooperativa prod1;
	private Tradicional prod2;
	private Tradicional prod3;
	
	@BeforeEach
	public void SetUp() throws Exception {
		caja = new Caja();
		prod1 = new Cooperativa(100, 4, 10);
		prod2 = new Tradicional(96, 8);
		prod3 = new Tradicional(47, 8);
	}
	
	@Test
	void testRegistrarProducto() {
		caja.registrarProducto(prod1);
		//assertEquals(prod1.getCantEnStock(),3);
		//assertEquals(caja)
	}
}
