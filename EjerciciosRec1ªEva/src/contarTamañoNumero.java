
public class contarTamañoNumero {

	public static void main(String[] args) {

		int numero = 560766666;
		int contador = 1;
		
		

		for (int i = 0; i <numero; i++) {

			numero = numero / 10;
			if (numero > 0) {
				contador++;
			}

		}

		System.out.println(contador);
		
		
	}

}
