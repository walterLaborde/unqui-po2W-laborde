package ar.unqui.po2W.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	//constructor
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}

	//private Getters and Setters
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
	private List<Producto> getProductos() {
		return productos;
	}

	
	//public methods

	public int cantidadDeProductos() {
		return this.getProductos().size();
	}
	
	//this sums all product prices.
	public Double sumatoriaPrecioTotalProductos() {
		return this.getProductos().stream().collect(Collectors.summingDouble(p -> p.precio()));
	}
	
	//this adds a product to the array list without giving access to the setter directly
	public void agregarProducto(Producto p) {
		this.getProductos().add(p);
	}
}
