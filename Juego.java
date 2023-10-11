import java.util.List;
import java.util.Scanner;

public class Juego {
    private String palabraObjetivo;
    private String[][] tablero;
    private boolean juegoTerminado;
    private List<String> palabrasPosibles;

    public Juego(List<String> palabrasPosibles) {
        this.palabrasPosibles = palabrasPosibles;
        this.tablero = new String[6][5];
        this.juegoTerminado = false;
        seleccionarPalabraObjetivo();
        inicializarTablero();
    }

    // Métodos de juego, mostrarTablero, adivinoPalabra, letraEnPalabraObjetivo, etc.
    
    public void jugar() {
        // Lógica del juego
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabrasPosibles = Arrays.asList("manos", "lugar", "playa", "lugar", "arbol");
        JuegoWordle juegoWordle = new JuegoWordle(palabrasPosibles);
        juegoWordle.jugar();
        scanner.close();
    }
}
