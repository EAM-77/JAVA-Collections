/**
 *  CONJUNTOS
 */
package ejcoleccionesconjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class EjColeccionesConjuntos {

    public static void main(String[] args) {
        // Creamos e instanciamos el conjunto números.
        HashSet<Integer> numeros = new HashSet();
        Integer y;
        
        // Añadimos los objetos números.
       y = 72; numeros.add(y);
       y = 44; numeros.add(y);
       y = 56; numeros.add(y);
       y = 31; numeros.add(y);
       y = 98; numeros.add(y);
       y = 75; numeros.add(y);
       
       // Ahora removemos un objeto con el método .remove()
       numeros.remove(98);
       // Recorremos el Conjunto mediante un forEach con variable auxiliar, para mostrarlo por pantalla:
        System.out.println("La lista números tiene los siguientes elementos: ");
        
        for (Integer aux : numeros) {
            System.out.print(aux + " ");
        }
        System.out.println("");
        System.out.println(" ");
        System.out.println(" + + + + + + + ");
        System.out.println(" ");
        
        // ITERATOR
        System.out.println("Ahora recorro y muestro el Conjunto con el Iterator");
        // Creamos el Interator para recorrer el conjunto:
        Iterator iterator = numeros.iterator();
        
        // Armamos el bucle while, siemre que el hasNext() devuelva true.
        // Mostramos los elementos con el iterator.next().
        
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
