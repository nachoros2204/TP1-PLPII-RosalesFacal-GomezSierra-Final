package Piezas;

import Interfaz.IRotar;

public class PiezaBase implements IRotar{
     protected int posicionActual; // Orientacion actual de la pieza
     protected String [] figura; // Representacion de la pieza en diferentes orientaciones
     protected int [] posEnTablero = {0, 0, posicionActual}; // Posicion en el tablero y orientación

     // Establece la posicion (x,y) en el tablero
     public void setActualPos(int x, int y) {
          posEnTablero[0] = x;
          posEnTablero[1] = y;
     }
     
     //Rota la pieza hacia la derecha
     public String rotarDerecha() {
          posicionActual++;
          if (posicionActual == 4) {
               posicionActual = 0;
          }
          return mostrarPieza();
     }

     //Rota la pieza hacia la izquierda
     public String rotarIzquierda() {
          posicionActual--;
          if (posicionActual == -1) {
               posicionActual = 3;
          }
          return mostrarPieza();
     }

     //Establece la posicion y orientacion actual en el tablero
     public void setPosicionActual(int x, int y) {
          posEnTablero[0] = x;
          posEnTablero[1] = y;
          posEnTablero[2] = posicionActual;
     }

     public int[] getPosEnTablero() {
          return posEnTablero;
     }

     //Muestra la pieza en la orientacion actual
     public String mostrarPiezaEnPosicion(int posicion) {
          return figura[posicionActual];
     }

     // Establece la orientacion de la pieza
     public void setPosicion(int posicion){
          posicionActual = posicion;
     }

     // Muestra la pieza
     public String mostrarPieza(){
        return (figura[posicionActual]);    
     }
}