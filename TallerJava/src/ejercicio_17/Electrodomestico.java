package ejercicio_17;

abstract class  Electrodomestico {
    int preciobase = 100;
    String color = "blanco";
    char consumoEnergetico = 'F';
    double peso = 5;

    public Electrodomestico(){                                                                        //constructor por defecto
    }
    public Electrodomestico(int precioBase, double peso){                                             //constructor con precioBase y peso
        this.preciobase = precioBase;
        this.peso = peso;
    }
    public Electrodomestico(int preciobase, String color, char consumoEnergetico, double peso) {     //Constructor con todos los metodos
        this.preciobase = preciobase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    private void comprobarConsumoEnergetico(char letra){                                              //Metodo para comprobar el consumo energetico
        Letra[] letras = Letra.values();                                                              //llamamos el enum que almacena las letras disponibles y las guardamos en un array para iterar
        for(int i = 0;i<letras.length;i++){                                                           //Recorremos el array
            if(letras[i].equals(letra)){                                                              //evaluamos cada parametro del array, si es igual a una de las Letras almacenadas, se la asignamos , si no dejmos por defecto
                this.consumoEnergetico = letra;
            }
        }
    }
    private void comprobarColor(String color){                                                         //comprobamos el color ingresado
        Color[] colores = Color.values();                                                             //traemos el enum que almacena los colores disponibles y los guardamos en un array para ser iterados
        for(int i=0; i<colores.length;i++){                                                           //recorremos el array
            if (colores[i].equals(color.toUpperCase())) {                                             //evaluamos si exite el color que ingresó el usuario
                this.color = colores[i].toString();                                                   // si el color existe, lo asignamos si no dejamos el color pór defecto
            }
        }
    }
    private void precioFinal(){

    }

    //metodos Gets para todos los atributos

    public int getPreciobase() {
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
