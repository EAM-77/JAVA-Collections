package ej01_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ej01_Collections {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String quere;
        // Creamos e instanciamos la lista.
        ArrayList<String> razas = new ArrayList();
        do{ 
        System.out.println("Ingresa una raza de perro: ");
        razas.add(read.next());
            System.out.println("Queres ingresar otra?:");
              quere=read.next();
            }while(!quere.equalsIgnoreCase("n"));
        System.out.println(razas.toString());
        
        System.out.println("Ingresa la raza a Eliminar...");
        quere=read.next();
        Iterator<String> dead=razas.iterator();
        while(dead.hasNext()){
            if (dead.next().equals(quere)) {
                dead.remove();
            }
        }
        Collections.sort(razas); // Ordena las razas de forma ascendente.
        System.out.println(razas);
    }
}
