import static org.junit.Assert.*;
import org.junit.Test;
//req 5
import Tetris.Tablero;

public class LineaLlenaTests {

    @Test
    public void testLineaCompleta() {
        // Crear un nuevo tablero
        Tablero tablero = new Tablero();
        // Establecer el estado del tablero con una fila completa al final
        String[] tableroNuevo = {   "0000000000",
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0011000000",
                                    "1111111111",   // Línea completa
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000"};

        // Establecer el tablero con el arreglo tableroNuevo
        tablero.setTablero(tableroNuevo);

        // Comprobar el tablero (esto eliminará la línea completa)
        tablero.verificarTablero();
        
        // Se espera que el tablero haya eliminado la línea completa
        String[] tableroEsperado = {    "0000000000",
                                        "0000000000",
                                        "0000000000", 
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000", 
                                        "0000000000",
                                        "0000000000",
                                        "0011000000",   // La fila completa ha sido eliminada
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000"};

        // Verificar que el tablero actual es igual al tablero esperado
        assertArrayEquals(tableroEsperado, tablero.getTablero());
    }

    @Test
    public void verificarSiGana() {
        Tablero tablero = new Tablero();
        // Crear un tablero con una fila completa
        String[] tableroNuevo = {   "0000000000",
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "1111111111",  // Línea completa
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000"};

        // Clonar el tablero para hacer varias comprobaciones
        String[] tableroNuevo2 = tableroNuevo.clone();   
        String[] tableroNuevo3 = tableroNuevo.clone(); 
        String[] tableroNuevo4 = tableroNuevo.clone(); 
        String[] tableroNuevo5 = tableroNuevo.clone();    

        // Establecer el tablero y verificar (esto elimina las filas completas y aumenta el puntaje)
        tablero.setTablero(tableroNuevo);
        tablero.verificarTablero();
        tablero.setTablero(tableroNuevo2);
        tablero.verificarTablero();
        tablero.setTablero(tableroNuevo3);
        tablero.verificarTablero();
        tablero.setTablero(tableroNuevo4);
        tablero.verificarTablero();
        tablero.setTablero(tableroNuevo5);
        tablero.verificarTablero();

        // Verificar que el puntaje es 5 (una línea eliminada cinco veces)
        assertEquals(5, tablero.getPuntaje());
    }
}
