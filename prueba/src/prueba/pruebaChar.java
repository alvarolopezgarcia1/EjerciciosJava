package prueba;



public class pruebaChar {

	public static void main(String[] args) {
		int numero = 470213;
		System.out.println(numero);
		String composicion = "";
		String numero2 = Integer.toString(numero);

		for (int i = 0; i < numero2.length(); i++) {
			char posicion = numero2.charAt(i);

			switch (posicion) {
			case '0':
				composicion += "cero ,";
				break;
			case '1':
				composicion += "uno ,";
				break;
			case '2':
				composicion += "dos ,";
				break;
			case '3':
				composicion += "tres ,";
				break;
			case '4':
				composicion += "cuatro ,";
				break;
			case '5':
				composicion += "cinco ,";
				break;
			case '6':
				composicion += "seis ,";
				break;
			case '7':
				composicion += "siete ,";
				break;
			case '8':
				composicion += "ocho ,";
				break;
			case '9':
				composicion += "nueve ,";
				break;
			}
		}
		System.out.println(composicion);

	}

}
