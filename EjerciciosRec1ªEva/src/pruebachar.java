public class pruebachar {
	public static void main(String[] args) {
		String cadena = "Automovil";
		char letra1 = cadena.charAt(0);
		char letra2 = cadena.charAt(2);
		char letra3 = cadena.charAt(5);
		
		int ascii = (int) (cadena.charAt(0));
		System.out.println("ascii: " + ascii);
		
		//Prueba de como hacer casting a un char para tener su codigo ascii
		System.out.println((int)letra1);
		System.out.println(letra2);
		System.out.println(letra3);
		
		//de string a entero
		
		String cadena2="123";//esto es una cadena
		int entero;//esto es un entero
		 
		//ahora para pasar la cadena a entero
		 
		entero=Integer.parseInt(cadena2);
		 
		//lo muestras
		System.out.println(entero);
		
		
	}
}