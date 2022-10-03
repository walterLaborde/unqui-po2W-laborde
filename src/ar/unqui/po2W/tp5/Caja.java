package ar.unqui.po2W.tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.unqui.po2W.tp5.Producto;

public class Caja {

	List<IRegistrable> registrables = new ArrayList<IRegistrable>();

	public Caja() {
		super();
	}

	private List<IRegistrable> getRegistrables() {
		return registrables;
	}	
	
	
	public void registrarRegistrable(IRegistrable r) throws Exception {
		r.actualizarStock();
		this.getRegistrables().add(r);
		
	}
	
	public double montoTotal() {
		return this.getRegistrables().stream().collect(Collectors.summingDouble(r -> r.registrar()));
		// return this.getRegistrables().stream().collect(Collectors.summingDouble(r -> r.precio()));
		// esto ya no sirve... tengo que directamente ofrecer el precio en el metodo
		// registrar... porque registrables ya no 
	}

}
