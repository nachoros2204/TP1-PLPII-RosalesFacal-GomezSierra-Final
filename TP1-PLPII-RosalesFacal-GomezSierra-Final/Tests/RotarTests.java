//tests req 2
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Piezas.PiezaPerro;
import Piezas.PiezaT;
import Piezas.PiezaL;
import Piezas.PiezaCuadrado;
import Piezas.PiezaPalo;

public class RotarTests {
     @Test//rotacion a la detecha de perro derecho
     public void comprobarRotacionPerroDerechoDerecha(){
          PiezaPerro perro = new PiezaPerro(true);//crea la pieza
          assertEquals("0110110000000000", perro.mostrarPieza());//verifica forma inicial
          assertEquals("1000110001000000", perro.rotarDerecha());//rotacion 1
          assertEquals("0110110000000000", perro.rotarDerecha());//rotacion 2
          assertEquals("1000110001000000", perro.rotarDerecha());//rotacion 3
          assertEquals("0110110000000000", perro.rotarDerecha());//rotacion 4
     }

     @Test//rotacion a la izquierda perro derecho
     public void comprobarRotacionPerroIzquierdoDerecha(){
          PiezaPerro perro = new PiezaPerro(false);//crea la pieza
          assertEquals("1100011000000000", perro.mostrarPieza());//verifica forma
          assertEquals("0100110010000000", perro.rotarDerecha());//rotacion 1
          assertEquals("1100011000000000", perro.rotarDerecha());//rotacion 2
          assertEquals("0100110010000000", perro.rotarDerecha());//rotacion 3
          assertEquals("1100011000000000", perro.rotarDerecha());//rotacion 4
     }

     @Test
     public void comprobarRotacionPerroDerechoIzquierda(){
          PiezaPerro perro = new PiezaPerro(true);//crea la pieza
          assertEquals("0110110000000000", perro.mostrarPieza());//verifica forma
          assertEquals("1000110001000000", perro.rotarIzquierda());//rotacion 1
          assertEquals("0110110000000000", perro.rotarIzquierda());
          assertEquals("1000110001000000", perro.rotarIzquierda());
          assertEquals("0110110000000000", perro.rotarIzquierda());
     }

     @Test
     public void comprobarRotacionPerroIzquierdoIzquierda(){
          PiezaPerro perro = new PiezaPerro(false);//crea la pieza
          assertEquals("1100011000000000", perro.mostrarPieza());//verifica forma
          assertEquals("0100110010000000", perro.rotarIzquierda());//rotacion 1
          assertEquals("1100011000000000", perro.rotarIzquierda());//rotacion 2
          assertEquals("0100110010000000", perro.rotarIzquierda());//rotacion 3
          assertEquals("1100011000000000", perro.rotarIzquierda());//rotacion 4
     }

     @Test
     public void comprobarRotacionTDerecha(){
          PiezaT t = new PiezaT();//crea la pieza
          assertEquals("1110010000000000", t.mostrarPieza());//verifica forma
          assertEquals("0100011001000000", t.rotarDerecha());//rotacion 1
          assertEquals("0100111000000000", t.rotarDerecha());//rotacion 2
          assertEquals("0100110001000000", t.rotarDerecha());//rotacion 3
          assertEquals("1110010000000000", t.rotarDerecha());//rotacion 4
     }

     @Test
     public void comprobarRotacionTIzquierda(){
          PiezaT t = new PiezaT();//crea la pieza
          assertEquals("1110010000000000", t.mostrarPieza());//verifica forma
          assertEquals("0100110001000000", t.rotarIzquierda());//rotacion 1
          assertEquals("0100111000000000", t.rotarIzquierda());//rotacion 2
          assertEquals("0100011001000000", t.rotarIzquierda());//rotacion 3
          assertEquals("1110010000000000", t.rotarIzquierda());//rotacion 4
     }
     
     @Test
     public void rotacionLDerechaDerecha(){
          PiezaL L = new PiezaL(true);//crea la pieza
          assertEquals("1000100011000000", L.mostrarPieza());//verifica forma
          assertEquals("0010111000000000", L.rotarDerecha());//rotacion 1
          assertEquals("1100010001000000", L.rotarDerecha());//rotacion 2
          assertEquals("0000111010000000", L.rotarDerecha());//rotacion 3
          assertEquals("1000100011000000", L.rotarDerecha());//rotacion 4
     }

     @Test
     public void rotacionLDerechaIzquierda(){
          PiezaL L = new PiezaL(true);//crea la pieza
          assertEquals("1000100011000000", L.mostrarPieza());//verifica forma
          assertEquals("0000111010000000", L.rotarIzquierda());//rotacion 1
          assertEquals("1100010001000000", L.rotarIzquierda());//rotacion 2
          assertEquals("0010111000000000", L.rotarIzquierda());//rotacion 3
          assertEquals("1000100011000000", L.rotarIzquierda());//rotacion 4
     }

     @Test
     public void rotacionLIzquierdaDerecha(){
          PiezaL L = new PiezaL(false);//crea la pieza
          assertEquals("0100010011000000", L.mostrarPieza());//verifica forma
          assertEquals("0100011100000000", L.rotarDerecha());//rotacion 1
          assertEquals("0011001000100000", L.rotarDerecha());//rotacion 2
          assertEquals("0000011100010000", L.rotarDerecha());//rotacion 3
          assertEquals("0100010011000000", L.rotarDerecha());//rotacion 4
     }

     @Test
      public void rotacionLIzquierdaIzquierda(){
          PiezaL L = new PiezaL(false);//crea la pieza
          assertEquals("0100010011000000", L.mostrarPieza());//verifica forma
          assertEquals("0000011100010000", L.rotarIzquierda());//rotacion 1
          assertEquals("0011001000100000", L.rotarIzquierda());//rotacion 2
          assertEquals("0100011100000000", L.rotarIzquierda());//rotacion 3
          assertEquals("0100010011000000", L.rotarIzquierda());//rotacion 4
     }

     @Test
      public void comprobarCuadradoIzquierda(){
          PiezaCuadrado cuadrado = new PiezaCuadrado();//crea la pieza
          assertEquals("1100110000000000", cuadrado.mostrarPieza());//verifica forma
          assertEquals("1100110000000000", cuadrado.rotarIzquierda());//rotacion 1
          assertEquals("1100110000000000", cuadrado.rotarIzquierda());//rotacion 2
          assertEquals("1100110000000000", cuadrado.rotarIzquierda());//rotacion 3
          assertEquals("1100110000000000", cuadrado.rotarIzquierda());//rotacion 3
     }
      @Test
      public void comprobarCuadradoDerecha(){
          PiezaCuadrado cuadrado = new PiezaCuadrado();//crea la pieza
          assertEquals("1100110000000000", cuadrado.mostrarPieza());//verifica forma
          assertEquals("1100110000000000", cuadrado.rotarDerecha());//rotacion 1
          assertEquals("1100110000000000", cuadrado.rotarDerecha());//rotacion 2
          assertEquals("1100110000000000", cuadrado.rotarDerecha());//rotacion 3
          assertEquals("1100110000000000", cuadrado.rotarDerecha());//rotacion 4
     }

     @Test
     public void rotacionPaloDerecha(){
          PiezaPalo t = new PiezaPalo();//crea la pieza
          assertEquals("1000100010001000", t.mostrarPieza());//verifica forma
          assertEquals("1111000000000000", t.rotarDerecha());//rotacion 1
          assertEquals("1000100010001000", t.rotarDerecha());//rotacion 2
          assertEquals("1111000000000000", t.rotarDerecha());//rotacion 3
          assertEquals("1000100010001000", t.rotarDerecha());//rotacion 4
     }

     @Test
     public void rotacionPaloIzquierda(){
          PiezaPalo t = new PiezaPalo();//crea la pieza
          assertEquals("1000100010001000", t.mostrarPieza());//verifica forma
          assertEquals("1111000000000000", t.rotarIzquierda());//rotacion 1
          assertEquals("1000100010001000", t.rotarIzquierda());//rotacion 2
          assertEquals("1111000000000000", t.rotarIzquierda());//rotacion 3
          assertEquals("1000100010001000", t.rotarIzquierda());//rotacion 4
     }

}

