package ar.unqui.po2W.tp5;

public class Servicio implements IFactura{

	private double costoPorUnidad;
	private int unidadesConsumidas;
	
	
	
	public Servicio(double costoPorUnidad, int unidadesConsumidas) {
		super();
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
	public void registrar() {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarPago(IFactura factura) {
		// TODO Auto-generated method stub
		
	}
	
	

}
