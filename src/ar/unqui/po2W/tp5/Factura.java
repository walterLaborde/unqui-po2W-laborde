package ar.unqui.po2W.tp5;

public abstract class Factura {

	private IAgencia miAgencia;
	
	public Factura() {
		super();
	}

	private IAgencia getMiAgencia() {
		return miAgencia;
	}

	private void setMiAgencia(IAgencia miAgencia) {
		this.miAgencia = miAgencia;
	}

	public abstract double registrar();
	
	public void registrarPago(Factura this) {
		miAgencia.registrarPago(this);
	}
	
	public IAgencia miAgencia() {
		return this.getMiAgencia();
	}
	
	public void actualizarStock() throws Exception {
		// empty method
	}
}
