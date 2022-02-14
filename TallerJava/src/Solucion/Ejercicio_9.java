package Solucion;

import jdk.swing.interop.SwingInterOpUtils;

public class Ejercicio_9 {
    public static void main(String[] args) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";                                //texto a reemplazar
        String texto_nuevo = "";                                                                          //variable para guardar el nuevo texto con los caracteres ya reemplazados
        String frase = " y tener un proposito definido sera nuestro guia hacia la felicidad total";      //Frase adicional para concatenar

        texto_nuevo = texto.replace("a","e");                                             //utilizamos el metodo replace de String para realizar la sustitucion de caracteres y guardamos el nuevo texto
        System.out.println(texto_nuevo + frase);                                                          //imprimimos el nuevo String ya con los cracteres reemplazados y la frase concatenada
    }
}
