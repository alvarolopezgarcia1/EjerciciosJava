/* Con este programa podrás jugar al piedra, papel o tijera. Tu eliges la cantidad de movimientos y el sistema genera aleatoriamente
 * un movimiento. Al final quien haya ganado más rondas será el ganador de la partida, pudiendo también exixtir empate.
 */


import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de jugadas que quiere hacer");

		int movimientos = s.nextInt();

		System.out.println("Recuerde que piedra gana a tijera, tijera gana a papel y papel gana a piedra");

		System.out.println("");

		System.out.println("Ahora introduzca piedra, papel o tijera tantas veces como jugadas haya decidido hacer");

		for (int i = 0; i <= movimientos; i++) {
			String jugada = s.nextLine();
		}

		System.out.println("");

		System.out.println("Ahora se genera al azar piedra, papel o tijera, compare el primer resultado introducido, "
				+ "con el primero generado por el sistema y así consecutivamente, ganará la partida el que gane más rondas :");
		
		System.out.println("");

		for (int i = 0; i < movimientos; i++) {

			int jugada2 = (int) (Math.random() * 3) + 1;
			switch (jugada2) {
			case 1:
				System.out.println("En la tirada " + i + " el ordenador juega piedra");
				break;
			case 2:
				System.out.println("En la tirada " + i + " el ordenador juega papel");
				break;
			case 3:
				System.out.println("En la tirada " + i + " el ordenador juega tijera");
				break;

			default:
			}
		}

		System.out.println("");
		System.out.println("Introduzca el numero de jugadas ganadas");

		int jugadasGanadas = s.nextInt();

		System.out.println("");

		System.out.println("Introduzca el numero de jugadas perdidas");

		int jugadasPerdidas = s.nextInt();

		if (jugadasGanadas > jugadasPerdidas) {

			System.out.println("Has ganado la partida");
		}
		if (jugadasGanadas < jugadasPerdidas) {

			System.out.println("Has perdido la partida");
		}

		if (jugadasGanadas == jugadasPerdidas) {

			System.out.println("Empate, vuelve a intentarlo!!!");
		}
	}

}
