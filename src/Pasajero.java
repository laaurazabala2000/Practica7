public class Pasajero {
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private byte edad;

	public Pasajero(){}

    public Pasajero(String nombre, String apellidos, int telefono, String dni, byte edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
        this.edad = edad;
    }

    public Pasajero(String dni){
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

    public void mostrarDatos(){
    	System.out.println("******************************************");
    	System.out.println("*  Nombre y apelidos: " + this.nombre + " " + this.apellidos +"\n" + "*  DNI: " + this.dni +"\n" + "*  Edad: " + this.edad + " años.");
    	System.out.println("******************************************");
    }
    
    public boolean mayorEdad(){
    	if (this.edad>=18){
    		return true;
    	}else{
    		return false;
    	}
    }
    public void sumaEdad(int num){
    	//Hacemos un casting para pasar el int a byte ya que el atributo edad es de tipo byte.
    	this.edad=(byte) (this.edad + num);
    }
    public void nombreSiMayorEdad(int num){
    	//Hacemos un casting para pasar el int a byte ya que el atributo edad es de tipo byte.
    	if (this.edad>num){
    		System.out.println("******************************************");
        	System.out.println("*  Nombre y apelidos: " + this.nombre + " " + this.apellidos);
        	System.out.println("******************************************");
    	}
    }
    
}