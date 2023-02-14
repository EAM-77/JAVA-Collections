package ej04_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    Scanner s = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> crearMovie(){
        ArrayList<Pelicula> movies = new ArrayList();
        String option;
        do{
            Pelicula movie = new Pelicula();
            System.out.println("Ingrese el título: ");
            movie.setTitulo(s.next());
            System.out.println("Ingrese Director: ");
            movie.setDirector(s.next());
            System.out.println("Ingrese duración: ");
            movie.setDuracion(s.nextInt());
            movies.add(movie);
            
            System.out.println("Desea cargar otra película?");
            option=s.next();
        } while (!option.equalsIgnoreCase("N"));
        System.out.println("Registro creado...");
        return movies;
    }
    public void muestra(ArrayList<Pelicula> movies){
        System.out.println("La lista de películas es: ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
            
        }
        /*
        for (Pelicula m : movies) 
        {    
            System.out.println(m);
        }*/
    }
    
    public void mDuracion(ArrayList<Pelicula> movies){
        for (Pelicula movy : movies) {
            int a=movy.getDuracion();
            if (a>1) {
                System.out.println(movy);
            }
        }
    }
}
