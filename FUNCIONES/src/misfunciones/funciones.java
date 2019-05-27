package misfunciones;


public class funciones {
	public static int suma(int a, int b) {

		int sumatorio = a + b;

		return sumatorio;

	}

	public static Boolean esPrimo(long n) {
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

	public static long voltea(long x) {
		if (x < 0) {
			return -voltea(-x);
		}

		long volteado = 0;
		while (x > 0) {
			volteado = (volteado * 10) + (x % 10);
			x = x / 10;
		}
		return volteado;
	}

	/**
	 * Le da la vuelta a un número.
	 * 
	 * @param x número al que se le quiere dar la vuelta
	 * @return número volteado (al revés)
	 */
	public static boolean esCapicua(long x) {
		return x == voltea(x);
	}

	public static boolean esCapicua(int x) {
		return esCapicua((long) x);
	}

	public static int digitos(long x) {
		if (x < 0) {
			x = -x;
		}
		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10; // se le quita un dígito a x
				n++; // incrementa la cuenta de dígitos
			}
			return n;
		}
	}

	/**
	 * Cuenta el número de dígitos de un número entero.
	 * 
	 * @param x número al que se le quieren contar los dígitos
	 * @return número de dígitos que tiene el número que se pasa como parámetro
	 */
	public static int digitos(int x) {
		return digitos((long) x);
	}

	public static int digitoN(long x, int n) {
		x = voltea(x);
		while (n-- > 0) {
			x = x / 10;
		}
		return (int) x % 10;
	}
	
	public static double potencia(int base, int exponente) { 
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
	

	/**
	 * /* Devuelve el dígito que está en la posición n de un número entero. Se
	 * empieza contando por el 0 y de izquierda a derecha.
	 * 
	 * @param x número entero 463 Apéndice E. Soluciones a los ejercicios
	 * @param n posición dentro del número <code>x</code>
	 * @return dígito que está en la posición n del número <code>x</code>
	 * 
	 *         empezando a contar por el 0 y de izquierda a derecha
	 */
	public static int digitoN(int x, int n) {
		return digitoN((long) x, n);
	}

	public static int posicionDeDigito(long x, int d) {
		int i;
		for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {
		}
		;
		if (i == digitos(x)) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * Da la posición de la primera ocurrencia de un dígito dentro de un número
	 * entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param x número entero
	 * @param d dígito a buscar dentro del número
	 * @return posición de la primera ocurrencia del dígito dentro del número o
	 * 
	 *         -1 si no se encuentra
	 */
	public static int posicionDeDigito(int x, int d) {
		return posicionDeDigito((long) x, d);
	}

}