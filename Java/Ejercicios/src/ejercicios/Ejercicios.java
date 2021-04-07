package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        /*
        int cont = 10;
        
        while(cont>0 && cont <=10){
            
            System.out.println(cont);
            cont--;
        }
         */

 /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
         */
        for (int cont = 0; cont < 10; cont++) {
            double num1, num2, resultado = 0;
            String operador;

            System.out.println("Ingrese su primer numero");
            Scanner teclado = new Scanner(System.in);
            num1 = teclado.nextInt();

            System.out.println("Ingrese el segundo numero");
            num2 = teclado.nextInt();

            System.out.println("Ingrese el operador");
            Scanner teclado2 = new Scanner(System.in);
            operador = teclado2.next();
            
            if(operador.equals("+")){
                resultado = num1 + num2;
            }
            if(operador.equals("-")){
                resultado = num1 - num2;
            }
            if(operador.equals("*")){
                resultado = num1 * num2;
            }
            if(operador.equals("/")){
                resultado = num1 / num2;
            }
            
            System.out.println("El resultado de la operacion es: " + resultado);
            
        }

    }

}
