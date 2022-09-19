package ar.unqui.po2W.tp5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
	public void testRegistrarProducto() {
		caja.registrarProducto(prod1);
		assertEquals(prod1.stockActual(),3);
		assertTrue(caja.productosEnCaja().contains(prod1));
	}
	
	@Test
	public void testMontoTotal() {
		caja.registrarProducto(prod1);
		caja.registrarProducto(prod2);
		caja.registrarProducto(prod3);
		assertEquals(caja.montoTotal(),233.00);
	}
	
	@Test
	public void testProductosEnCaja() {
		caja.registrarProducto(prod1);
		caja.registrarProducto(prod2);
		caja.registrarProducto(prod3);
		assertEquals(caja.productosEnCaja().size(),3);
	}
}
