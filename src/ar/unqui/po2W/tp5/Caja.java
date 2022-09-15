package ar.unqui.po2W.tp5;

import java.util.ArrayList;
import java.util.List;

import ar.unqui.po2W.tp5.Producto;

public class Caja {

	List<Producto> productos = new ArrayList<Producto>();

	public Caja() {
		super();
	}

	private List<Producto> getProductos() {
		return productos;
	}	
	
	public void registrarProducto(Producto p) {
		p.actualizarStock();
		this.getProductos().add(p);
	}
	
	
}
