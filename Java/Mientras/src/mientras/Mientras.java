package mientras;

import java.util.Scanner;

public class Mientras {

    public static void main(String[] args) {
        //While Controlado por contador
        /*int cont = 0;
        
        while (cont < 5) {
            
            System.out.println("Soy Maxi, y estoy en la vuelta" + cont);
            cont = cont + 1;
        }*/

        //While controlado por centinela
        /*System.out.println("Ingrese un nombre");
        Scanner teclado = new Scanner (System.in);
        String nombre = teclado.next();
        
        
        while (!nombre.equals("Maxi")){
            
            System.out.println("El nombre ingresado fue " + nombre);
            
            System.out.println("Ingrese un nombre");
            nombre = teclado.next();
            
        }*/
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Estoy en la vuelta: " + i);

        }

    }

}
