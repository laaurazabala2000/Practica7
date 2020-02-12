
public class Avion {
	private String modelo;
	private int capacidad;
	private String matricula;
	private int deposito;
	private int anno;
	private Comandante comandante;

	public Avion (){}

	public Avion (String modelo, int capacidad, String matricula, int deposito, int anno, Comandante comandante){
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.deposito = deposito;
        this.anno = anno;
        this.matricula = matricula;
        this.comandante=comandante;
    }
	public Avion (String modelo, int capacidad, String matricula, int deposito, int anno){ 
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.deposito = deposito;
        this.anno = anno;
        this.matricula = matricula;
    }
    //metodo que devuelve la suma de unidades del deposito
    //mas dos numeros pasados por parametro.
	public int sumaDeposito(int num1, int num2){
    	return this.deposito+num1+num2;
    }
    
    
	public void aumentaCapa(){
    	this.capacidad=this.capacidad+10;
    }
	public void restaCapa(int num){
    	this.capacidad=this.capacidad-num;
    }
    
	public int dameUltPosMo(){
    	return this.modelo.length()-1;
    }
	public Comandante getComandante() {
        return comandante;
    }
	public void setComandante(Comandante coman) {
        this.comandante=coman;
    }
	public String getModelo() {
        return modelo;
    }

	public void setModelo(String modelo) {
        this.modelo = modelo;
    }

	public int getCapacidad() {
        return capacidad;
    }

	public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

	public String getMatricula() {
        return matricula;
    }

	public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

	public int getDeposito() {
        return deposito;
    }

	public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

	public int getAnno() {
        return anno;
    }

	public void setAnno(int anno) {
        this.anno = anno;
    }

	public void mostrarDatos(){
		System.out.println("******************************************");
		System.out.println("*  Modelo avion: " + this.modelo +"\n" + "*  Capacidad: " + this.capacidad +"\n" + "*  Matrícula: " + this.matricula +"\n" + "*  Capacidad deposito: " + this.deposito +"\n" + "*  Año de fabricacion: " + this.anno);
		System.out.println("******************************************");
		System.out.println("\n********* Datos del Comandante que pilota el Avión ********");
		this.comandante.mostrarDatos();
	}


public void modelo() {
	System.out.println(this.modelo);
}
}