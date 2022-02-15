package ejercicio_18;

public class Serie {

    String titulo = "";
    int nTemporadas = 3;
    boolean entregado = false;
    String genero = "";
    String creador = "";

    public Serie(){}                                                                   //Constructor por defecto

    public Serie(String titulo, String creador) {                                       //Constructor 2
        this.titulo = titulo;
        this.creador = creador;
    }

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
}
