package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tema {
    private Map<String, String> tema; //materie+deadline

    public Tema() {
        this.tema = new HashMap<>();
    }

    public Map<String, String> getTema() {
        return tema;
    }

    public void setTema(Map<String, String> tema) {
        this.tema = tema;
    }
    public void adaugaMaterieSiTema(String materia, String deadline){
        this.tema.put(materia, deadline);
    }

    public String AfiseazaMateriaSiDeadline(String materia){
        return materia+ this.tema.get(materia);
    }

    @Override
    public String toString() {
        return "Tema{" +
                "tema=" + tema +
                '}';
    }
}
