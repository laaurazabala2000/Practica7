import java.util.ArrayList;

public class Vuelo {
	private int cod_vuelo;
	private Avion avion;
	private ArrayList<Pasajero> pasajeros;
	private Aeropuerto aeropuerto_salida;
	private Aeropuerto aeropuerto_llegada;
	
	public Vuelo(){}
	
	public Vuelo(int cod_vuelo){
		this.cod_vuelo = cod_vuelo;
	}
	
	public Vuelo(int cod_vuelo, Avion avion, ArrayList<Pasajero> pasajeros,
			Aeropuerto aeropuerto_salida, Aeropuerto aeropuerto_llegada) {
		super();
		this.cod_vuelo = cod_vuelo;
		this.avion = avion;
		this.pasajeros = pasajeros;
		this.aeropuerto_salida = aeropuerto_salida;
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public int getCod_vuelo() {
		return cod_vuelo;
	}

	public void setCod_vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Aeropuerto getAeropuerto_salida() {
		return aeropuerto_salida;
	}

	public void setAeropuerto_salida(Aeropuerto aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}

	public Aeropuerto getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}

	public void setAeropuerto_llegada(Aeropuerto aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}
	public void mostrarDatos(){
		System.out.println("******************************************");
		System.out.println("*  Vuelo: " + this.cod_vuelo +"\n" + "*  Aeropuerto de Salida: " + this.aeropuerto_salida.getNombre() +"\n" + "*  Aeropuerto de Llegada: " + this.aeropuerto_llegada.getNombre() );
		System.out.println("******************************************");
		System.out.println("\n ********** Datos del Avión del vuelo **********");
		this.avion.mostrarDatos();
		System.out.println("\n ********** Datos de los Pasajeros del vuelo **********");
		for (int i=0;i<pasajeros.size();i++){
    		if(pasajeros.get(i).getNombre()!=null){
    			pasajeros.get(i).mostrarDatos();
    		}
    	}
    }
}
