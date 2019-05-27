
public class Furgoneta extends Coche {

	private int capacidadExtra;

	private int plazasExtra;

	public Furgoneta(int plazasExtra, int capacidadExtra) {

		super();// llamamos al constructor de la clase padre(coche)

		this.capacidadExtra = capacidadExtra; // le damos valor a las variables propias

		this.plazasExtra = plazasExtra;

	}

	public String dameDatosFurgoneta() {

		return "La capacidad de carga es: " + capacidadExtra + " las plazas son: " + plazasExtra;
	}

}