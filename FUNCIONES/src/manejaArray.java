public class manejaArray {

	public static void main(String[] args) {
		
		int[] numeros= {4,5,6,9,8,7};
		
		mostrarArray(numeros);
		System.out.println("");
		System.out.println("la suma del array es "+ suma(numeros));
		System.out.println("la media del array es "+ media(numeros));
		
	}
    public static void mostrarArray (int[] array) {
    	
    	for (int i=0; i<array.length; i++) {
    		
    		System.out.print(array[i]+ ", ");
    	}
    }
    
    
    public static int suma(int [] numeros) {
    	
    	int suma=0;
    	for(int i=0; i<numeros.length; i++) {
    	suma+=numeros[i];	
    		
    	}
    	
    	return suma;
    }
    
    public static int media(int [] numeros) {
    	
    	int suma=suma(numeros);
    	
    	return suma/ numeros.length;
    }
    
    
}
