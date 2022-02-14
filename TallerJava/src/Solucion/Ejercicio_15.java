package Solucion;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                        //instanciamos objeto para leer numero de teclado
        String respuesta = "0";
        boolean bandera = false;                                                    //creamos una bandera que nos sacara del while si el usuario introduce el 8

        do {                                                                        //creamos menu con do while
            System.out.println("*****GESTION CINEMATOGRAFICA*****");
            System.out.println("1 - NUEVO ACTOR \n" +
                    "2 - BUSCAR ACTOR \n" +
                    "3 - ELIMINAR ACTOR \n" +
                    "4 - MODIFICAR ACTOR \n" +
                    "5 - VER TODOS LOS ACTORES \n" +
                    "6 - VER PELICULAS DE LOS ACTORES \n" +
                    "7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n" +
                    "8 - SALIR");
            respuesta = sc.nextLine();                                              //leemos la respuesta del usuario

            switch (respuesta) {                                                    //solo evaluamos el 8 ya que asi lo requeria el ejercicio
                case "8":
                    bandera = true;                                                 //si la respuesta es 8 cambiamos la bandera y salimos del bucle
            }
        } while (bandera == false);
    }
}
