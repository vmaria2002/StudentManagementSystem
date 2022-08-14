package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Profesor extends Persoana{

    private String disciplina;
    private List<Student> studenti;

    public Profesor(String nume, String parola) {
        super(nume, parola);
        studenti = new ArrayList<>();
    }
public Profesor(){
        super();
        this.disciplina="AF";
    studenti = new ArrayList<>();
}


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "disciplina='" + disciplina + '\'' +
                ", studenti=" + studenti +
                '}';
    }

}
