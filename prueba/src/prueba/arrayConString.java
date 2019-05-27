package prueba;

public class arrayConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String[] paises = new String[8]; De esta manera se puede declarar un array de strings y relllenarlo.

		paises[0] = "España";
		paises[1] = "Francia";
		paises[2] = "Inglaterra";
		paises[3] = "Italia";
		paises[4] = "Mexico";
		paises[5] = "Ecuador";
		paises[6] = "Noruega";
		paises[7] = "Alemania";*/
		
		String [] paises= {"España", "Francia", "Italia", "Noruega", "Marruecos", "Inglaterra", "Francia", "Holanda"}; //De esta forma se 
		//puede declarar un array de manera más corta y rapida
	

		/*for (int i = 0; i < paises.length; i++) {

			System.out.println("País " + (i + 1) + " " + paises[i]);  Con este bucle recorremos el array

		}*/
		
		
		//Con este bucle foreach hacemos lo mismo de manera más optima
		for(String elemento:paises) {
			
			
			
			System.out.println("Pais: " + elemento);
			
			
		}

	}
}