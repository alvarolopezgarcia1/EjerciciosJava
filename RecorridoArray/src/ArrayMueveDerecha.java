
public class ArrayMueveDerecha {

	public static void main(String[] args) {

    int [] vector= new int[5];
    
    for (int i=0; i<5; i++) {
    	
    	vector[i]=i+1;
    }
    
    int aux = vector[5-1];
    
    for (int i=5-2; i>0; i--) {
    	
    	vector[i+1] = vector [i];
    }
    vector [0] = aux;
    
    //otra forma de hacerlo
    
    aux = vector[5-1];
    
    for (int i=5-1; i>1; i--) {
    	
    	vector[i] = vector [i-1];
    }
    vector [0] = aux;
    
    for (int i=0; i<5; i++) {
    	System.out.print(vector[i]+ " ");
    }
    
	}

}
