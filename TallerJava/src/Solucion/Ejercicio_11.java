package Solucion;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                                        //instanciamos objeto de la calse Scanner para recibir datos de teclado
        String fraseIngresada = "";                                                                 //Declaramos variable para guardar la respuesta del usuario
        int contador_de_vocales = 0;                                                                //creamos variable para contar las vocales de la frase
        int contador_de_caracteres = 0;                                                              //creamos variable para contar todos los caracteres de la frase
        char vocal;                                                                                 //si tiene voval nos cambiara a verdadero

        System.out.println("Ingrese una frase");
        fraseIngresada = sc.nextLine();                                                             //frase ingresada por el usuario

        for(int i = 0; i < fraseIngresada.length();i++) {                                           //recorremos todos los caracteres de la frase para analizar las vocales

            vocal = fraseIngresada.charAt(i);                                                       //analizamos cada caracter y lo asignamos a la variable vocal
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {     //evaluamos si la frase tiene un vocal
                contador_de_vocales++;                                                              //Si es asi, entonces sumamos al contador de vocales en
            }

            if(vocal != ' '){                                                                       //condicional para omitir los espacios en blanco y solo contar los caracteres
                contador_de_caracteres ++;
            }

        }
        System.out.println("La frase tiene: " + contador_de_caracteres + " Caracteres");            //imprimimos resultado en pantalla
        System.out.println("La frase tiene: " + contador_de_vocales + " Vocal");
    }
}
