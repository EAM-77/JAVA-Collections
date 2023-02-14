/*
LISTAS
 */
package ejcoleccioneslista;

import java.util.ArrayList;
import java.util.Iterator;

public class EjColeccionesLista {

    public static void main(String[] args) {
        // Creamos e instanciamos la lista numDireccion.
        ArrayList<Integer> numDireccion = new ArrayList();
        Integer x;
        
        // Agregamos 5 elementos, con lo cual la dimensión es 4:
        x = 4900;numDireccion.add(x);
        x = 832;numDireccion.add(x);
        x = 356;numDireccion.add(x);
        x = 1234;numDireccion.add(x);
        x = 988;numDireccion.add(x);
        numDireccion.add(7324);
                
        // Como hemos agregado un elemento de más, removemos uno de ellos, mediante su índice.
        numDireccion.remove(4);
        x = 988; numDireccion.remove(x); // por elemento específico.
                
        // Recorremos el ArrayList mediante un forEach con variable auxiliar, para mostrarlo por pantalla:
        System.out.println("La lista números de dirección, tiene los siguientes elementos: ");
        for (Integer aux : numDireccion) {
            System.out.print(aux + " ");
        }
        System.out.println("");
        System.out.println(" ");
        System.out.println(" + + + + + + + ");
        System.out.println(" ");
        // ITERATOR
        // Creamos el Interator para recorrer la lista:
        System.out.println("Ahora recorro y muestro la ArrayList con el Iterator");
        Iterator iterator = numDireccion.iterator();
        
        // Armamos el bucle while, siemre que el hasNext() devuelva true.
        // Mostramos los elementos con el iterator.next().
        
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }   
}
