package logica;
public class Vuelo {
	private int fecha;
	private int hora;
	private Avion avion;
	private Pasajero pasajero;
	private Aeropuerto destino;
	private Aeropuerto origen;
	
	private Vuelo(int f, int h,Avion a) {
		fecha=f;
		hora=h;
		avion=a;
	}
	private Vuelo(int f, int h,Pasajero p) {
		fecha=f;
		hora=h;
		pasajero=p;
	}
	private Vuelo(int f, int h,Aeropuerto o,Aeropuerto d) {
		fecha=f;
		hora=h;
		origen=o;
		destino=d;	
	}
	public int getFecha() {
		return this.fecha;
	}
	public void setFecha(int fecha) {
		this.fecha=fecha;
	}
	public int getHora() {
		return this.hora;
	}
	public void setHora(int hora) {
		this.hora=hora;
	}
	public Avion getAvion() {
		return this.avion;
	}
	public void setAvion(Avion avion) {
		this.avion=avion;
	}
	public Pasajero getPasajero() {
		return this.pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero=pasajero;
	}
	public Aeropuerto getOrigen() {
		return this.origen;
	}
	public void setOrigen(Aeropuerto origen) {
		this.origen=origen;
	}
	public Aeropuerto getDestino() {
		return this.destino;
	}
	public void setDestino (Aeropuerto destino) {
		this.destino=destino;
	}
}
