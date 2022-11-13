package ar.unqui.po2W.tpObserver.Publicaciones;

public class Autor {

	private String nombre;
	private String universidad;
	private String laboratorio;
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUniversidad() {
		return universidad;
	}
	private void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	private void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Autor(String nombre, String universidad, String laboratorio) {
		super();
		this.setNombre(nombre);
		this.setUniversidad(universidad);
		this.setLaboratorio(laboratorio);
	}
	
	
}
