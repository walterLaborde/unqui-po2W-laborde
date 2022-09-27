package ar.unqui.po2W.tp5Streams;

public enum ColorDeLesionesDermatologicas {

	Rojo ("Herida reciente", 4),
	Gris("Herida comenzando a curar", 3),
	Amarillo("Herida en proceso de curación avanzado", 2),
	Miel("Herida curada", 1);

	String descripcion;
	int nivelDeRiesgo;
	
	ColorDeLesionesDermatologicas(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	
	//TODO: lo tengo que arreglar el return debe ser la clase
	public int siguienteDe(ColorDeLesionesDermatologicas color) {
		
		return color.ordinal();
	}
}
