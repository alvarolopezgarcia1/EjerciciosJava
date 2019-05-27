package prueba;

import java.util.*;

/**
 * Plantilla para el juego de los Barquitos (buscaminas)
 * 
 * @author Tu nombre
 * @version Enero 2017
 */
public class Barquitos {

    // Algunas constantes de juego   
    public static final int MAX_FILAS = 6; // El numero de filas del tablero
    public static final int MAX_COLUMNAS = MAX_FILAS; // el numero de columnas del tablero
    public static final int MAX_BARQUITOS = 5; //El número de barquitos que colocaremos
    public static final int MAX_JUGADAS = 20;  
    
    // Codigos para el significado de cada casilla
    public static final int CASILLA_VACIA = 100;
    public static final int CASILLA_BARCO = 101;
    public static final int CASILLA_VACIA_JUGADA = 200;
    public static final int CASILLA_BARCO_JUGADA = 201;
     
    // Variables de instancia
    int[][] tablero; //bidimensional
    int numHundidos; 
    int numJugadas;
    
    /**
     * Coloca los barcos al azar en el tablero. Supone que el tablero existe
     * y está inicializado
     */
    public void colocarBarquitos() {
        // POR HACER: Tu código aquí
    }

    /**
     * Incializa el juego. 
     * Crea el tablero de juego con algunas casillas con barco y el resto vacías
     */
    public void inicializar() {
        // POR HACER: Tu código aquí
    }
    
    /**
     * Imprime el tablero de juego por el terminal, como se describe en el 
     * enunciado
     */
    public void imprimirTablero() {
        // POR HACER: Tu código aquí
    }
    
    /**
     * Comprueba que una jugada sea correcta
     * Una jugada correcta tiene dos carácteres. El primero es la fila, que se
     * representa con una letra de la A en adelante, y el segundo la columna,
     * que se representa por un número. Ej: <code>A3</code>, <code>f5</code>,
     * <code>c2</code><br>
     * La palabra "fin" también se condidera una jugada correcta, dado que es la
     * indicación para terminal el juego.
     * @param jugada Una cadena representando la jugada a comprobar
     * @return true si la jugada es correcta y false en caso contrario
     */
    public boolean esJugadaCorrecta(String jugada) {
        // POR HACER: Tu código aquí
        return false; // cambia esto
    }
    
    /**
     * Pide una jugada por teclado, y se asegura de que es correcta.<br>
     * Si la jugada introducida no es correcta, se vuelve a pedir con un
     * mensaje cortés hasta que se introduzca una jugada correcta.
     */
    public String pedirJugada() {
        Scanner in = new Scanner(System.in);
        // POR HACER: Tu código aquí
        return "";// cambia esto
    }
    
    public int obtenerNumeroBarcosAdyacentes(int fila, int columna)  {
        // POR HACER: Tu código aquí
        return 0; // cambia esto
    }
    
    public void run() {
        // POR HACER: Tu código aquí
    }
    
    public static void main(String[]args) {
        // POR HACER: Tu código aquí
    }
}