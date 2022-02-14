package Solucion;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                    //instanciamos objeto de la calse Scanner para recibir datos de teclado
        String fraseIngresada = "";                                             //Declaramos variable para guardar la respuesta del usuario
        String fraseSinEspacios;

        System.out.println("Escriba una frase");
        fraseIngresada = sc.nextLine();

        fraseSinEspacios = fraseIngresada.replace(" ","");      //nuevamente nos apoyamos de la Api de java para utilizar uno de los metodos String replace
        System.out.println(fraseSinEspacios);                                   //imprimimos la frase sin espacioes
    }
}
