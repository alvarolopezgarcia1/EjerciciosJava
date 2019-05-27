
public class pruebaFunciones {

	public static void main(String[] args) {

		System.out.println(adivinaPalabra("perro"));

		System.out.println(devuelveCodigoAscii('s'));

		System.out.println(generaNumeroAleatorio(400, 200));

		System.out.println(factorial(5));

		System.out.println(esPrimo(7));

	}

	public static boolean adivinaPalabra(String palabra) {

		String palabraIntroducida = "perro";
		if (palabra.equals(palabraIntroducida)) {

			return true;
		} else {

			return false;
		}
	}

	public static int devuelveCodigoAscii(char caracter) {

		return (int) caracter;
	}

	public static int generaNumeroAleatorio(int maximo, int minimo) {

		return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));

	}

//NUMERO FACTORIAL:Multiplca un numero introducido por el numero anterior repetidamente hata llegar a 1, SI EL NUMERO ES GRANDE SE SALE DEL RANGO
	public static int factorial(int num) {

		if (num < 0) {

			System.out.println("No se puede calcular factorial de un numero negativo");

			return -1;
		}

		if (num == 0 || num == 1) {

			return 1;

		}

		int resultado = num;

		for (int i = (num - 1); i > 1; i--) {

			resultado *= i;
		}

		return resultado;
	}

	public static boolean esPrimo(int num) {

		if (num <= 1) {

			return false;
		}

		for (int i = (int) Math.sqrt(num); i > 1; i--) {

			if (num % i == 0) {

				return false;
			}
		}
		return true;

	}

}
