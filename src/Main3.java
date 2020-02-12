import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los arraylist principales de todas las entidades
		ArrayList<Comandante> comandantes = new ArrayList<Comandante>();
		ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
		ArrayList<Avion> aviones = new ArrayList<Avion>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
		ArrayList<Aeropuerto> aeropuertos1 = new ArrayList<Aeropuerto>();
		ArrayList<Aeropuerto> aeropuertos2 = new ArrayList<Aeropuerto>();
		ArrayList<Aeropuerto> aeropuertos3 = new ArrayList<Aeropuerto>();
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		ArrayList <Integer> telefonos = new ArrayList <Integer>();
		ArrayList <String> rangos = new ArrayList <String>();
		Arrays [] Comandante1 = new Arrays[4];
		Arrays [] Comandante2 = new Arrays[4];
		Arrays [] Comandante3 = new Arrays[4];
		Arrays [] Comandante4 = new Arrays[4];
		Avion [] Avion1 = new Avion[4];
		
		//Rellenamos los arraylist con datos.
		rellenarComandantes(comandantes);
		rellenarAviones(aviones);
		rellenarPasajeros(pasajeros);
		rellenarAeropuertos(aeropuertos);
		rellenarAeropuertos1(aeropuertos1);
		rellenarAeropuertos2(aeropuertos2);
		rellenarAeropuertos3(aeropuertos3);
		rellenarAvioness(Avion1);
		rellenarTelefonos(telefonos);
		EliminarPasajero(vuelos, telefonos, pasajeros);
		
		//avionesOrdenados(aviones);
		//for (int i = 0; i < aviones.size(); i++) {
			//System.out.println(aviones.get(i).getMatricula());
		//}	
		rellenarAvionesprincipal1(aviones, Avion1);
		for (int i = 0; i < aviones.size(); i++) {
			System.out.println(aviones.get(i).getModelo());
		}
		
		EliminarPasajero(vuelos, telefonos, pasajeros);
		for (int i = 0; i < pasajeros.size(); i++) {
			System.out.println(pasajeros.get(i).getNombre());
		}
		
		}
	
	
	public static void rellenarComandantes(ArrayList<Comandante> comandantes) {
		comandantes.add(new Comandante("Eric", "Moody", 667448798, "09844578P", (byte)40, "Comandante"));
		comandantes.add(new Comandante("Richard", "Champion", 665123325, "09877458K", (byte)54, "Comandante Primero"));
		comandantes.add(new Comandante("Malcolm", "Waters", 667448798, "97745589Y", (byte)35, "Comandante"));
		comandantes.add(new Comandante("John", "Coward", 745112145, "09312345R", (byte)61, "Comandante"));
		comandantes.add(new Comandante("Chesley", "Sully", 666978847, "01255478H", (byte)29, "Comandante Primero"));
		comandantes.add(new Comandante("Bryce ", "McCormick ", 666123456, "12566987D", (byte)44, "Comandante"));
		comandantes.add(new Comandante("Bob", "Pearson ", 621332263, "36899746J", (byte)49, "Comandante"));
		comandantes.add(new Comandante("Robert", "Schornstheimer", 611147898, "12144987C", (byte)52, "Comandante Primero"));
	}
	public static void rellenarPasajeros(ArrayList<Pasajero> pasajeros) {
		pasajeros.add(new Pasajero("Pablo", "Costa", 667448798, "09844578P", (byte)18));
		pasajeros.add(new Pasajero("Bruno", "Cortés", 665123325, "09877458K", (byte)19));
		pasajeros.add(new Pasajero("Ivan", "Jimenez", 667448798, "97745589Y", (byte)20));
		pasajeros.add(new Pasajero("David", "Hinojosa", 745112145, "09312345R", (byte)21));
		pasajeros.add(new Pasajero("Bladimir", "Vargas", 666978847, "01255478H", (byte)21));
		pasajeros.add(new Pasajero("Manuel", "Barriopedro ", 666123456, "12566987D", (byte)28));
		pasajeros.add(new Pasajero("Arturo", "Fernandez ", 621332263, "36899746J", (byte)21));
		pasajeros.add(new Pasajero("Eduardo", "Limia", 611147898, "12144987C", (byte)23));
		pasajeros.add(new Pasajero("Dimitro", "Abayduyin", 667448798, "09844578P", (byte)40));
		pasajeros.add(new Pasajero("Adrian", "Gonzalez", 665123325, "09877458K", (byte)23));
		pasajeros.add(new Pasajero("Alejandro", "Torres", 667448798, "97745589Y", (byte)29));
		pasajeros.add(new Pasajero("Sergio", "Alvarez", 745112145, "09312345R", (byte)21));
		pasajeros.add(new Pasajero("Natividad", "Martinez", 666978847, "01255478H", (byte)16));
		pasajeros.add(new Pasajero("Antonio", "Andrino ", 666123456, "12566987D", (byte)19));
		pasajeros.add(new Pasajero("Alejandro", "Lopez ", 621332263, "36899746J", (byte)27));
		pasajeros.add(new Pasajero("Jaime", "Casanueva", 611147898, "12144987C", (byte)20));
		pasajeros.add(new Pasajero("Alejandro", "SAnchez", 611147898, "12144987C", (byte)19));
		pasajeros.add(new Pasajero("Javier", "Hurtado", 667448798, "09844578P", (byte)40));
		pasajeros.add(new Pasajero("Naggy", "Siddeg", 665123325, "09877458K", (byte)20));
		pasajeros.add(new Pasajero("Pablo", "Diez", 667448798, "97745589Y", (byte)21));
		pasajeros.add(new Pasajero("Gregorio", "Eyi Ipico", 745112145, "09312345R", (byte)19));
		pasajeros.add(new Pasajero("Paloma", "Lopez", 666978847, "01255478H", (byte)23));
		pasajeros.add(new Pasajero("Ian", "Lopez ", 666123456, "12566987D", (byte)22));
		pasajeros.add(new Pasajero("Kim", "Seungeun ", 621332263, "36899746J", (byte)19));
	
	}
	public static void rellenarAviones(ArrayList<Avion> aviones) {
		aviones.add(new Avion("Boing 737", 200, "A119811", 100, 2011));
		aviones.add(new Avion("Boing 747", 250, "G119866", 100, 2010));
		aviones.add(new Avion("Boing 727", 250, "F119865", 100, 2008));
		aviones.add(new Avion("Boing 747", 250, "E119834", 100, 2010));
		aviones.add(new Avion("Boing 777", 200, "H119863", 100, 2017));
		aviones.add(new Avion("Boing 767", 300, "W119892", 100, 2016));
		aviones.add(new Avion("Boing 757", 400, "K119861", 100, 2015));
	}
	public static void rellenarAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
		aeropuertos.add(new Aeropuerto("Adolfo Suarez", "Madrid", "001"));
		aeropuertos.add(new Aeropuerto("El Prat", "Barcelona", "002"));
		aeropuertos.add(new Aeropuerto("JFK", "New York", "003"));
		aeropuertos.add(new Aeropuerto("Reino de León", "León", "004"));
		aeropuertos.add(new Aeropuerto("Pisuerga", "Valladolid", "005"));
		aeropuertos.add(new Aeropuerto("Cid Campeador", "Burgos", "006"));
		aeropuertos.add(new Aeropuerto("AirCochinillo", "Segovia", "007"));
		aeropuertos.add(new Aeropuerto("Matacan", "Salamanca", "008"));
	}
	public static void rellenarAeropuertos1(ArrayList<Aeropuerto> aeropuertos1) {
		aeropuertos1.add(new Aeropuerto("Barajas", "Madrid", "009"));
		aeropuertos1.add(new Aeropuerto("Velvet", "Francia", "010"));
		
	}
	public static void rellenarAeropuertos2(ArrayList<Aeropuerto> aeropuertos2) {
		aeropuertos2.add(new Aeropuerto("Barajas", "Madrid", "009"));
		aeropuertos2.add(new Aeropuerto("Velvet", "Francia", "010"));
		
	}
	public static void rellenarAeropuertos3(ArrayList<Aeropuerto> aeropuertos3) {
		aeropuertos3.add(new Aeropuerto("Barajas", "Madrid", "009"));
		aeropuertos3.add(new Aeropuerto("Velvet", "Francia", "010"));
		
	}
	public static void rellenarAvioness(Avion[] Avion1) {
		Avion1[0]= new Avion("Boing 342", 234, "S456987", 700, 2078);
		Avion1[1]= new Avion("Boing 267", 780,"D458712" , 200, 2012);
		Avion1[2]= new Avion("Boing 267", 780,"D458712" , 200, 2011);
		Avion1[3]= new Avion("Boing 727", 250, "F119865", 100, 2008);
		
	}
	
	public static void rellenarTelefonos (ArrayList <Integer> telefonos) {
		telefonos.add(new Integer ("611147898"));
		telefonos.add(new Integer ("666123456"));
		telefonos.add(new Integer ("653214980"));
		telefonos.add(new Integer ("609874321"));
		
	}
	public static void rellenarRangos (ArrayList <String> rangos) {
		rangos.add(new String ("Comandante1"));
		rangos.add(new String ("Comandante2"));
		rangos.add(new String ("Comandante3"));
		rangos.add(new String ("Comandante4"));
	}
public static ArrayList<Pasajero> metodo(ArrayList <Pasajero> Pasajeros, String letra, String palabra ) {
	for (int i = 0; i < Pasajeros.size(); i++) {
		if(Pasajeros.get(i).getDni().endsWith(letra)) {
			Pasajeros.remove(i);
			
		}
		
		if(Pasajeros.get(i).getApellidos().contentEquals(palabra)) {
			Pasajeros.remove(i);
		}
		
	}
	
	return Pasajeros;
}


public static void rellenarAvionesprincipal(ArrayList <Avion> aviones, Avion[] Avion1) {
	for (int i = 0; i < Avion1.length; i++) {
		
		aviones.add(Avion1[i]);
		
	}
	
	
	
}
public static void rellenarAvionesprincipal1(ArrayList <Avion> aviones, Avion[] Avion1) {
	boolean encontrado;
	for (int i = 0; i < Avion1.length; i++) {
		for (int j = 0; j < aviones.size(); j++) {
		if((Avion1[i].getMatricula().equalsIgnoreCase(aviones.get(j).getMatricula()))) {
			encontrado=false;
			
				
		} else {
			encontrado=true;
		}
		}
		if (encontrado=true) {
			aviones.add(Avion1[i]);
		}
		
		
		
	
		
	}
	
	
	
}

public static ArrayList<Pasajero> EliminarPasajero(ArrayList <Vuelo> Vuelos, ArrayList <Integer> telefonos, ArrayList<Pasajero> Pasajeros) {
	for (int i = 0; i < telefonos.size(); i++) {
		for (int j = 0; j < Vuelos.size(); j++) {
			for (int x = 0; x < Pasajeros.size(); x++) {
			if(telefonos.contains(Vuelos.get(j).getPasajeros().get(x).getTelefono())) {
			Pasajeros.remove(x);
				
			}
			
		
		}
		
		
	}
	}
	
	return Pasajeros;
	
}


public static ArrayList <Comandante> Aeropuertos(ArrayList <Aeropuerto> aeropuertos, ArrayList <String> rangos, ArrayList <Avion> aviones) {
	for (int i = 0; i < aeropuertos.size(); i++) {
		for (int j = 0; j < rangos.size(); j++) {
				for (int k = 0; k < aviones.size(); k++) {
				if(rangos.contains(aeropuertos.get(i).getAviones().get(k).getComandante().getRango())) {
				
					
				}	
				}
				
				
			}
			
		}
	return null;
		
	}
	
}




