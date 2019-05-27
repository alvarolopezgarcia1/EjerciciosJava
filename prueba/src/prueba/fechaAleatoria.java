package prueba;

import java.util.Scanner;

public class fechaAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Este programa genera una actividad aleatoria por cada dia de la semana");
		System.out.println("  ");
		
		System.out.println("Opciones:1-Correr, 2-Pesas, 3-Baloncesto, 4-Pesas, 5-Tenis, 6-Padel y 7 Descanso ");
	  
		System.out.println("  ");
		System.out.println("|Lunes    |Martes   |Miercoles|Jueves   |Viernes  |Sabado   |Domingo  |");

		int tarea[] = new int[7];

		for (int i = 0; i < 7; i++) {

			tarea[i] = (int) (Math.random() * 7+1);
			System.out.print("|   " + tarea[i] + "     ");
		}

	}
}