
public class fucionesArray {

	public static void main(String[] args) {

		int[] array1 = { 5, 7 };
		int[] array2 = { 7, 5 };
		int[] array3 = { 5, 5 };
		System.out.println("Inicio 5, final 7");
		mostrarArray(array1);
		
		System.out.println("Inicio 7, final 5");
		mostrarArray(array2);

		System.out.println("Inicio 5, final 5");
	    mostrarArray(array3);
		
	}

	public static int [] serie(int inicioNumero, int finalNumero) {
    
    	int tamanio= Math.abs(inicioNumero - finalNumero)+1;
    	int [] serie= new int[tamanio];
    	if (inicioNumero<finalNumero) {
    		
    		for(int i=0, j=inicioNumero; i<serie.length; i++, j++) {
    			
    			serie[i]=j;
    		}
    		
    	} else {
    		
    		for (int i=0, j=inicioNumero; i<serie.length; i++, j--) {
    			
    			serie[i]=j;
    		}
    	}
    	
    	return serie;
    	
    }

public static void mostrarArray (int[] array) {
    	
    	for (int i=0; i<array.length; i++) {
    		
    		System.out.println(array[i]);
    	}
	
	
}
}