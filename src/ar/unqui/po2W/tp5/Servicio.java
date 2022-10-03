package ar.unqui.po2W.tp5;

public class Servicio extends Factura{

	private double costoPorUnidad;
	private int unidadesConsumidas;
	
	
	public Servicio(IAgencia miAgencia, double costoPorUnidad, int unidadesConsumidas) {
		super(miAgencia);
		this.setCostoPorUnidad(costoPorUnidad);
		this.setUnidadesConsumidas(unidadesConsumidas);
	}

	private double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	private void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	private int getUnidadesConsumidas() {
		return unidadesConsumidas;
	}

	private void setUnidadesConsumidas(int unidadesConsumidas) {
		this.unidadesConsumidas = unidadesConsumidas;
	}

	@Override
	public double registrar() {
		return this.getCostoPorUnidad() * this.getUnidadesConsumidas();
	}

	@Override
	public void registrarPago(Servicio this) {
		this.registrarPago();
	}

	@Override
	public void actualizarStock() throws Exception {
		//empty method
	}
	
	

}
