package ej03_collections;

import java.util.ArrayList;

public class Alumno {
    String name;
    ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", notas=" + notas + '}';
    }
}
