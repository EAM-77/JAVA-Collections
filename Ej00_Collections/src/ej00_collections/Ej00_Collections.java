package ej00_collections;

import java.util.ArrayList;

public class Ej00_Collections {


    public static void main(String[] args) {
        
        // ARRAYS
        String[] nombreArray = new String[5];
        
        for (int i = 0; i < nombreArray.length; i++) {
            nombreArray[i] = "Chiquito" + (i +1);
        }
        for (String var : nombreArray) {
            System.out.println(var);
        }
        
        // COLLECTIONS
        
        // Instanciamos la colección, sin dimensión.
        
        ArrayList<String> nombreArrayList = new ArrayList();
        
        // Agregamos elementos (en este caso 3)
        nombreArrayList.add("Chiquito");
        nombreArrayList.add("Chiquito");
        nombreArrayList.add("Chiquito");
        
        // solicitamos nos muestre la cantidad de elementos.
        System.out.println(nombreArrayList.size());
        
        // Borramos uno de los elementos.
        
        nombreArrayList.remove("Chiquito");
        
        // solicitamos nos muestre la cantidad de elementos.
        System.out.println(nombreArrayList.size());
        
    }   
    
}
