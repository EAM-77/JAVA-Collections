package ejcolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;



public class EjColecciones {

    public static void main(String[] args) {
        // ++++ LISTAS ++++
        // Creamos la lista numerosA e instanciamos con dimensión 0.
        ArrayList<Integer> numerosA = new ArrayList();
        // Imprimimos la dimensión
        System.out.println("La lista inicia con dimensión: " + numerosA.size());
       
        // Añadimos objetos, mediante el método .add(t), donde t es el dato a ingresar.
        
        Integer x = 20;
        numerosA.add(x); // Agregamos el número 20 a la lista.
        x = 32;
        numerosA.add(x); // Agregamos el número 32 a la lista.
        x = 5;
        numerosA.add(x); // Agregamos el número 5 a la lista.
        
        // Tambien, es posible hacerlo de la siguiente manera:
        
        numerosA.add(78); // Agregamos el número 78 a la lista.
        numerosA.add(31); // Agregamos el núemro 31 a la lista.
        
        System.out.println("Ahora la dimensión es: " + numerosA.size()); // mostramos dimensión.
        System.out.println("El contenido de la lista es: " + numerosA); // mostramos contenido.
        
        /* Ahora removemos un objeto con el método .remove()
         este método posee varias opciones que deberemos revisar y elegir la que mejor
         se adapte.
        */
        numerosA.remove(3); // Removemos el 4to índice (número 78) de la lista.
        System.out.println("Ahora la dimensión es: " + numerosA.size());
        System.out.println("El contenido de la lista es: " + numerosA);
        
        System.out.println("");
        System.out.println("Ahora vamos a mostrar los elementos a traves de su variable, utilizando el forEach.");
        // Ahora vamos a mostrar los elementos a traves de su variable, utilizando el forEach
        for (Integer aux : numerosA) {
            System.out.println(aux);
        }
        
        Integer xx = 32;
        numerosA.remove(xx); // Removemos el 1er objeto de la lista con el número 32.
        System.out.println("Ahora la dimensión es: " + numerosA.size());
        System.out.println("El contenido de la lista es: " + numerosA);
        /*
        Al intentar remover por elemento u objeto, el algoritmo genera un error.
        */
        System.out.println("");
        System.out.println("");
        
        
        // +++++ CONJUNTOS +++++
        // Creamos el conjunto numerosB e instanciamos con dimensión 0.
        
        HashSet<Integer> numerosB = new HashSet();
        System.out.println("El Conjunto inicia con dimensión: " + numerosB.size());
        
        // Añadimos objetos, notar que el tipo de datos se define como objetos
        Integer y = 72;
        numerosB.add(y); // Agregamos el número 72 a la Conjunto.
        y = 3;
        numerosB.add(y); // Agregamos el número 3 a la Conjunto.
        y = 28;
        numerosB.add(y); // Agregamos el número 28 a la Conjunto.
        
        // Tambien, es posible hacerlo de la siguiente manera:
        
        numerosB.add(77); // Agregamos el número 77 a la Conjunto.
        numerosB.add(7); // Agregamos el núemro 7 a la Conjunto.
        
        System.out.println("Ahora la dimensión es: " + numerosB.size()); // mostramos dimensión.
        System.out.println("El contenido del conjunto es: " + numerosB); // mostramos contenido.
        
        // Ahora removemos un objeto con el método .remove()

        numerosB.remove(28);
        System.out.println("Ahora la dimensión es: " + numerosB.size());
        System.out.println("El contenido de la lista es: " + numerosB);
        
        System.out.println("");
        System.out.println("");
        /* +++++ MAPAS +++++
         Ejemplos de mapas de "alumnos" con instanciación en dimensión 0.
        
        HashMap<Integer,String> alumnosA = new HashMap();
        
        TreeMap<Integer, String> alumnosB = new TreeMap();
        
        LinkedHashMap<Integer, String> alumnosC = new LinkedHashMap();
        
        +++  Añadimos objetos +++
        */
        HashMap<Integer, String> alumnosA = new HashMap();
        Integer dni = 32456789;
        String nombreAlumno = "Coco";
        alumnosA.put(dni, nombreAlumno); // Agregamos la llave y el valor.
        dni = 54612452;
        nombreAlumno = "Pepe";
        alumnosA.put(dni, nombreAlumno);
        
        alumnosA.put(dni = 98765432, nombreAlumno = "Pedro");
        
        System.out.println("Ahora la dimensión es: " + alumnosA.size()); // mostramos dimensión.
        System.out.println("El contenido de la lista es: " + alumnosA); // mostramos contenido.
        
        // Removemos un objeto del mapa.
        alumnosA.remove(54612452);
        
        System.out.println("Ahora la dimensión es: " + alumnosA.size()); // mostramos dimensión.
        System.out.println("El contenido de la lista es: " + alumnosA); // mostramos contenido.
            
        } 
}
