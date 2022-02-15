package ejercicio_17;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        ArrayList <Electrodomestico> producto = new ArrayList<Electrodomestico>();
        int precioTelevisores = 0;
        int precioLavadoras = 0;
        int precioElectrodomesticos = 0;

        /**
         * Creamos Array de objetos e ingresamos los objetos
         */
        Electrodomestico electro[] = new Electrodomestico[10];

        electro[0] = new Electrodomestico();
        electro[1] = new Lavadora(30);
        electro[2] = new Lavadora(170,50);
        electro[3] = new Lavadora();
        electro[4] = new Lavadora(200,20);
        electro[5] = new Television();
        electro[6] = new Television(50,true);
        electro[7] = new Television(180,50);
        electro[8] = new Electrodomestico(70,"ROJO",'E',70);
        electro[9] = new Electrodomestico(500,10);

        //Creamos un forEach para recorrer los objetos

        for(Electrodomestico ele : electro){
            if(ele instanceof Lavadora){
                precioLavadoras = precioLavadoras +ele.precioFinal();
            }else if (ele instanceof  Television){
                precioTelevisores = precioTelevisores + ele.precioFinal();
            }else if(ele instanceof Electrodomestico){
                precioElectrodomesticos = precioElectrodomesticos + ele.precioFinal();
            }

        }

        //Imprimimos el precio final de cada clase
        System.out.println("El precio total de los Electrodomesticos es: " + precioElectrodomesticos + "\n" +
                "El precio total de las Lavadoras es: " + precioLavadoras + "\n" +
                "El precio total de los Televisores es: " + precioTelevisores);
    }
}
