package logica;
public class Curso extends Materia{
	private String nombre;
	private Estudiante estudiante;
	private Materia[] CursoMateria;

	
	public Curso(String nombre, Materia[] CursoMateria) {
		super();
		
		this.CursoMateria=CursoMateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
