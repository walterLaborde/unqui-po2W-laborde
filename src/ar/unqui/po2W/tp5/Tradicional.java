package ar.unqui.po2W.tp5;

public class Tradicional extends Producto {

	public Tradicional(double precioBase, int cantEnStock) {
		super(precioBase, cantEnStock);
	}

	@Override
	public double registrar() {
		return this.precio();
	}

}
