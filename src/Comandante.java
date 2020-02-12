public class Comandante {
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private byte edad;
	private String rango;

	public Comandante(){}

	public Comandante(String nombre, String apellidos, int telefono, String dni, byte edad, String rango){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
        this.edad = edad;
        this.rango = rango;
    }

	public Comandante(String dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void mostrarDatos(){
    	System.out.println("******************************************");
    	System.out.println("*  Nombre y apelidos: " + this.nombre + " " + this.apellidos +"\n" + "*  DNI: " + this.dni +"\n" + "*  Edad: " + this.edad + " años." +"\n" + "*  Rango: " + this.rango);
    	System.out.println("******************************************");
    }
    public void mostrarNArango(String rango){
    	if (this.rango.equalsIgnoreCase(rango)){
    		System.out.println("******************************************");
        	System.out.println("*  Nombre y apelidos: " + this.nombre + " " + this.apellidos );
        	System.out.println("******************************************");
    	}
    	
    }
}
