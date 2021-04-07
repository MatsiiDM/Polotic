package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        //declaracion y asignacion de mi matriz
        int matriz[][] = new int[4][4];

        Scanner teclado = new Scanner(System.in);

        //recorrido y carga
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Estoy en la fila: " + f + " cruce con columna " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

}
