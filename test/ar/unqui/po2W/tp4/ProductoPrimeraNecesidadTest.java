package ar.unqui.po2W.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad lecheBarata;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,0.9d);
		arroz = new ProductoPrimeraNecesidad("Arroz", 8d, false,0.92d);
		lecheBarata = new ProductoPrimeraNecesidad("lecheBarata", 8d, false,0.89d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.precio()); //new Double(7.2)
		assertEquals(7.36, arroz.precio());
		assertEquals(7.12, lecheBarata.precio());
	}
}
