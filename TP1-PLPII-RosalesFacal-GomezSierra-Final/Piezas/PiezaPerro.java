package Piezas;
public class PiezaPerro extends PiezaBase {
boolean esCorrecta;

String[] derecha = {"0110110000000000", "1000110001000000", "0110110000000000", "1000110001000000"};
String[] izquierda = {"1100011000000000", "0100110010000000", "1100011000000000", "0100110010000000"};

public PiezaPerro(boolean esCorrectaRespuesta) {
    this.esCorrecta = esCorrectaRespuesta;
}

public PiezaPerro() {
    this(false);
}

@Override
public String mostrarPieza() {
    if (esCorrecta) {
        return(derecha[posicionActual]);
    } else {
        return(izquierda[posicionActual]);
    }
} 

@Override
public String mostrarPiezaEnPosicion (int posicion) {
    if (esCorrecta) {
        return (derecha[posicion]);
    } else {
        return (izquierda[posicion]);
    }
}

}