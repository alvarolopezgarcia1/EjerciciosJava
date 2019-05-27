package prueba;

import java.util.*;

public class cuadrado {
	 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        int lineas = 5;
        
		// Cuadrado
 
		System.out.println("Cuadrado");
		System.out.println("--------\n");
 
		for(int i=0;i<lineas;i++)
		{
			for(int j=0;j<lineas;j++)
			{
				System.out.print("*");
			}
		
			System.out.print("\n");
		}
		
		System.out.println("\n\nRombo");
		System.out.println("------\n");
 
		for(int i=1;i<=(lineas/2)+1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=(lineas/2);i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n\nAbeto");
		System.out.println("------\n");
 
		int contador = 1;
		for(int i=1;i<=lineas;i++)
		{
			contador++;
			for(int j=1;j<=contador;j++)
			{
				for(int k=0;k<j;k++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		System.out.println("**");
		System.out.println("**");
        
    }
}