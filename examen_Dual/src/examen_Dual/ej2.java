/*OPCIÓN 2: Escriba un programa que memorice, para una palabra clave determinada, una frase que esté 
relacionada con dicha palabra. Para ello, deberá hacer uso de un diccionario, donde la palabra clave hará las
veces de índice. El programa deberá realizar las siguientes tareas:
a)
Mostrar la frase correspondiente a una palabra. Para ello, el programa solicitará al usuario una palabra y si 
dicha palabra está en el diccionario, mostrará la frase correspondiente, y si no está solicitará al usuario
una frase para, a continuación, darla de alta en el diccionario.
Borrar
correspondiente.
Mostrar
b)
una palabra y su correspondiente frase, para lo cual se le solicitará al usuario la palabra
c)
por pantalla todo el diccionario (palabras y frases asociadas).
Se valorará la subdivisión del código en funciones/métodos, de manera que el programa esté subdividido 
modularmente, facilitando su lectura y compresión por parte de otro programador. Las tres funcionalidades que
debe implementar su programa deben estar accesibles a través de un menú*/

package examen_Dual;

import java.util.*;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		HashMap<String, String> diccionario = new HashMap<String, String>();

		// Palabras introducidas previamente para probar el programa

		diccionario.put("Hola", "Hola, cómo estás?");
		diccionario.put("Adios", "Hasta luego Lucas");
		diccionario.put("Gato", "El gato se comió mi comida");
		diccionario.put("Avion", "El avión vuela muy bajo");
		diccionario.put("Ascensor", "Sólo los vagos cogen el ascensor");

		System.out.println("Introduzca una palabra y en caso de estar almacenada, te diré una frase");

		String palabraIntro;

		String frase;

		palabraIntro = s.nextLine();

		if (diccionario.containsKey(palabraIntro)) {
			System.out.println(palabraIntro + ": Su frase es " + diccionario.get(palabraIntro));
		} else {

			System.out.println("Lo siento, no se encuentra. Por favor introduzca una frase para esta palabra");

			frase = s.nextLine();
			diccionario.put(palabraIntro, frase);
		}

		System.out
				.println("Introduzca ahora la palabra que quiere borrar del diccionario, en caso de estar se borrará");

		String palabraIntro1 = s.nextLine();

		diccionario.remove(palabraIntro1);

		System.out.println(diccionario);

	}

}
