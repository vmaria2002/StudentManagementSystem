package model;

import java.util.HashMap;
import java.util.Map;

public class Prezenta {
    private Map<String, Boolean> prezenta;

    public Prezenta() {
        this.prezenta = new HashMap<>();
    }

    public Map<String, Boolean> getPrezenta() {
        return prezenta;
    }

    public void setPrezenta(Map<String, Boolean> tema) {
        this.prezenta = prezenta;
    }
    public void adaugaMaterieSiPrezenta(String materia, Boolean estePrezent){
        this.prezenta.put(materia, estePrezent);
    }

    public String AfiseazaMateriaSiPrezenta(String materia){
        return materia+ this.prezenta.get(materia);
    }


    @Override
    public String toString() {
        return "Prezenta{" +
                "prezenta=" + prezenta +
                '}';
    }
}
