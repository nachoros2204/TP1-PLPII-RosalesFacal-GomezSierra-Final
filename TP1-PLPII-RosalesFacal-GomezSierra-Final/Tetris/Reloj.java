package Tetris;

import Piezas.PiezaBase;

public class Reloj{
    private int temporizador = 0;

    public void tick(PiezaBase pieza) {
        setTemporizador();
    }
    public void setTemporizador() {
        temporizador = temporizador + 1;
    }
}