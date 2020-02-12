import java.util.ArrayList;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String codigo_aeropuerto;
    private ArrayList<Avion> aviones;

    public Aeropuerto(){}

    public Aeropuerto(String nombre, String ciudad, String codigo_aeropuerto, ArrayList<Avion> aviones){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigo_aeropuerto = codigo_aeropuerto;
        this.aviones=aviones;
    }
    public Aeropuerto(String nombre, String ciudad, String codigo_aeropuerto){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigo_aeropuerto = codigo_aeropuerto;
        
    }

    public Aeropuerto(String codigo_aeropuerto){
        this.codigo_aeropuerto = codigo_aeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_aeropuerto() {
        return codigo_aeropuerto;
    }
    
    public ArrayList<Avion> getAviones() {
        return this.aviones;
    }
    public void setAviones(ArrayList<Avion> aviones) {
        this.aviones=aviones;
    }

    public void setCodigo_aeropuerto(String codigo_aeropuerto) {
        this.codigo_aeropuerto = codigo_aeropuerto;
    }

    public void mostrarDatos(){
    	System.out.println("******************************************");
    	System.out.println("*  Aeropuerto: " + this.nombre +"\n" + "*  Ciudad: " + this.ciudad +"\n" + "*  Codigo: " + this.codigo_aeropuerto);
    	System.out.println("******************************************");
    	for (int i=0;i<aviones.size();i++){
    		if(aviones.get(i).getModelo()!=null){
    			aviones.get(i).mostrarDatos();
    		}
    	}
    }
    public void mostrarDatosCod(int num){
    	if (Integer.parseInt(this.codigo_aeropuerto)<num){
    		System.out.println("******************************************");
        	System.out.println("*  Aeropuerto: " + this.nombre +"\n" + "*  Ciudad: " + this.ciudad +"\n" + "*  Codigo: " + this.codigo_aeropuerto);
        	System.out.println("******************************************");
    	}
    	
    }

}
