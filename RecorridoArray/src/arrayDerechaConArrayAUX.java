
public class arrayDerechaConArrayAUX {
	

	public static void main(String[] args) {
		
		int[] vector= new int [5];
		int[] vector2= new int [5];
		
		for (int i=0; i<5; i++) {
			
			vector[i]=i+1;
		}
		
		for (int i=0; i<5; i++) {
			
			vector2[(i+1)%5]=vector[i];
		}
		
		//si le ponemos en el bucle de arriba 1, lo mueve una posicion, si ponemos 2, lo haría 2.
		
		for (int i=0; i<5; i++) {
			
			System.out.print(vector2[i]+ " ");
			
		}
		
	}

}
