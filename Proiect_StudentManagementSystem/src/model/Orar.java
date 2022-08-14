package model;


import java.util.*;

public class Orar {
   private Map<Integer, ArrayList<String>> orar;



//see primesc materiile ca parametri, si se construieste orarul:

    public Orar(){

        this.orar = new HashMap<>();
    }


    public Map<Integer, ArrayList<String>> getOrar() {
        return orar;
    }

    public void setOrar(Map<Integer, ArrayList<String>> orar) {
        this.orar = orar;
    }

    public void adaugaZiSiExamene(int zi, ArrayList<String>examene){
        this.orar.put(zi, examene);
    }

    public ArrayList<String> afiseazaExameneDinZi(int zi){
        return this.orar.get(zi);
    }

    @Override
    public String toString() {
        return "Orar{" +
                "orar=" + orar +
                '}';
    }

}
