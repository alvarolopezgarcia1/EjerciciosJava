package ejercicio3;

public class TiposDeViviendas {

	public static void main(String[] args) {

		Vivienda piso = new Vivienda();
		
		piso.setMetrosCuadrados(55);
		
		System.out.println(piso);

		Vivienda adosado = new Vivienda(40, 5, true, "sur");
		
		System.out.println(adosado);
		
		

		Vivienda cortijo = new Vivienda();
		
		ViviendaUnifamiliar a2 = new ViviendaUnifamiliar(5);
		
		a2.setMetrosCuadrados(48);
		
		System.out.println(a2);
		
		ViviendaUnifamiliar a3 = new ViviendaUnifamiliar(8, 8, false, "a3", 8);
		System.out.println(a3);
		
	

	}

}
