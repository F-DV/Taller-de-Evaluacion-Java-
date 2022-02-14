package Solucion;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                            //Variable para recibir respuesta de teclado del usuario
        String respuesta = "";                                          //variable para guardar la respuesta
        String mayusculas = "";                                         //Variable para guardar en mayusculas

        System.out.println("Escibre un dia de la semana");
        respuesta = sc.nextLine();

        mayusculas = respuesta.toUpperCase();                           //Convertimos toda la cadena a mayusculas para evita fallos por mayusculas y minusculas


        switch (mayusculas){                                            //Creamos sentencia switch para evaluar cada caso de entrada del usuario
            case "LUNES":
                System.out.println("Dia laboral");
                break;
            case "MARTES":
                System.out.println("Dia laboral");
                break;
            case "MIERCOLES":
                System.out.println("Dia laboral");
                break;
            case "JUEVES":
                System.out.println("Dia laboral");
                break;
            case "VIERNES":
                System.out.println("Dia laboral");
                break;
            case "SABADO":
                System.out.println("Dia laboral");
                break;
            case "DOMINGO":
                System.out.println("Dia No laboral");
                break;
        }


    }
}
