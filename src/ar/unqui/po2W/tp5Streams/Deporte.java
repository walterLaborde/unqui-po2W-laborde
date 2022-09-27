package ar.unqui.po2W.tp5Streams;

public enum Deporte {
	Running(1),
	Futbol(2),
	Basket(2),
	Tennis(3),
	Jabalina(4);
	
	private int complejidad;

	Deporte(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getComplejidad() {
		return this.complejidad;
	}

	private void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
}
