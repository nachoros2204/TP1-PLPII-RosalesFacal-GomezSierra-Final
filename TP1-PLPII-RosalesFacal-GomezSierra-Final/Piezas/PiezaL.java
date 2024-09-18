package Piezas;

public class PiezaL extends PiezaBase{
     boolean esDerecha;

     String [] derecha = {"1000100011000000", "0010111000000000", "1100010001000000", "0000111010000000"};
     String [] izquierda = {"0100010011000000", "0100011100000000", "0011001000100000", "0000011100010000"};

     public PiezaL(boolean esDerechaRespuesta){
          this.esDerecha = esDerechaRespuesta;
     }
     
     @Override
     public String mostrarPieza(){
          if (esDerecha){
               return(derecha[posicionActual]);
          } else {
               return(izquierda[posicionActual]);
          }
     }

     @Override
     public String mostrarPiezaEnPosicion(int position){
          if (esDerecha){
               return(derecha[position]);
          } else {
               return(izquierda[position]);
          }
     }
}
