package ar.unqui.po2W.tpObserver.Publicaciones;

import java.util.List;

public class Articulo {

	private String titulo;
	private String tipo;
	private String lugarPublicacion;
	private List<Autor> autores;
	private List<String> palabrasClave;
	
	public String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	private void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	private void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	private void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
	
	
}
