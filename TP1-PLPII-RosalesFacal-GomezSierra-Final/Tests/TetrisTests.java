import static org.junit.Assert.*;

import org.junit.Test;

import Piezas.PiezaCuadrado;
import Piezas.PiezaPalo;
import Tetris.Tablero;


public class TetrisTests {
     @Test
     public void ComprobarPerderElJuego(){ //crea tablero, cuadrado y dos peiza palo
          Tablero tablero = new Tablero();
          PiezaPalo palo1 = new PiezaPalo();
          PiezaPalo palo2 = new PiezaPalo();
          PiezaCuadrado Cuadrado = new PiezaCuadrado();

          String [] expected = {   "1100000000", //tablero esperado
                                   "1100000000",
                                   "1000000000", 
                                   "1000000000",
                                   "1000000000",
                                   "1000000000",
                                   "1000000000", 
                                   "1000000000",
                                   "1000000000",
                                   "1000000000",
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
// se inserta pieza palo 1
          tablero.insertPiezaEnTablero(palo1, 0);
          tablero.actualizarTableroEnTick();//mueve la pieza hacia abajo
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
//se inserta pieza palo 2
          tablero.insertPiezaEnTablero(palo2, 0);
          tablero.actualizarTableroEnTick();//la pieza baja
          tablero.actualizarTableroEnTick();
//se inserta pieza cuadrado (chocan las piezas)
          tablero.insertPiezaEnTablero(Cuadrado, 0);
//estado final del tablero
          String[] tableroFinal = tablero.getTablero();
          assertArrayEquals(expected, tableroFinal);// la pieza baja
          assertEquals(false, tablero.verificarTablero());
     }
     @Test
     public void comprobarSiGano(){ //se crean piezas
          Tablero tablero = new Tablero();
          PiezaPalo palo1 = new PiezaPalo();
          PiezaPalo palo2 = new PiezaPalo();
          PiezaPalo palo3 = new PiezaPalo();
          PiezaPalo palo4 = new PiezaPalo();
          PiezaPalo palo5 = new PiezaPalo();
          PiezaPalo palo6 = new PiezaPalo();
          PiezaPalo palo7 = new PiezaPalo();
          PiezaPalo palo8 = new PiezaPalo();
          PiezaPalo palo9 = new PiezaPalo();
          PiezaPalo palo10 = new PiezaPalo();
          PiezaPalo palo11 = new PiezaPalo();
          PiezaPalo paloForWinning = new PiezaPalo();

          PiezaCuadrado CuadradoForWinning = new PiezaCuadrado();

          String [] expected = {   "0000000000",//estado esperado
                                   "0000000000",
                                   "0000000000", 
                                   "0000000000",
                                   "0000000000",
                                   "1111111100",
                                   "1111111110", 
                                   "1111111110",
                                   "1111111110",
                                   "1111111110",
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
// se insertan las piezas palos
          tablero.insertPiezaEnTablero(palo1, 0);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo2, 1);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo3, 2);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo4, 3);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo5, 4);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo6, 5);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo7, 6);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo8, 7);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo9, 8);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo10, 0);
          tablero.piezaActual.rotarDerecha();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(palo11, 4);
          tablero.piezaActual.rotarDerecha();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
// se verifica el estado del tablero
          String[] finalBoard = tablero.getTablero();
          assertArrayEquals(expected, finalBoard);

          String [] expected2= {   "0000000000",
                                   "0000000000",
                                   "0000000000", 
                                   "0000000000",
                                   "0000000000",
                                   "0000000000",
                                   "0000000000", 
                                   "0000000000",
                                   "0000000000",
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
                                   "0000000000",          };
//se inserta la pieza para ganar
          tablero.insertPiezaEnTablero(paloForWinning, 9);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.insertPiezaEnTablero(CuadradoForWinning, 8);
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.actualizarTableroEnTick();
          tablero.verificarTablero();
          
          String[] finalTab2 = tablero.getTablero();
          assertArrayEquals(expected2, finalTab2);
          assertTrue(tablero.verificarVictoria());

          

     }
}