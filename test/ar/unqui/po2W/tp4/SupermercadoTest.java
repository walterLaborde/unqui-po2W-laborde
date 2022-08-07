package ar.unqui.po2W.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.cantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.cantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0.0d, supermercado.sumatoriaPrecioTotalProductos()); //new Double(0)
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9d, supermercado.sumatoriaPrecioTotalProductos()); // new Double(93.9)
	}
}
