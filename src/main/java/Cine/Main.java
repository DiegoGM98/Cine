package Cine;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear participantes
        Director director1 = new Director("Pedro Almodóvar");
        Director director2 = new Director("Quentin Tarantino");
        Director director3 = new Director("Christopher Nolan");

        Actor actor1 = new Actor("Penélope Cruz");
        Actor actor2 = new Actor("Antonio Banderas");
        Actor actor3 = new Actor("Uma Thurman");
        Actor actor4 = new Actor("Leonardo DiCaprio");
        Actor actor5 = new Actor("Brad Pitt");
        Actor actor6 = new Actor("Meryl Streep");

        Jurado jurado1 = new Jurado("Sofía Vergara");
        Jurado jurado2 = new Jurado("Javier Bardem");

        // Crear películas
        ArrayList<Actor> actoresPelicula1 = new ArrayList<>();
        actoresPelicula1.add(actor1);
        actoresPelicula1.add(actor2);
        Pelicula pelicula1 = new Pelicula(director1, actoresPelicula1, new Date(), "Todo sobre mi madre", 125, "Sinopsis película 1");

        ArrayList<Actor> actoresPelicula2 = new ArrayList<>();
        actoresPelicula2.add(actor2);
        actoresPelicula2.add(actor3);
        Pelicula pelicula2 = new Pelicula(director2, actoresPelicula2, new Date(), "Pulp Fiction", 154, "Sinopsis película 2");

        ArrayList<Actor> actoresPelicula3 = new ArrayList<>();
        actoresPelicula3.add(actor4);
        actoresPelicula3.add(actor5);
        Pelicula pelicula3 = new Pelicula(director3, actoresPelicula3, new Date(), "Inception", 148, "Sinopsis película 3");

        ArrayList<Actor> actoresPelicula4 = new ArrayList<>();
        actoresPelicula4.add(actor1);
        actoresPelicula4.add(actor4);
        actoresPelicula4.add(actor6);
        Pelicula pelicula4 = new Pelicula(director1, actoresPelicula4, new Date(), "Volver", 121, "Sinopsis película 4");

        ArrayList<Actor> actoresPelicula5 = new ArrayList<>();
        actoresPelicula5.add(actor3);
        actoresPelicula5.add(actor5);
        actoresPelicula5.add(actor6);
        Pelicula pelicula5 = new Pelicula(director2, actoresPelicula5, new Date(), "Kill Bill: Vol. 1", 111, "Sinopsis película 5");

        // Asignar votos de los jurados
        jurado1.addAviso(new Aviso("Mejor película", true));
        jurado1.addAviso(new Aviso("Mejor dirección", true));
        jurado1.addAviso(new Aviso("Mejor actor", true));

        jurado2.addAviso(new Aviso("Mejor película", false));
        jurado2.addAviso(new Aviso("Mejor dirección", true));
        jurado2.addAviso(new Aviso("Mejor actriz", true));

        // Mostrar películas ganadoras y actores participantes
        System.out.println("Películas ganadoras:");
        for (Jurado jurado : new Jurado[]{jurado1, jurado2}) {
            for (Aviso aviso : jurado.getAvisos()) {
                if (aviso.isGanadorElegido()) {
                    System.out.println("- " + aviso.getCategoria() + ": " + getPeliculaGanadora(pelicula1, pelicula2, pelicula3, pelicula4, pelicula5));
                }
            }
        }

        System.out.println("\nActores participantes en cada película:");
        for (Pelicula pelicula : new Pelicula[]{pelicula1, pelicula2, pelicula3, pelicula4, pelicula5}) {
            System.out.println("- " + pelicula.getTitulo() + ":");
            for (Actor actor : pelicula.getActores()) {
                System.out.println("  - " + actor.getNombre());
            }
        }

        // Mostrar directores y actores que son parte de la premiación
        System.out.println("\nDirectores y actores que son parte de la premiación:");
        System.out.println("Directores:");
        System.out.println("- " + director1.getNombre());
        System.out.println("- " + director2.getNombre());
        System.out.println("- " + director3.getNombre());

        System.out.println("Actores:");
        System.out.println("- " + actor1.getNombre());
        System.out.println("- " + actor2.getNombre());
        System.out.println("- " + actor3.getNombre());
        System.out.println("- " + actor4.getNombre());
        System.out.println("- " + actor5.getNombre());
        System.out.println("- " + actor6.getNombre());

        // Mostrar cantidad de votos del jurado
        int totalVotosJurado = jurado1.getAvisos().size() + jurado2.getAvisos().size();
        System.out.println("\nCantidad de votos del Jurado: " + totalVotosJurado);
    }

    // Método para obtener el nombre de la película ganadora (selecciona la primera encontrada)
    public static String getPeliculaGanadora(Pelicula... peliculas) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                return pelicula.getTitulo();
            }
        }
        return "Ninguna película seleccionada";
    }
}
