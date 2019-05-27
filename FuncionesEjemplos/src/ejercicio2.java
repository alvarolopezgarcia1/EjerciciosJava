import misFunciones.funciones;

public class ejercicio2 {

	public static void main(String[] args) {
		

		for (int i = 0; i <=1000; i++) {
			
			//System.out.println(i);
			
			if(funciones.esPrimo(i)) {
				
				System.out.println(i);
			}
			

		}
	}
}