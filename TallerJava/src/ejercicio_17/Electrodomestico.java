package ejercicio_17;

import java.util.ArrayList;
import java.util.HashMap;

public class Electrodomestico {
    private int preciobase = 100;
    private String color = "BLANCO";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico(){                                                                        //constructor por defecto
    }

    public Electrodomestico(int preciobase, double peso){                                             //constructor con precioBase y peso
        this.preciobase = preciobase;
        this.peso = peso;
    }

    public Electrodomestico(int preciobase, String color, char consumoEnergetico, double peso) {     //Constructor con todos los metodos
        this.preciobase = preciobase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     *
     * @param letra
     * comprueba el consumo Energetico solicitado por el usuario,
     * este disponible,si no esta disponible, le asiga uno por defecto
     */
    private void comprobarConsumoEnergetico(char letra){                                              //Metodo para comprobar el consumo energetico
        ArrayList<Character> letras = new ArrayList<Character>();                                                              //llamamos el enum que almacena las letras disponibles y las guardamos en un array para iterar
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');

        for(Character c : letras){
            if(c.equals(letra)){
                this.consumoEnergetico = letra;
            }
        }
    }

    /**
     *
     * @param color
     * comprueba que el valor ingresado por el usuario, esté
     * disponible, si no, le asigna un color por defecto
     */
    private void comprobarColor(String color){
        ArrayList<String> colores = new ArrayList<String>();

        colores.add("BLANCO");
        colores.add("NEGRO");
        colores.add("ROJO");
        colores.add("AZUL");
        colores.add("GRIS");

        for(String colors : colores){
            if(color.equalsIgnoreCase(colors)){
                this.color = color;
            }
        }
    }
    /**
     * utiliza el hashmap para asignar valor en euros
     * a los caracteres disponibles que definen el consumo energetico.
     * Ademas crea condicionales if else para aumentar el valor en euros
     * dependiendo del peso del Electrodomestico
     * @return retorna el precio entero.
     */
    public int precioFinal(){
        int precioFinal = 0;
        int precioPeso = 0;
        int precioEnergia = 0;

        HashMap<Character, Integer> tabla = new HashMap<Character, Integer>();                            //Creamos la lista de precios
        tabla.put('A',100);
        tabla.put('B',80);
        tabla.put('C',60);
        tabla.put('D',50);
        tabla.put('E',30);
        tabla.put('F',10);

        precioEnergia = tabla.get(this.consumoEnergetico);                                                  //Compruebo el consumo energetico (clave) y le asigno el valor correspondiente (valor)

        if(this.peso <= 19){
            precioPeso = 10;
        }else if(this.peso >= 20 && this.peso <= 49){
            precioPeso = 50;
        }else if(this.peso >= 50 && this.peso <= 79){
            precioPeso = 80;
        }else if(this.peso >= 80){
            precioPeso = 100;
        }

        precioFinal = this.preciobase + precioPeso + precioEnergia;
        return precioFinal;
    }

    //metodos Getters para todos los atributos

    public double getPreciobase() {
        return preciobase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
