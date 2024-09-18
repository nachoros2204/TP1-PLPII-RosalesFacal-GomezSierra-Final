import static org.junit.Assert.*;
//req 3
import org.junit.Test;

import Piezas.PiezaCuadrado;
import Piezas.PiezaPalo;
import Piezas.PiezaPerro;
import Tetris.Tablero;


public class InsertarPiezaTests 
{
    @Test
    public void insertarCuadradoEnTableroVerificarSiSeActualiza(){
     Tablero t1 = new Tablero();
     PiezaCuadrado cuadrado = new PiezaCuadrado();
     String [] expected = { "0011000000", //forma de tablero esperada
                            "0011000000",
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
                            "0000000000",            };

     String [] tableroConInsertado = t1.insertPiezaEnTablero(cuadrado, 2);
     assertArrayEquals(expected, tableroConInsertado); //se verifica con el estado esperado

     String [] expected2 = { "0000000000",
                             "0011000000",//bajo una posicion
                             "0011000000", 
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
                             "0000000000",           };

     assertArrayEquals(expected2, t1.actualizarTableroEnTick(cuadrado, true)); //se actualiza

     String [] expected3 = { "0000000000",
                             "0000000000",
                             "0011000000", //baja otra posicion
                             "0011000000",
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
                             "0000000000" ,           };

     assertArrayEquals(expected3, t1.actualizarTableroEnTick(cuadrado, true)); //se actualiza
    }

    @Test
    public void insertarPerroDerechoEnTablero(){
          Tablero t1 = new Tablero();
          PiezaPerro perroDerecho = new PiezaPerro(true);
          String [] expected = {   "0001100000",//forma pieza perro en posicion
                                   "0011000000",
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
                                   "0000000000" ,           };

          String [] tableroConInsertado = t1.insertPiezaEnTablero(perroDerecho, 2);

          assertArrayEquals(expected, tableroConInsertado); //se verifica con el estado esperado
    }

    @Test
    public void insertarPerroIzquierdoEnTablero(){
          Tablero t1 = new Tablero();
          PiezaPerro perroIzquierdo = new PiezaPerro(false);
          String [] expected = {   "0011000000",//forma de tablero esperada
                                   "0001100000",
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
                                   "0000000000" ,           };

          String [] tableroConInsertado = t1.insertPiezaEnTablero(perroIzquierdo, 2);


          assertArrayEquals(expected, tableroConInsertado);//se verifica con el estado esperado
          
            String [] newExpected = {   "0000000000",
                                        "0011000000",//la pieza baja una posicion
                                        "0001100000", 
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
                                        "0000000000",           };

      System.out.println("Estado del tablero después de insertar la pieza:");
      for (String linea : t1.getTablero()) {
      System.out.println(linea);
                                        }

          assertArrayEquals(newExpected, t1.actualizarTableroEnTick(perroIzquierdo, true));

          String [] newExpected1 = {    "0000000000",
                                        "0000000000",
                                        "0011000000", //la pieza baja una posicion
                                        "0001100000",
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
                                        "0000000000",           };

          assertArrayEquals(newExpected1, t1.actualizarTableroEnTick(perroIzquierdo, true));

          String [] newExpected2 = {    "0000000000",
                                        "0000000000",
                                        "0000000000", 
                                        "0011000000",//la pieza baja una posicion
                                        "0001100000",
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
                                        "0000000000" ,           };

          assertArrayEquals(newExpected2, t1.actualizarTableroEnTick(perroIzquierdo, true));
    }

    @Test
    public void insertarPaloEnTablero(){
      Tablero t2 = new Tablero();
      PiezaPalo palito = new PiezaPalo();

      String[] expectedTab = {      "0000010000",//forma de tablero esperada
                                    "0000010000",
                                    "0000010000", 
                                    "0000010000",
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
                                    "0000000000",           };

      assertArrayEquals(expectedTab, t2.insertPiezaEnTablero(palito, 5));
 
      String[] expectedTab2 = {     "0000000000",
                                    "0000010000",//la pieza baja una posicion
                                    "0000010000", 
                                    "0000010000",
                                    "0000010000",
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
                                    "0000000000" ,           };
      
      assertArrayEquals(expectedTab2, t2.actualizarTableroEnTick());    
      
      String[] expectedTab3 = {     "0000000000",
                                    "0000000000",
                                    "0000010000", //la pieza baja una posicion
                                    "0000010000",
                                    "0000010000",
                                    "0000010000",
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
                                    "0000000000",                 };

      assertArrayEquals(expectedTab3, t2.actualizarTableroEnTick());
      
      palito.rotarDerecha();
      String[] expectedTab4 = {     "0000000000",//forma de tablero esperada
                                    "0000000000",
                                    "0000000000", 
                                    "0000011110",
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
                                    "0000000000",           };

       assertArrayEquals(expectedTab4, t2.actualizarTableroEnTick(palito, true));


      String[] expectedTab5 = {     "0000000000",
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0000011110",//la pieza baja una posicion
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
                                    "0000000000",           };
      assertArrayEquals(expectedTab5, t2.actualizarTableroEnTick(palito, true));
      
      String[] expectedTab6 = {     "0000000000",
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0000000000",
                                    "0000010000",
                                    "0000010000", 
                                    "0000010000",
                                    "0000010000",
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
                                    "0000000000",           };

      palito.rotarDerecha();
      assertArrayEquals(expectedTab6, t2.actualizarTableroEnTick(palito, true));
            
      String[] expectedTab7 = {     "0000000000",//forma de tablero esperada
                                    "0000000000",
                                    "0000000000", 
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000010000", 
                                    "0000010000",
                                    "0000010000",
                                    "0000010000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",
                                    "0000000000",           };
                                    
      assertArrayEquals(expectedTab7, t2.actualizarTableroEnTick(palito, true));
      assertArrayEquals(expectedTab7, t2.actualizarTableroEnTick(palito, true)); 
      }
}