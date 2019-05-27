
package tema6Array;
/*Ejercicio 15 
Un restaurante nos ha encargado una aplicación para colocar a los clientes en 
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales 
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento 
el programa no está preparado para colocar a grupos mayores a 4, por tanto, 
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 
personas como máximo e intente de nuevo”. Para el grupo que llega, 
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas 
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el 
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada 
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El 
funcionamiento del programa se ilustra a continuación:*/

import java.util.*;

public class ej15Mesas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] mesas = new int[10];
		int comensales = 0;

		
	
		do {
			System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
			comensales = s.nextInt();
			if(comensales>4) {
				System.out.println(
						"Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
			}
			
			System.out.println("MESAS ANTES");
			for (int i = 0; i < 10; i++) {
				mesas[i] = (int) (Math.random() * 4 + 1);
			
				System.out.print(mesas[i]+", ");
			}
			
			System.out.println("");
			
			System.out.println("MESAS DESPUES");
			
			int iVacia=0;
			
		
			
			if (comensales >= 0 || comensales <= 4) {
				for (int i = 0; i < 10; i++) {
					if (mesas[i] == 0) {
						iVacia=mesas[i];
						comensales=iVacia;
					}
					if (mesas[i] >= 0 && mesas[i] + comensales < 4) {

						iVacia=mesas[i];
						comensales=iVacia;

					}

					System.out.print(mesas[i]+", ");
				}

			}
		
		} while (comensales != -1);
	}

}
