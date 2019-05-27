
public class ej1prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int jugada2 = (int) (Math.random() * 3) + 1; // genera un número aleatorio
		// entre el 1 y el 7
		switch (jugada2) {
		case 1:
			System.out.println("piedra");
			break;
		case 2:
			System.out.println("papel");
			break;
		case 3:
			System.out.println("tijera");
			break;

		default:
		}
	}
}