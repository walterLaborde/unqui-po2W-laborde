package ar.unqui.po2W.tpObserver.Publicaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Publicacion extends Observable {

	private Articulo articulo;
	private List<Investigador> suscriptores; 

	public Publicacion(Articulo articulo) {
		super();
		this.setArticulo(articulo);	
		this.setSuscriptores(new ArrayList<Investigador>());
	}

	protected List<Investigador> getSuscriptores() {
		return suscriptores;
	}

	private void setSuscriptores(List<Investigador> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	private void setArticulo(Articulo articulo) {
		this.articulo = articulo;
		this.setChanged();
		this.notifyObservers();
	}
	
	
}
