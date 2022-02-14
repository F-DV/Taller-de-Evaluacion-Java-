package Solucion;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Date fecha = new Date();                                                           //Obtenemos fecha de hoy

        SimpleDateFormat fechaConFormato = new SimpleDateFormat("YYYY/MM/dd");      //le damos formato a la fecha
        System.out.println(fechaConFormato.format(fecha));                                 //imprimimos la fecha
    }
}
