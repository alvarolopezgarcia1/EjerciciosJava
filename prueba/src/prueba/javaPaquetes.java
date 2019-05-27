package prueba;

public class javaPaquetes {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			int valor = (int) (Math.random() * 10) + 10; //10 al 19
			System.out.print(valor+" ");
		}
		System.out.println();
		for (int i = 0; i < 30; i++) {
			int valor = (int) (Math.random() * 10); //0 al 9
			System.out.print(valor+" ");
		}
		System.out.println();
		System.out.println("------------------");
		//String to charArray
		String palabra = "palabra";
		char[] array = palabra.toCharArray();
		
		//Char to int
		char valor = '2';
		int a= Character.getNumericValue(valor);
		System.out.println(a);
		
		//String to int
		String numero = "2";
		a = Integer.parseInt(numero);
		System.out.println(a);
		
		//int to String
		int numeral = 2;
		String test = Integer.toString(numeral);
		test = String.valueOf(numeral);
		
		//chartAt
		int numeral2 = 470213;
		String composicion = "";
		String numero2 = Integer.toString(numeral2);
		char posicion = numero2.charAt(0);

		//ASCI
		
			//imprimir la letra correspidiente --> (char)codigoAscii --> codigoAscii = 77 'codigoAscii es un int'
			//imprimir el codigo ascii correspondiete --> (int)letra  ---> letra = 'a' 'letra es un char'

	}
	
	
}