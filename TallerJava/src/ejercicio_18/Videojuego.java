package ejercicio_18;

public class Videojuego implements Entregable{

    private String titulo = "";
    private int horasEstimadas = 0;
    private boolean entregado = false;
    private String genero = "";
    private String compañia = "";

    /**
     * Constructor por defecto
     */
    public Videojuego() {
    }

    /**
     * Constructor con parametros de entrada
     * @param titulo : titulo en String del video juego
     * @param horasEstimadas : Int horas estimadas del video juego
     */
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    /**
     *
     * @param titulo : String
     * @param horasEstimadas : Int
     * @param genero : String
     * @param compañia : String
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entragado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregable() {
        if(this.entregado == true){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @param o : Objeto a comparar
     * @return :  int, 0 para iguales, -1 para menor a de esta clase, 1 para mayor al de esta clase
     */
    @Override
    public int compareTo(Object o) {
        int numero = this.horasEstimadas;
        if(this.horasEstimadas == (int)o ){
            numero = 0;
        }else if(this.horasEstimadas < (int)o){
            numero = -1;
        }else if(this.horasEstimadas > (int)0){
            numero = 1;
        }
        return numero;
    }
}
