package examen_clubes;

//main




public class FichajesMain {

	public static void main(String[] args) {
		Jugador jugador1 = new Jugador("X5003354A", "Roman", "Delantero");
		Jugador jugador2 = new Jugador("Z1112233B","Luis","Central");
		Jugador jugador3 = new Jugador("Z1112233B" , "Ruben", "Portero");
		Jugador jugador4 = new Jugador("O3322123W", "Alvaro", "Arbitro");
		Jugador jugador5 = new Jugador("I231233I","Ale","Extremo");
		Persona presi = new Persona("X223341W","El capi",72);
		System.out.print(jugador1);
		
		
		Club club1 = new Club("DAW FC");
		Club club2 = new Club("DAM FC");
		
		System.out.println();
		club1.setPresidente(presi);
		System.out.println("Este es el presi");
		System.out.println(club1.getPresidente());
		
		System.out.println("Estos son los jugadores");
		club1.aniadir(jugador1);
		club1.aniadir(jugador2);
		club1.aniadir(jugador3);
		club1.aniadir(jugador4);
		club2.aniadir(jugador5);
		
		System.out.println();
		System.out.println("Muestra todo el club");
		System.out.println(club1);
		
		System.out.println("Miramos si existen los jugadores");
		System.out.println(club1.mirarJugador("X5103354A"));
		System.out.println(club1.mirarJugador("X5003354A"));
		
		System.out.println("Borramos un jugador");
		club1.borrarJugador("Z1112233B");
		
		System.out.println();
		System.out.println("Muestra todo el club1");
		System.out.println(club1);
		System.out.println();
		System.out.println("Muestra todo el club2");
		System.out.println(club2);
		
		System.out.println("Traspasamos a alvaro al club2");
		club1.traspasar(club2, "O3322123W");
		
		System.out.println();
		System.out.println("Muestra todo el club1");
		System.out.println(club1);
		System.out.println();
		System.out.println("Muestra todo el club2");
		System.out.println(club2);
		
		

	}

}