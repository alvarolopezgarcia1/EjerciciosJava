/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a 
derecha que ocupa ese dígito en el número introducido*/
import java.util.*;

public class ej26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		System.out.println("Introduce un numero");
		
		int numIntroducido=s.nextInt();
		
		System.out.println("Introduce un digito");
		
		int digIntroducido=s.nextInt();

	}

}
