
public class arrayPrueba {

	public static void main(String[] args) {

		int[] n = new int[10];
		int[] copia = new int[10];

		

		for (int i =0; i<n.length; i++) {

			n[i]=i;
			copia[i]=n[i];
			System.out.print(copia[i]+ ", ");

		}
		

	}

}
