package Solucion;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        double parametro1 = 0;                                                  //creamos las variables
        double parametro2 = 0;
        Scanner sc = new Scanner(System.in);                                    //Instanciamos la clase Scanner que nos ayuda a leer de teclado

        System.out.println("Ingresa un primer numero");                         //pedimos el primer numero al usuario
        parametro1 = Double.parseDouble(sc.nextLine());                         //Lo almacenamos en una variable

        System.out.println("Ingresa un Segundo numero");                        //pedimos el segundo numero al usuario
        parametro2 = Double.parseDouble(sc.nextLine());                         //Lo almacenamos en una variable

        if(parametro1 > parametro2){                                            //Condicional para determinar cual es el mayor de los dos numeros ingresados
            System.out.println("El primer numero ingresado es el mayor");
        }else if(parametro2 > parametro1){
            System.out.println("El segundo numero ingresado es el mayor");
        }else{
            System.out.println("los numeros ingresados son iguales");
        }
    }
}
