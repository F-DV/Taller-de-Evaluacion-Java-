package ejercicio_18;

public class Serie implements Entregable{

    private String titulo = "";
    private int nTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    /**
     * Constructor por defecto
     */
    public Serie(){}

    /**
     *
     * @param titulo : String con titulo de la serie
     * @param creador : String con nombre del creador
     */
    public Serie(String titulo, String creador) {                                       //Constructor 2
        this.titulo = titulo;
        this.creador = creador;
    }

    /**
     *
     * @param titulo : String
     * @param nTemporadas : Int
     * @param genero : String
     * @param creador : String
     */
    public Serie(String titulo, int nTemporadas, String genero, String creador) {       //constructor 3
        this.titulo = titulo;
        this.nTemporadas = nTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", nTemporadas=" + nTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    //Metodos Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Define como verdadero al objeto que la llama la variable entregado
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * Define como falso al objeto que la llama la variable entregado
     */
    @Override
    public void devolver() {
        this.entregado = false;
    }

    /**
     * Validamos si el objeto esta entregado
     * @return boolean
     */
    @Override
    public boolean isEntregable() {
        if(this.entregado == true){
            return true;
        }else{
            return false;
        }
    }

    /**
     * validamos la serie con mayor numero de temporadas
     * @param o : objeto a comprar
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        int numero = this.nTemporadas;
        if(this.nTemporadas == (int)o ){
            numero = 0;
        }else if(this.nTemporadas < (int)o){
            numero = -1;
        }else if(this.nTemporadas > (int)0){
            numero = 1;
        }
        return numero;
    }
}
