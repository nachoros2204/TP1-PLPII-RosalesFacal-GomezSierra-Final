package Tetris;

public class Tetris {
     public Tablero tablero = new Tablero(); // Maneja el estado del tablero
     public Reloj reloj = new Reloj(); // Controla el temporizador
          
// Inicia el juego configurando el temporizador y colocando una pieza
     public void iniciar(){ 
          reloj.setTemporizador(); 
          tablero.setpiezaActual();  // Generar una pieza aleatoria
          int posicionInicial = (int) (Math.random() * 10);  // Posición aleatoria entre 0 y 9
          tablero.insertPiezaEnTablero(tablero.piezaActual, posicionInicial); 
     }

// Verifica el estado del juego (victoria)
     public boolean estado(){ 
          return tablero.verificarVictoria();
     }

// Rota la pieza actual hacia la izquierda
     public void rotarIzquierda(){
          tablero.piezaActual.rotarIzquierda();
     }

// Rota la pieza actual hacia la derecha
     public void rotarDerecha(){
          tablero.piezaActual.rotarDerecha();
     }

// Actualiza el tablero y verifica si el juego continúa o ha terminado
     public void tick(){
          reloj.setTemporizador();
          tablero.actualizarTableroEnTick();
          if(!tablero.verificarTablero()){
               System.out.println("Has perdido!");
          }
          if(estado()){
               System.out.println("Has ganado!");
          }
     }
}