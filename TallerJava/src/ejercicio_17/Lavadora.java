package ejercicio_17;

public class Lavadora extends Electrodomestico{
    double carga = 5;

    public Lavadora(){                                                  //constructor por defecto
        super();
    }
    public Lavadora(int precio, double peso){                           //constructor con precio y peso
        super(precio, peso);

    }
    public Lavadora(double carga){
        super();
        this.carga = carga;
    }

    /**
     * suma los accesorios de electrodomestico mas el aumento por peso
     * @return el precio total entero
     */
    public int preciofinal(){

        int aumentoPorPeso = 0;                                         //variable para el aumento por peso

        if(this.carga > 30){                                            //Aumentamos 50E  si la carga es mayor a 30 kg
            aumentoPorPeso = 50;
        }
        super.precioFinal();

        return super.precioFinal() + aumentoPorPeso;
    }

}
