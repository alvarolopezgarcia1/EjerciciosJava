
public class calificaciones {

	public static void main(String[] args) {
		
		
		int calificaciones[]= {2,2,1,4,5,5,3,4};
		
		int contador[]=new int[6];
		
		for(int i=0; i<calificaciones.length; i ++) {
			
			contador[calificaciones[i]]+=1;
			
			
		}
		
		for(int j=0; j<contador.length; j++) {
			System.out.println("Calificacion: " +j+": "+contador[j]+ " veces");
		}

	}

}
