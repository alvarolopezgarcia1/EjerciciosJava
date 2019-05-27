package ej2;

import java.util.*;
public class pruebaAgenda {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		agenda a=new agenda("agenda1");
		
		System.out.println("Bienvenido a la agenda:");
		int opcion;
		do {
			System.out.println("1. Dar de alta");
			System.out.println("2. Dar de baja");
			System.out.println("3. consultar telefono");
			System.out.println("4. Mostrar agenda");
			System.out.println("5. Salir");
			opcion=Integer.parseInt(s.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("introduzca el nombre que quiere dar de alta: ");
				String nombre=s.nextLine();
				a.alta(nombre);
				break;

			case 2:
				System.out.println("introduzca el nombre que quiere dar de baja: ");
				String nombre1=s.nextLine();
				a.baja(nombre1);
				break;
			
			case 3:
				System.out.println("introuzca el nombre y le dare su contacto");
				String nombre2=s.nextLine();
				a.consultar(nombre2);
				break;
				
			case 4:
				System.out.println(a);
				break;
				
			}
		} while (opcion!=5);
	}

}
