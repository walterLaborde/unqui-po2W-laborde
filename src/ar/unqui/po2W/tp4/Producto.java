package ar.unqui.po2W.tp4;

public class Producto {

	private String nombre;
	private Double precio;
	private boolean esPrecioCuidado = false;
	
	//constructors 2 options
	public Producto(String nombre, Double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public Producto(String nombre, Double precio, boolean esPrecioCuidado) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
	}
	
	// private Getters and Setters
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Double getPrecio() {
		return precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	private boolean esEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	private void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	//public methods
	
	public String nombre() {
		return this.getNombre();
	}
	
	public Double precio() {
		return this.getPrecio();
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double p) {
		this.setPrecio(this.getPrecio() + p);
	}

}
