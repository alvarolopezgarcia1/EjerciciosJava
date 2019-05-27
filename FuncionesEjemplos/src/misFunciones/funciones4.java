package misFunciones;

public class funciones4{

	public static void main(String[] args) {

		int arr2[] = { 5, 3, 6, 2, 2, 6 };
		int arr3[] = {3, 1, 6, 4};

		System.out.println(funciones4.minimoArrayInt(arr3));
		System.out.println(funciones4.maxArrayInt(arr2));
		System.out.println(funciones4.mediaArrayInt(arr2));
		System.out.println(funciones4.estaEnArrayInt(arr2, 1));
		System.out.println(funciones4.posicionEnArray(arr2, 0));

		for (int auxiliar : funciones4.volteaArrayInt(arr3)) {
			System.out.print(auxiliar + " ");
		}

	}

	public static int[] generaArrayInt(int n, int minimo, int maximo) {
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * ((maximo + 1) - minimo)) + minimo;
		}

		return arr;
	}

	public static int minimoArrayInt(int arr[]) {

		int minimo = Integer.MAX_VALUE;

		for (int auxiliar : arr) {
			if (auxiliar < minimo) {
				minimo = auxiliar;
			}
		}

		return minimo;
	}

	public static int maxArrayInt(int arr[]) {

		int maximo = Integer.MIN_VALUE;

		for (int auxiliar : arr) {
			if (auxiliar > maximo) {
				maximo = auxiliar;
			}
		}

		return maximo;
	}

	public static int mediaArrayInt(int arr[]) {

		int sumatorio = 0;

		for (int auxiliar : arr) {
			sumatorio += auxiliar;
		}

		return sumatorio / arr.length;
	}

	public static boolean estaEnArrayInt(int arr[], int numero) {

		for (int auxiliar : arr) {
			if (auxiliar == numero) {
				return true;
			}
		}
		return false;

	}

	public static int posicionEnArray(int arr[], int numero) {

		for (int i = 0; i < arr.length; i++) {
			if (numero == arr[i]) {
				return i;
			}
		}
		System.out.println("No existe");
		return -1;

	}

	public static int[] volteaArrayInt(int arr[]) {
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
		}
		return arr2;

	}

}