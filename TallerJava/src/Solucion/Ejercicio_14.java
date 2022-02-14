package Solucion;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        int numeroIntroducido = 0;                              //declaramos variable para el numero introducido
        Scanner sc = new Scanner(System.in);                    //instanciamos variable para ller datos de teclado

        System.out.println("Ingrese un numero entero");         //pedimos el numero al usuario
        numeroIntroducido = Integer.parseInt(sc.nextLine());     //guardamos y convertimos a entero el numero introducido


        while(numeroIntroducido <= 1000){                          //condicional while para iterar hasta 1000
            System.out.println(numeroIntroducido);                 //imprimimos el numero
            numeroIntroducido = numeroIntroducido + 2;              //sumamos 2 desde el numero introducido hasta 1000
        }

    }
}
