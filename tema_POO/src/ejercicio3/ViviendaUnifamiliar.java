package ejercicio3;

public class ViviendaUnifamiliar extends Vivienda {
	private int tamJardin;

	public ViviendaUnifamiliar(int tam) {

		super();
		this.tamJardin = tam;
	}

	public ViviendaUnifamiliar(int metrosCuadrados, int numeroDeHabitaciones, boolean tieneGaraje, String orientacion,
			int tam) {
		super(metrosCuadrados, numeroDeHabitaciones, tieneGaraje, orientacion);
		this.tamJardin = tam;
	}
	public int getTamJardin() {

		return this.tamJardin;
	}

	@Override
	public String toString() {
		return "ViviendaUnifamiliar [tamJardin=" + tamJardin + ", getMetrosCuadrados()=" + getMetrosCuadrados()
				+ ", getNumeroDeHabitaciones()=" + getNumeroDeHabitaciones() + ", isTieneGaraje()=" + isTieneGaraje()
				+ ", getOrientacion()=" + getOrientacion() + "]";
	}

}
