package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        //declaracion y asignacion de mi vector
        int numeros[] = new int[4];
        numeros[0] = 1;
        numeros[1] = 5;
        numeros[2] = 8;
        numeros[3] = 12;
        
        System.out.println("La posicion 3 tiene guardado un: " + numeros[3]);
        

        /*
        Scanner teclado = new Scanner(System.in);

        //cargo mi vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor que quiere guardar en la posicion del indice: " + i);
            numeros[i] = teclado.nextInt();
        }

        //recorrido para mostrar lo que tiene guardado
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Estoy en el indice: " + i + " el numero que esta guardado es el: " + numeros[i]);
        }
        */
    }

}
