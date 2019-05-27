/*Un restaurante nos ha encargado una aplicaci�n para colocar a los clientes en 
sus mesas. En una mesa se pueden sentar de 0 (mesa vac�a) a 4 comensales 
(mesa llena). Cuando llega un cliente se le pregunta cu�ntos son. De momento 
el programa no est� preparado para colocar a grupos mayores a 4, por tanto, 
si un cliente dice por ejemplo que son un grupo de 6, el programa dar� el
mensaje �Lo siento, no admitimos grupos de 6, haga grupos de 4 
personas como m�ximo e intente de nuevo�. Para el grupo que llega, 
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas 
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el 
grupo es de dos personas, se podr� colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada 
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El 
funcionamiento del programa se ilustra a continuaci�n:
Ejemplo:*/

package prueba;

import java.util.Scanner;

public class ejercicio15tema7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int comensales;
		
		int mesas[] = new int[10];
		
		
		System.out.println("Hola, �Cuantos son para comer?");
		comensales = s.nextInt();
		if(comensales>4) {
			
			System.out.println("Lo siento, no admitimos grupos de " + comensales + " haga grupos de cuatro e intentelo de nuevo");
		}
		

	}
}