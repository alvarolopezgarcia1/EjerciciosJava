/*Ejercicio 2 
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de 
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea 
también algún método específico para cada una de las subclases. Prueba las 
clases creadas mediante un programa con un menú como el que se muestra
a continuación:
VEHÍCULOS 
========= 
1. Anda con la bicicleta 
2. Haz el caballito con la bicicleta 
3. Anda con el coche 
4. Quema rueda con el coche 
5. Ver kilometraje de la bicicleta 
6. Ver kilometraje del coche 
7. Ver kilometraje total 
8. Salir 
Elige una opción (1-8): 
*/

package EJERCICIO2;

public class Vehiculos {

	// ATRIBUTOS DE CLASE
	private static int vehiculosCreados;

	private static int kilometrosTotales;

	// ATRIBUTO DE INSTANCIA

	private int kilometrosRecorridos;

	public Vehiculos() {

		this.kilometrosRecorridos = 0;
	}

	public int getkilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}

	public static int getKilometrosTotales() {
		return Vehiculos.kilometrosTotales;
	}

	public void recorre(int km) {
		this.kilometrosRecorridos += km;
		Vehiculos.kilometrosTotales += km;
	}

}
