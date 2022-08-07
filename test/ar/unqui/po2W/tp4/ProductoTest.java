package ar.unqui.po2W.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.nombre());
		assertEquals(18.9d, arroz.precio()); //(new Double(18.9)
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.nombre());
		assertEquals(55, vino.precio()); //new Double(55)
		assertFalse(vino.esPrecioCuidado());
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.precio());//new Double(20.4)
	}
}
