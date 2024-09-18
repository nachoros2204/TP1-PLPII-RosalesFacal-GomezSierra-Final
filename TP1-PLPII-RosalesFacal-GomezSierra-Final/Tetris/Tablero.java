package Tetris;

import java.util.Random;

import Piezas.PiezaBase;
import Piezas.PiezaCuadrado;
import Piezas.PiezaL;
import Piezas.PiezaPalo;
import Piezas.PiezaPerro;
import Piezas.PiezaT;


public class Tablero{
     public String [] tablero = {    "0000000000",
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
                                   "0000000000",
                                   "0000000000"};

     public PiezaBase darPiezaAleatoria(){ //Nro entre 1 y 7 para pieza aleatoria
          Random rand = new Random();
          int numeroRandom = rand.nextInt(7) + 1;
          
          switch(numeroRandom) {
               case 1:
                    PiezaPerro perroDerecha = new PiezaPerro(true);
                    return perroDerecha;
               case 2:
                    PiezaPerro perroIzquierda = new PiezaPerro();
                    return perroIzquierda;
               case 3:
                    PiezaCuadrado cuadrado = new PiezaCuadrado();
                    return cuadrado;
               case 4:
                    PiezaPalo palo = new PiezaPalo();
                    return palo;
               case 5:
                    PiezaT t = new PiezaT();
                    return t;
               case 6:
                    PiezaL lDerecha = new PiezaL(true);
                    return lDerecha;
               case 7:
                    PiezaL lIzquierda = new PiezaL(false);
                    return lIzquierda;
               default:
                    return new PiezaCuadrado(); 
     }
          }

    public PiezaBase piezaActual;
    private int puntaje;
     

     public int getPuntaje() { //Devuelve el puntaje actual
          return puntaje;
     }

     public void setPuntaje(){//Incrementa 1 si se llena la linea
          this.puntaje = puntaje + 1;
     }

     public void setpiezaActual() { //Asigna una nueva pieza para crear
          this.piezaActual = darPiezaAleatoria();
     }
     
     public boolean juego = true; //El juego esta activo
     
     public void setTablero(String[] tableroNuevo){ //Configura el tablero
          tablero = tableroNuevo;
     }

     public String [] getTablero(){//Devuelve el estado del tablero
          return tablero;
     }
     
     public boolean verificarVictoria(){// Comprueba si se llego al maximo puntaje (5)
          if(puntaje == 5){
               return true;
          }else {
               return false;
          }
     }

     public boolean verificarTablero(){
          if(!juego){
               return false;
          }
          for (int i = 0; i < tablero.length; i++) { //Bucle para eliminar filas llenas
               if (tablero[i].equals("1111111111")) {
                    setPuntaje();
                    for (int j = i; j > 0; j--) {
                         tablero[j] = tablero[j - 1];
                    }
                    tablero[0] = "0000000000";
               }
          }
          if (tablero[0].contains("1")) {//El juego termina 
               return false;
          }
          return true;
     }

     public String eliminarPiezaActualBajando(int lineaAActualizar, PiezaBase piezaAInsertar, int posicionAInsertar, int lineaEnPiezaAActualizar){
          int[] posicionActual = piezaAInsertar.getPosEnTablero();
          StringBuilder lineaDelTablero = new StringBuilder(tablero[lineaAActualizar]); //Extrae la linea para actualizarla
          String lineaDeLaPiezaAInsertar = piezaAInsertar.mostrarPiezaEnPosicion(posicionActual[2]).substring((lineaEnPiezaAActualizar*4)-4, (lineaEnPiezaAActualizar*4));//Extrae una parte de la pieza para insertar en la posicion actual
     
          StringBuilder lineaActualizada = new StringBuilder(lineaDelTablero); 
          for (int i = posicionAInsertar; i < posicionAInsertar + 4; i++) { //Bucle que recorre donde se va a insertar la pieza
               int PosicionXDePieza = i-posicionAInsertar;
               char caracterDePieza = lineaDeLaPiezaAInsertar.charAt(PosicionXDePieza);

               if (caracterDePieza == '1') {
                    lineaActualizada.setCharAt(i, '0');
               }
          }
          return lineaActualizada.toString();
     }

     // Compara los caracteres de una línea del tablero con la pieza a insertar
    public String compararCaracteres(StringBuilder lineaDelTablero, String lineaDeLaPiezaAInsertar, PiezaBase piezaAInsertar, int posicionAInsertar, int lineaEnPiezaAActualizar, int lineaAActualizar){//Compara los caracteres de la linea del tablero con la pieza a insertar
     StringBuilder nuevaCadenaParaLinea = new StringBuilder(); 

     // Recorre los caracteres de la línea de la pieza que se va a insertar
     for (int i = posicionAInsertar; i < posicionAInsertar + 4; i++ ){
          int posicionXDePieza  = i-posicionAInsertar;
          char caracterDePieza = lineaDeLaPiezaAInsertar.charAt(posicionXDePieza);
          if (i >= lineaDelTablero.length() && caracterDePieza  == "0".charAt(0)) {
               break;     // Termina si la pieza solo tiene ceros y el índice está fuera del tablero
          }
          char caracterDelTablero  = lineaDelTablero.charAt(i);   // Verifica si la línea en el tablero debe ser actualizada
          if (lineaAActualizar == 0 && lineaEnPiezaAActualizar != 1){
               juego = false;  // Marca que la actualización falló
               break; 
          }
          if (caracterDePieza == "1".charAt(0) && caracterDelTablero  == "1".charAt(0)){       // Compara los caracteres y construye la nueva línea
               return "false";
          } else if (caracterDelTablero != caracterDePieza){
               nuevaCadenaParaLinea.append("1");
          } else {
               nuevaCadenaParaLinea.append("0");
          }
     }

     return nuevaCadenaParaLinea.toString(); // Devuelve la nueva línea
}

// Actualiza una línea del tablero con la pieza a insertar
     public String actualizarLinea(int lineaAActualizar, PiezaBase piezaAInsertar, int posicionAInsertar, int lineaEnPiezaAActualizar){
          StringBuilder lineaDelTablero = new StringBuilder(tablero[lineaAActualizar]); // contiene la linea a actializar
          System.out.println(lineaDelTablero);
          String lineaDeLaPiezaAInsertar = piezaAInsertar.mostrarPieza().substring((lineaEnPiezaAActualizar*4)-4, (lineaEnPiezaAActualizar*4));//extraigo la linea de la pieza
          String caracteresAInsertar = compararCaracteres(lineaDelTablero, lineaDeLaPiezaAInsertar, piezaAInsertar, posicionAInsertar, lineaEnPiezaAActualizar, lineaAActualizar);
//se compara  la linea del tablero con la pieza a insertar
          if (caracteresAInsertar.equals("false")){ // 
               return "false";//no se puede
          }

          lineaDelTablero.replace(posicionAInsertar, posicionAInsertar + caracteresAInsertar.length(), caracteresAInsertar); //agrego la linea de la pieza en la posición deseada
          String lineaActualizada = lineaDelTablero.toString();

          return lineaActualizada; // devuelvo la linea actualizada
     }

// Actualiza el tablero en cada tick del juego
     public String[] actualizarTableroEnTick(){
          return actualizarTableroEnTick(piezaActual, false);
     }
// Actualiza el tablero en cada tick del juego, considerando si es una prueba
     public String[] actualizarTableroEnTick(PiezaBase piezaAActualizar, boolean isTesting){
          String [] nuevoTablero = getTablero().clone();
          
          int[] posicionActual = piezaAActualizar.getPosEnTablero();//elimina la pieza de la posicion en el tablero
          int lineaAEliminar;
// Elimina la pieza de su posición actual en el tablero
          for (int i = 3; i > -1; i--) {
               
                    if(posicionActual[1] + i > 9){
                         lineaAEliminar = 9;
                    } else {
                         lineaAEliminar = posicionActual[1] + i;
                    }
               tablero[lineaAEliminar] = eliminarPiezaActualBajando(lineaAEliminar, piezaAActualizar , posicionActual[0], i+1);
          }
// Actualiza el tablero con la nueva posición de la pieza
          for (int i = 3; i > -1; i--) {//actualiza el tablero con la nueva posicon
               int lineaDelTablero;
                    if(posicionActual[1] + i + 1 > 9){
                         lineaDelTablero = 9;
                    } else {
                         lineaDelTablero = posicionActual[1] + i + 1;
                    }
               String lineaAActualizar = actualizarLinea (lineaDelTablero, piezaAActualizar, posicionActual[0], i+1);
               System.out.println(lineaAActualizar);
               if(lineaAActualizar.equals("false")){ // si hay un error, se vuelve al tablero anterior
                    tablero = nuevoTablero.clone();
                    if(!isTesting){
                         insertPiezaEnTablero(piezaActual, posicionActual[1]);
                    }
                    return tablero;
               } else {// sino se actualiza con la pieza modificada
                    tablero[lineaDelTablero] = lineaAActualizar;
               }
          }
     
          piezaAActualizar.setActualPos(posicionActual[0], posicionActual[1]+1);
          
          return tablero;
     }
     
     
     
// Inserta una pieza en el tablero en una posición aleatoria
     public String[] insertPiezaEnTablero(PiezaBase pieza, int posicion) {
          verificarTablero(); // Verifica si el tablero no contiene una linea lleno
          piezaActual = pieza;
      
          for (int i = 3; i > -1; i--) {
              tablero[i] = actualizarLinea(i, pieza, posicion, i + 1); // Actualiza el tablero con la pieza
          }
      
          pieza.setActualPos(posicion, 0); // Establece la nueva posición de la pieza
      
          return tablero;// Devuelve el tablero actualizado
      }
// Inserta una nueva pieza en una posición aleatoria
      public String[] insert() {
          setpiezaActual();
          Random rand = new Random();
          int randomNum = rand.nextInt(10); // Genera una posición aleatoria
      
          return insertPiezaEnTablero(piezaActual, randomNum); // Inserta la pieza en el tablero

}
}