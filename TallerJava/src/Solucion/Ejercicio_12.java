package Solucion;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra_1 = "";
        String palabra_2 = "";
        String diferencias = "";


        System.out.println("Ingrese la palabra 1");                         //Pedimos al usuario la palabra 1
        palabra_1 = sc.nextLine();                                          //guardamos la palabra 1
        System.out.println("Ingrese la palabra 2");                         //Pedimos al usuario la palabra 2
        palabra_2 = sc.nextLine();                                          //guardamos la palabra 2




        if(palabra_1.equals(palabra_2)) {                                   //evaluamos si las palabras con iguales
            System.out.println("Las palabras son iguales");
        }else if(palabra_1.length() != palabra_2.length()) {                //evaluamos si las palabras son diferentes en longitud
            System.out.println("Son diferentes en su longitud");
        }else{
            for(int i =0; i < palabra_1.length(); i++){                     //encaso de que tengan la misma longitud pero sean diferentes, imprimimos sus caracteres diferentes
                if(palabra_1.charAt(i) != palabra_2.charAt(i)){
                    diferencias = diferencias + palabra_1.charAt(i);
                }
            }
            System.out.println("Sus caracteres diferentes son: " + diferencias);
        }

        }

}
