package ejercicio_18;

public class Ejecutable {
    public static void main(String[] args) {

        Serie series[] = new Serie[5];                                                                          //Array de series
        Videojuego juego[] = new Videojuego[5];

        int seriesEntragadas = 0;                                                                               //variable para guardar cuantas series tenemos entregadas
        int serieMasTemporadas = 0;                                                                             //Guardamos el indez de la serie con mas temporadas
        int auxiliarComparacionTemporadas = 0;                                                                   //Auxilia para guardar el primero indez de las series y permitirnos comparar
        int juegosEntregados = 0;
        int auxiliarComparacionHoras = 0;                                                                        //variable para guardar la serie con mas horasEstimadas
        int juegoConMasHoras = 0;

        series[0] = new Serie("La casa de papel",5,"Suspenso","netflix");
        series[1] = new Serie("Good Doctor",6,"Drama","AmazonPrime");
        series[2] = new Serie("Vikingos",7,"Belica","Netflix");
        series[3] = new Serie("El juego del calamar",8,"suspenso","netflix");
        series[4] = new Serie("Los 100","Netflix");

        juego[0] = new Videojuego("Call Of Duty",10,"guerra","Activision");
        juego[1] = new Videojuego("medalla de honor",15,"guerra","Activision");
        juego[2] = new Videojuego("Banjo- Kazooie",8);
        juego[3] = new Videojuego("candy crush",5,"infantil","Activision");
        juego[4] = new Videojuego("Fifa",20,"Deportes","Electronic Arts");

        series[0].entregar();                                                                                   //Entregamos 2 series
        series[3].entregar();

        juego[3].entregar();                                                                                    //entregamos 3 videoJuegos
        juego[0].entregar();
        juego[1].entregar();

        for(Serie entregoSerie : series){                                                                        //validamos cuantas series de las que tenemos en la lista hay entregadas
            if(entregoSerie.isEntregable() == true){
                seriesEntragadas ++;
            }
        }
        for(int i =0; i< series.length;i++){                                                                   //Validamos cual es la serie con mas temporadas para devolverla
           auxiliarComparacionTemporadas = series[0].getnTemporadas();

            if(series[i].compareTo(auxiliarComparacionTemporadas) == 1){
                serieMasTemporadas = i;
            }
        }

        for(Videojuego juegoEntregado : juego){                                                                 //validamos cuantos juegos tenemos entregados
            if(juegoEntregado.isEntregable() == true){
                juegosEntregados ++;
            }
        }

        for(int i =0; i< juego.length;i++){                                                                   //Validamos cual de los video juegos tiene mas horas estimadas
            auxiliarComparacionHoras = juego[0].getHorasEstimadas();

            if(juego[i].compareTo(auxiliarComparacionHoras) == 1){
                juegoConMasHoras = i;
            }
        }

        System.out.println("Series entregadas: "+ seriesEntragadas);                                            //imprimimos en consola el numero de series entregadas en el momento
        System.out.println(series[serieMasTemporadas].toString());                                              //imprimimos los datos de la serie con mas temporadas

        System.out.println("Video Juegos entregados: " + juegosEntregados);                                     //Imprimimos en consola juegos entregados en el momento
        System.out.println(juego[juegoConMasHoras].toString());                                                 //Imprimimos los datos del juego con mas horas
    }
}
