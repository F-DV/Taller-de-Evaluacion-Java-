package Solucion;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        double numero = -1;                                //numero que pediremos al usuario
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escribe un numero");        //pedimos un numero al usuario
            numero = Double.parseDouble(sc.nextLine());

        }while(numero < 0);                                 //comprobamos que ese numero sea mayor a cero, si no seguimos preguntandole
    }
}
