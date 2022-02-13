package Solucion;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int parametro1 = 3;                                             //Creamos las variables a comparar
        int parametro2 = 3;

        if(parametro1 > parametro2){                                    //Condicional para determinar cual es el mayor de los dos numeros
            System.out.println("El parametro 1 es el mayor");
        }else if(parametro2 > parametro1){
            System.out.println("El parametro 2 es el mayor");
        }else{
            System.out.println("los numeros son iguales");
        }
    }
}
