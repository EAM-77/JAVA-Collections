
package ej03_collections;

import java.util.ArrayList;

public class Ej03_Collections {

    public static void main(String[] args) {
        AlumnoService al = new AlumnoService();
        ArrayList<Alumno> ptq=al.crearAlumno();
        al.notaFinal(ptq);
    }
}
