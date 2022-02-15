package ejercicio_17;

public class Television extends Electrodomestico{

    double resolucion = 20;
    boolean sintonizadorTDT = false;

    public Television(){                                                    //constructor por defecto
        super();
    }

    public Television(int precio, double peso){
        super(precio,peso);
    }

    public Television(double resolucion, boolean sintonizadorTDT){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * suma el precio de los accesorios por electrodomestico mas
     * los accesorios de television.
     * @return Precio final mas aumento por accesorio de Television
     */
    public int precioFinal(){
        int aumentoPorResolucion = 0;
        int aumentoPorTDT = 0;

        if(this.resolucion > 40){
            aumentoPorResolucion = (int) (super.precioFinal() * 0.30);
        }
        if(this.sintonizadorTDT == true){
            aumentoPorTDT = 50;
        }
        return super.precioFinal() + aumentoPorResolucion + aumentoPorTDT;
    }

}
