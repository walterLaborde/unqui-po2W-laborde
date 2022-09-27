package ar.unqui.po2W.tp5Streams;

import java.time.LocalTime;

public class ActividadSemanal {
	private DiaDeLaSemana diaDeLaSenama;
	private LocalTime horaInicio;
	private LocalTime duracion;
	private Deporte deporte;
	
	private DiaDeLaSemana getDiaDeLaSenama() {
		return diaDeLaSenama;
	}
	private void setDiaDeLaSenama(DiaDeLaSemana diaDeLaSenama) {
		this.diaDeLaSenama = diaDeLaSenama;
	}
	private LocalTime getHoraInicio() {
		return horaInicio;
	}
	private void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	private LocalTime getDuracion() {
		return duracion;
	}
	private void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	private Deporte getDeporte() {
		return deporte;
	}
	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	public ActividadSemanal(DiaDeLaSemana diaDeLaSenama, LocalTime horaInicio, LocalTime duracion, Deporte deporte) {
		super();
		this.setDiaDeLaSenama(diaDeLaSenama);
		this.setHoraInicio(horaInicio);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
	}
	
	public int costoDeActividad(ActividadSemanal actividad) {
		return actividad.costoPorComplejidad() + actividad.costoSegunDia();
	}
	
	public int costoPorComplejidad() {
		return this.getDeporte().getComplejidad();
	}
	
	public int costoSegunDia() {
		if(this.getDiaDeLaSenama().ordinal()<3) {
			return 500;
		}
		else return 1000;
	}
	
	public List<ActividadSemanal> actividadesDeFutbol()
	
}
