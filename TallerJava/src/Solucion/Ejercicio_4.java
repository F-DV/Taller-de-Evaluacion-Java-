package Solucion;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double precio_sin_iva;                                                                  //variable para el precio sin iva del producto inicial
        double precio_con_iva;                                                                  //variable para guardar el precio con iva calculado
        final double IVA = 0.21;                                                                //Constante del iva


        Scanner sc = new Scanner(System.in);                                                    //Instanciamos clase Scanner para recibir valores de teclado

        System.out.println("Ingresa el precio del producto");                                   //Pedimos valores de teclado que corresponden al precio sin iva
        precio_sin_iva = Double.parseDouble(sc.nextLine());                                     //guardamos el valor ingresado del usuario

        precio_con_iva = ((precio_sin_iva * IVA) + precio_sin_iva);                             //calculamos el area del circulo
        System.out.println("El precio total con iva del producto es: " + precio_con_iva);       //Imprimimos el resultado
    }
}
