package ej03_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner read = new Scanner(System.in);

    public ArrayList<Alumno> crearAlumno() {
        String op;
        ArrayList<Alumno> alumnos = new ArrayList();
        do {
            Alumno a = new Alumno();
            System.out.println("Ingresa el alumno:");
            a.setName(read.next());
            System.out.println("Ingrese las 3 notas:");
            a.getNotas().add(read.nextInt());
            a.getNotas().add(read.nextInt());
            a.getNotas().add(read.nextInt());
            System.out.println(a.toString());
            alumnos.add(a);
            System.out.println("Desea ingresar otro alumno?:");
            op = read.next();
        } while (!op.equalsIgnoreCase("n"));
        System.out.println("Registro creado...");
        return alumnos;
    }
       
    public void notaFinal(ArrayList<Alumno> alumnos) {
        String buscar;
        System.out.println("Ingrese el nombre del gilipollas que buscamos?:");
        buscar=read.next();
        for (Alumno aux : alumnos) {
            if (alumnos.contains(aux)){
                ArrayList<Integer> prom=aux.getNotas();
                promedio(prom);
                break;
            }else System.out.println("No se encuentra el alumno buscado");
        }
    }
    public void promedio(ArrayList<Integer> notas){
        double promedio;
        double sumatoria=0;
        for (int i = 0; i < notas.size(); i++) {
            sumatoria+=notas.get(i);
        }
        promedio=sumatoria/3;
        System.out.println("La nota promedio es: "+promedio);
    }
}
