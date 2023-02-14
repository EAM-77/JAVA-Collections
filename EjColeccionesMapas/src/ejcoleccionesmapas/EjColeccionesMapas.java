/*
    MAPAS
 */
package ejcoleccionesmapas;

import java.util.HashMap;
import java.util.Map;

public class EjColeccionesMapas {

    public static void main(String[] args) {
        // Creamos e instanciamos el Mapa de objeto Alumnos.
        HashMap<Integer, String> alumnos = new HashMap();
        
        // Añadimos los objetos, instanciando la llave y la variable
        Integer dni;String nombreAlumno;
        
        dni = 32456789;nombreAlumno = "Coco"; alumnos.put(dni, nombreAlumno); // Agregamos la llave y el valor.
        dni = 54612452;nombreAlumno = "Pepe"; alumnos.put(dni, nombreAlumno);
        
        // Añadimos el objeto directamente con el método put.
        alumnos.put(dni = 98765432, nombreAlumno = "Pedro");
        
        // Recorro las 2 partes del mapa.
        // entry.getKey muestra la llave y entry.getValue muestra los valores del mapa.
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Documento:" + entry.getKey());
            System.out.println("Nombre:" + entry.getValue());
            System.out.println(" ");
        }
        // o separadamente...
        System.out.println(" ");
        System.out.println(" + + + + + ");
        for (Integer key : alumnos.keySet()){
            System.out.println("Documento: " + key);            
        }
        System.out.println(" + + + + + ");
        for (String value : alumnos.values()){
            System.out.println("Nombre: " + value);
        }
    }
    
}
