public class Funciones {

	/*
	 * esCapicua: Devuelve verdadero si el número que se pasa como pará- metro es
	 * capicúa y falso en caso contrario.
	 */

	public static boolean esPrimo(int n) {

		if (n < 2) {
			return false;
		} else {
			for (long i = n / 2; i >= 2; i--) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/* potencia: Dada una base y un exponente devuelve la potencia */

	public static int potencia(int base, int exponente) {
		if (exponente == 0) { 
			return 1; 
			} 
			if (exponente < 0) { 
			return 1/potencia(base, -exponente); 
			} 
			int n = 1; 
			for (int i = 0; i < Math.abs(exponente); i++) { 
			n = n * base; 
			} 
			return n; 
			}
	

	public static void main(String[] args) {

		System.out.print(esPrimo(7));

		System.out.println("");

		System.out.println("La potencia es " + potencia(2, 4));
	}

}
