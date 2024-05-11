package Cine;
import java.util.ArrayList;
import java.util.Date;
class Pelicula {
    private Director director;
    private ArrayList<Actor> actores;
    private Date fechaEstreno;
    private String titulo;
    private int duracion;
    private String sinopsis;

    public Pelicula(Director director, ArrayList<Actor> actores, Date fechaEstreno, String titulo, int duracion, String sinopsis) {
        this.director = director;
        this.actores = actores;
        this.fechaEstreno = fechaEstreno;
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }
}

