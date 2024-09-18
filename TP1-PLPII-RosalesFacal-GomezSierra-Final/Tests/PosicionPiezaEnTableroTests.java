import static org.junit.Assert.*;
import org.junit.Test;

import Piezas.PiezaCuadrado;
import Piezas.PiezaT;
import Tetris.Tablero;


public class PosicionPiezaEnTableroTests {
     
     // Verifica que una pieza no salga del tablero por los lados
     @Test
     public void crearTablero__crearPieza_verificarSalirDelTablero_porLosLados(){
          Tablero colitionBoard = new Tablero();
          PiezaCuadrado cuadrado = new PiezaCuadrado();

          String[] expectedTab2 =  {  "0000000011",
                                        "0000000011",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",          };
          assertArrayEquals(expectedTab2, colitionBoard.insertPiezaEnTablero(cuadrado, 8));
     }

     // Verifica que una pieza llegue al fondo del tablero y no se mueva más
     @Test
     public void createBoard__createPiece_checkLeaveTheBoard_atBottom(){
          Tablero colitionBoard = new Tablero();
          PiezaCuadrado cuadrado = new PiezaCuadrado();

          String[] expectedTab2 =  {  "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0110000000",
                                        "0110000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",          };

          colitionBoard.insertPiezaEnTablero(cuadrado, 1);
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo varias veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo varias veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo varias veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo varias veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  
          String[] finalBoard1 = colitionBoard.actualizarTableroEnTick(cuadrado, true);
          assertArrayEquals(expectedTab2, finalBoard1);
     }

      // Similar al test anterior, pero verifica la posición final de la pieza cuadrado en el fondo
     @Test
     public void createBoard__createPiece_checkLeaveTheBoard_atBottom2(){
          Tablero colitionBoard = new Tablero();
          PiezaCuadrado cuadrado = new PiezaCuadrado();

          String[] expectedTab2 =  {  "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0110000000",
                                        "0110000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",         };

          colitionBoard.insertPiezaEnTablero(cuadrado, 1);
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);  // Mueve la pieza hacia abajo muchas veces
          colitionBoard.actualizarTableroEnTick(cuadrado, true);
          String[] finalTab1 = colitionBoard.actualizarTableroEnTick(cuadrado, true);
          assertArrayEquals(expectedTab2, finalTab1);
     }

     // Verifica la colisión de una pieza T en el tablero
     @Test
     public void testColition(){
          Tablero colitionBoard = new Tablero();
          PiezaT te = new PiezaT();

          String[] boardForTesting = {  "0000000000",
                                        "0000000000",
                                        "0010100000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",          };

          colitionBoard.setTablero(boardForTesting);

          String[] boardExpected = {    "0011100000",
                                        "0001000000",
                                        "0010100000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000" ,         };

          assertArrayEquals(boardExpected, colitionBoard.insertPiezaEnTablero(te, 2));

          String[] boardExpected2 = {   "0000000000",
                                        "0011100000",
                                        "0011100000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",
                                        "0000000000",          };
          
          assertArrayEquals(boardExpected2, colitionBoard.actualizarTableroEnTick(te, true));

          assertArrayEquals(boardExpected2, colitionBoard.actualizarTableroEnTick(te, true)); // Verifica estabilidad
     }
}