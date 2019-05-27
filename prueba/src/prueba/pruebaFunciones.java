package prueba;

public class pruebaFunciones {

	public static void main(String[] args) {
		System.out.println(suma(2, 4));

		System.out.println(potencia(4));

		System.out.println(EsMayor(10));

		System.out.println(division(8, 2));
		
		System.out.println(cuadrado (4));

	}
	
	public static int cuadrado ( int a) {
		
		int cuadrado= a*a;
		return cuadrado;
	}

	public static int suma(int a, int b) {

		int sumatorio = a + b;

		return sumatorio;

	}

	public static int potencia(int a) {

		int potenciadeA = a * a;

		return potenciadeA;

	}

	public static boolean EsMayor(int n) {

		int numeroAComparar = 7;
		if (n > numeroAComparar) {
			return true;
		} else

		{
			return false;
		}
	}

	public static float division(float a, float b) {

		float divisionado = a / b;

		return divisionado;
	}

}
