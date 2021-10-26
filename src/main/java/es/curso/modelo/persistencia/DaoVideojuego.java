package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.curso.modelo.entidad.Videojuego;

public class DaoVideojuego {

	public DaoVideojuego() {
		
	}
	
	List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
	Videojuego j1 = new Videojuego(1, "lol", "Riot", 4.5);
	Videojuego j2 = new Videojuego(2, "Far Cry", "Ubisoft", 6.5);
	Videojuego j3 = new Videojuego(3, "Fallout", "Bethesda", 8.2);
	Videojuego j4 = new Videojuego(4, "Call of Duty", "Activision", 6.3);
	Videojuego j5 = new Videojuego(5, "Grand Theft Auto", "Rockstar", 9.5);
	
	public List<Videojuego> listar(){
		listaVideojuegos.add(j1);
		listaVideojuegos.add(j2);
		listaVideojuegos.add(j3);
		listaVideojuegos.add(j4);
		listaVideojuegos.add(j5);
				
		return listaVideojuegos;		
	}
	
	public Videojuego obtener(int id) {
		if(id == 1) {
			return j1;
		}else if(id == 2) {
			return j2;
		}else if(id == 3) {
			return j3;
		}else if(id == 4) {
			return j4;
		}else if(id == 5) {
			return j5;
		}else {
			return null;
		}
	}
}
