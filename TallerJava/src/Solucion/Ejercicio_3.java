package Solucion;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        double radio = 0.0;                                                     //Variable que recibira la entrada del usuario
        double areaCirculo;                                                     //variable para el area
        Scanner sc = new Scanner(System.in);                                    //Instanciamos clase Scanner para recibir valores de teclado

        System.out.println("Ingresa el radio del circulo");                     //Pedimos valores de teclado que corresponden al radio
        radio = Double.parseDouble(sc.nextLine());                              //guardamos el valor ingresado del usuario

        areaCirculo = Math.PI * Math.pow(radio,2);                              //calculamos el area del circulo
        System.out.println("El area del circulo es: " + areaCirculo);           //Imprimimos el resultado para el valor de radio ingresado



    }
}
