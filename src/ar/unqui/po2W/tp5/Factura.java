package ar.unqui.po2W.tp5;

public abstract class Factura {

	private IAgencia miAgencia;
	
	public Factura(IAgencia miAgencia) {
		super();
		this.setMiAgencia(miAgencia);
	}

	private IAgencia getMiAgencia() {
		return miAgencia;
	}

	private void setMiAgencia(IAgencia miAgencia) {
		this.miAgencia = miAgencia;
	}

	@Override
	public abstract double registrar();
	
	public void registrarPago(Factura this) {
		miAgencia.registrarPago(this);
	}
	
	public IAgencia miAgencia() {
		return this.getMiAgencia();
	}
}
