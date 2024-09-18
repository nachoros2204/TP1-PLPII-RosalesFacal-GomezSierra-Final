import static org.junit.Assert.assertEquals;
//req 1
import org.junit.Test;

import Piezas.PiezaCuadrado;
import Piezas.PiezaL;
import Piezas.PiezaPalo;
import Piezas.PiezaPerro;
import Piezas.PiezaT;

public class PiezasTests{

    @Test //Test forma palo
    public void checkPalo()
    {
        PiezaPalo palo = new PiezaPalo();//se crea la pieza
        String figura = palo.mostrarPieza();//representacion
        assertEquals("1000100010001000", figura);//compara con valor esperado
    }

    @Test//Test forma L derecha
    public void checkLDerecha(){
     PiezaL eleDerecha = new PiezaL(true);//se crea la pieza
     String figura = eleDerecha.mostrarPieza();//representacion
     assertEquals("1000100011000000", figura);//comparacion con valor esperado
    }

    @Test//Test forma L izquiera
    public void checkLIzquierda(){
     PiezaL eleIzquierda = new PiezaL(false);//se crea la pieza
     String figura = eleIzquierda.mostrarPieza();//representacion
     assertEquals("0100010011000000", figura);//comparacion con valor esperado
    }

    @Test//Test forma perro izquierdo
    public void checkPerroIzquierdo(){
     PiezaPerro perroIzquierdo = new PiezaPerro(false);//se crea la pieza
     String figura = perroIzquierdo.mostrarPieza();//representacion
     assertEquals("1100011000000000", figura);//comparacion con valor esperado
    }

    @Test//Test forma perro derecho
    public void checkPerroDerecho(){
     PiezaPerro perroDerecho = new PiezaPerro(true);//se crea la pieza
     String figura = perroDerecho.mostrarPieza();//representacion
     assertEquals("0110110000000000", figura);//comparacion con valor esperado
    }

    @Test
    public void checkCuadrado(){
     PiezaCuadrado cuadrado = new PiezaCuadrado();//se crea la pieza
     String figura = cuadrado.mostrarPieza();//representacion
     assertEquals("1100110000000000", figura);//comparacion con valor esperado
    }

   @Test
    public void checkT(){
        PiezaT t = new PiezaT();//se crea la pieza
        String figura = t.mostrarPieza();//representacion
        assertEquals("1110010000000000", figura);//comparacion con valor esperado
    }

}