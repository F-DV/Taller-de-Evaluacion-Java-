package ejercicio_18;

public class Ejecutable {
    public static void main(String[] args) {

        Serie series[] = new Serie[5];                                                                          //Array de series

        int seriesEntragadas = 0;
        int serieMasTemporadas = 0;
        int auxiliarComparacion = 0;

        series[0] = new Serie("La casa de papel",5,"Suspenso","netflix");
        series[1] = new Serie("Good Doctor",6,"Drama","AmazonPrime");
        series[2] = new Serie("Vikingos",7,"Belica","Netflix");
        series[3] = new Serie("El juego del calamar",8,"suspenso","netflix");
        series[4] = new Serie("Los 100","Netflix");

        series[0].entregar();                                                                                   //Entregamos 2 series
        series[3].entregar();

        for(Serie entregoSerie : series){                                                                        //validamos cuantas series de las que tenemos en la lista hay entregadas
            if(entregoSerie.isEntregable() == true){
                seriesEntragadas ++;
            }
        }
        for(int i =0; i< series.length;i++){                                                                   //Validamos cual es la serie con mas temporadas para devolverla
           auxiliarComparacion = series[0].getnTemporadas();

            if(series[i].compareTo(auxiliarComparacion) == 1){
                serieMasTemporadas = i;
            }
        }
        System.out.println("Series entregadas: "+ seriesEntragadas);                                            //imprimimos en consola el numero de series entregadas en el momento
        System.out.println(series[serieMasTemporadas].toString());                                              //imprimimos los datos de la serie con mas temporadas
    }
}
