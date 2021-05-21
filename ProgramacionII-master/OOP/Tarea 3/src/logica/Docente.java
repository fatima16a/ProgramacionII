package logica;
import java.time.LocalDate;
public class Docente {
	private LocalDate fechaIngreso;

	public Docente(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
