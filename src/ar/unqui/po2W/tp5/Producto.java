package ar.unqui.po2W.tp5;

public abstract class Producto {

	private double precioBase;
	private int cantEnStock;
	
	public Producto(double precioBase, int cantEnStock) {
		super();
		this.setPrecioBase(precioBase);
		this.setCantEnStock(cantEnStock);
	}

	// private getters and setters
	private double getPrecioBase() {
		return precioBase;
	}

	private void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	private int getCantEnStock() {
		return cantEnStock;
	}

	private void setCantEnStock(int cantEnStock) {
		this.cantEnStock = cantEnStock;
	}
	
	//public methods
	public double precio() {
		return this.getPrecioBase();
	}
	
	public void actualizarStock() {
		if (this.getCantEnStock() > 0) {
			this.cantEnStock -= 1;
		}
		else {
			this.cantEnStock = 0;
		}
	}
	
	public int stockActual() {
		return this.getCantEnStock();
	}
	
}
