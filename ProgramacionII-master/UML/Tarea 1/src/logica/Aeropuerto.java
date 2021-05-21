package logica;
public class Aeropuerto {
	private int id;
	private String nombre;
	private Aeropuerto (String n,int i) {
		nombre=n;
		id=i;
	} 
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre; 
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id) {
		this.id=id; 
	}
}
