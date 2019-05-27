//Este programa cuenta las vocales de una palabra
public class cuentaVocales {

	public static void main(String[] args) {
		
		System.out.println(cuentaVocales("perro"));

	}

	public static int cuentaVocales(String frase) {

		int contador = 0;
		char vocales[] = { 'a', 'e', 'i', 'o', 'u' };

		char caracterActual;

		boolean esVocal;

		for (int i = 0; i < frase.length(); i++) {

			caracterActual = frase.charAt(i);

			esVocal = false;

			for (int j = 0; j < vocales.length && !esVocal; j++) {

				if (caracterActual == vocales[j]) {

					esVocal = true;
				}

			}

			if (esVocal) {

				contador++;
			}
			
			

		}
		
		return contador;
	}
}
