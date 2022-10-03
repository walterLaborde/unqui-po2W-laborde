package ar.unqui.po2W.tp5;

public class Impuesto extends Factura {

	private double tasaDeServicio;

	public Impuesto(IAgencia miAgencia, double tasaDeServicio) {
		super(miAgencia);
		this.setTasaDeServicio(tasaDeServicio);
	}

	private double getTasaDeServicio() {
		return tasaDeServicio;
	}

	private void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}


	@Override
	public double registrar() {
		return this.getTasaDeServicio();
	}

	@Override
	public void registrarPago(Impuesto this) {
		this.registrarPago();
	}

	
}
