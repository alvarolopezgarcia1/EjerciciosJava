package examen_clubes;

//CLUB

import java.util.*;

public class Club {
	private String nombre;
	private ArrayList<Jugador> plantilla = new ArrayList<Jugador>();
	private Persona presidente;

	public Club(String nombre) {
		this.nombre = nombre;
	}

	public void setPresidente(Persona persona) {
		presidente = persona;
	}

	public Persona getPresidente() {
		return presidente;
	}

	public ArrayList<Jugador> aniadir(Jugador jugador) {
		if (!this.plantilla.contains(jugador)) {
			plantilla.add(jugador);
		} else {
			System.out.println("Ya existe ese DNI, por tanto " + jugador + " no se añade");
		}
		return plantilla;
	}

	public Jugador mirarJugador(String dni) {
		for (Jugador aux : this.plantilla) {
			if (aux.getDni().equals(dni)) {
				return aux;
			}
		}
		System.out.println("no existe");
		return null;
	}

	public void borrarJugador(String dni) {
		// empiezan desde 1
		for (int i = 1; i < plantilla.size(); i++) {
			if (plantilla.get(i).getDni().equals(dni)) {
				plantilla.remove(plantilla.get(i));
			}
		}
	}

	public void traspasar(Club club, String dni) {
		for (int i = 1; i <= plantilla.size(); i++) {
			if (plantilla.get(i).getDni().equals(dni)) {
				System.out.println("El dni existe, vamos a añadir a: ");
				System.out.println(plantilla.get(i));
				club.aniadir(plantilla.get(i));
				plantilla.remove(plantilla.get(i));
				break;
			}
		}
	}

	public String toString() {
		String jugadores = "";
		int contador = 0;
		for (Jugador aux : plantilla) {
			jugadores += aux;
			jugadores += "\n";
		}
		return jugadores;
	}
}