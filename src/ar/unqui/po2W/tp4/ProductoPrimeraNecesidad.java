package ar.unqui.po2W.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuento;
	
	//constructor
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuento(descuento);
	}

	// private Getters and Setters
	private double getDescuento() {
		return descuento;
	}

	private void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	// public methods
	public Double descuento() {
		return this.getDescuento();
	}
	
	public Double precio() {
		return this.getPrecio() * this.getDescuento(); 
	}
}
