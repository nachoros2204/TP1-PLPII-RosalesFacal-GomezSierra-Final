package Piezas;


public class PiezaT extends PiezaBase{
    public PiezaT() {
        super.figura = new String[]{"1110010000000000", "0100011001000000", "0100111000000000", "0100110001000000"};
     }

    public String mostrarPieza() {
         return super.figura[super.posicionActual]; // Puedes cambiar el índice para devolver una orientación diferente
    }
    public String rotarDerecha() {
        super.posicionActual = (super.posicionActual + 1) % 4;
        return mostrarPieza();
    }

    public String rotarIzquierda() {
        super.posicionActual = (super.posicionActual - 1 + 4) % 4;
        return mostrarPieza();
    }
}