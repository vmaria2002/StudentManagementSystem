package model;

import java.util.HashMap;
import java.util.Map;

public class Note {


        private Map<String, Integer> nota; //materie+deadline

        public Note() {
            this.nota = new HashMap<>();
        }

        public Map<String, Integer> getNote() {
            return nota;
        }

        public void setTema(Map<String, Integer> tema) {
            this.nota = nota;
        }
        public void adaugaMaterieSiNota(String materia, int nota){
            this.nota.put(materia, nota);
        }

        public String  AfiseazaMateriaSiDeadline(String materia){
            return materia+this.nota.get(materia);
        }

    @Override
    public String toString() {
        return "Note{" +
                "nota=" + nota +
                '}';
    }
}
