package ar.unqui.po2W.tpObserver.Publicaciones;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Investigador implements Observer {

	private Publicacion publicacion;
	
	public Investigador(Publicacion publicacion) {
		super();
		this.setPublicacion(publicacion);
	}

	protected Publicacion getPublicacion() {
		return publicacion;
	}

	private void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
	// metodos para suscribirse y desuscribirse
	
	public void suscribirse(Publicacion p) {
		p.addObserver(this);
	}
	
	public void desuscribirse(Publicacion p) {
		p.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
