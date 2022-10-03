package ar.unqui.po2W.tp5;

public class Cooperativa extends Producto {

	private double porcentajeDeDescuento;

	public Cooperativa(double precioBase, int cantEnStock, double descuento) {
		super(precioBase, cantEnStock);
		this.setPorcentajeDeDescuento(descuento);
	}

	private double getPorcentajeDeDescuentoo() {
		return porcentajeDeDescuento;
	}

	private void setPorcentajeDeDescuento(double descuento) {
		this.porcentajeDeDescuento = descuento;
	}
	
	@Override
	public double precio() {
		return super.precio() - (super.precio() * (this.getPorcentajeDeDescuentoo() / 100));
	}

	@Override
	public double registrar() {
		return this.precio();
	}

}
