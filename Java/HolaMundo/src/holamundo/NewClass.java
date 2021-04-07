package holamundo;

public class NewClass {

    public static void main(String[] args) {

        int suma = 0;
        int num = 5;
        int resta = 0;
        String bloqueif = "";

        if (num > 3) {
            suma = num + num;
            System.out.println("El resultado de la suma es: " + suma);
            bloqueif = "if";
        } else {
            if (num == 1) {
                System.out.println("El numero es un 1");
                bloqueif = "SEGUNDO IF";
            } else {
                System.out.println("El numero es menor o igual a 3 pero no es 1");
                bloqueif = "SEGUNDO ELSE";
            }
        }

    }

}
