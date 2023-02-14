package ej04_collections;

import java.util.ArrayList;
import ej04_collections.PeliculaService;
import ej04_collections.Pelicula;

public class Ej04_Collections {

    public static void main(String[] args) {
        PeliculaService abc = new PeliculaService ();
        ArrayList<Pelicula> listaPeliculas = abc.crearMovie();
        abc.muestra(listaPeliculas);
        abc.mDuracion(listaPeliculas);
    }
}
