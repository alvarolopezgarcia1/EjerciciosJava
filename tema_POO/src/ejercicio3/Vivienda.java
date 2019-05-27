/*Ejercicio 3 
¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?
• Atributos de Vivienda: metrosCuadrados, numeroDeHabitaciones, tieneGaraje,
orientacion
• Subclases de Vivienda: Piso, Adosado, Cortijo*/

package ejercicio3;

public class Vivienda {

	private int metrosCuadrados;

	private int numeroDeHabitaciones;

	private boolean tieneGaraje;

	private String orientacion;

	public Vivienda(int metrosCuadrados, int numeroDeHabitaciones, boolean tieneGaraje, String orientacion) {
		this.metrosCuadrados = metrosCuadrados;
		this.numeroDeHabitaciones = numeroDeHabitaciones;
		this.tieneGaraje = tieneGaraje;
		this.orientacion = orientacion;
	}

	public Vivienda() {
		
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumeroDeHabitaciones() {
		return numeroDeHabitaciones;
	}

	public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
		this.numeroDeHabitaciones = numeroDeHabitaciones;
	}

	public boolean isTieneGaraje() {
		return tieneGaraje;
	}

	public void setTieneGaraje(boolean tieneGaraje) {
		this.tieneGaraje = tieneGaraje;
	}

	public String getOrientacion() {
		return orientacion;
	}

	@Override
	public String toString() {
		return "Vivienda [metrosCuadrados=" + metrosCuadrados + ", numeroDeHabitaciones=" + numeroDeHabitaciones
				+ ", tieneGaraje=" + tieneGaraje + ", orientacion=" + orientacion + "]";
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	


}


