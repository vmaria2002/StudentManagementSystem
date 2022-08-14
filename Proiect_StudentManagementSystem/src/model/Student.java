package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Persoana{
    private Tema tema;
    private Note notele;
    private Prezenta prezenta;
    private Orar orar;

    public Student(String nume,String parola) {
        super(nume, parola);
        this.tema = new Tema();
        this.notele = new Note() ;
        this.orar = new Orar();
        this.prezenta = new Prezenta();
    }

    public Student(){
        super();

    }
   public Student(String nume){
        super(nume);
   }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema =tema;
    }

    public Note getNotele() {
        return notele;
    }

    public void setNotele(Note notele) {
        this.notele = notele;
    }

    public Orar getOrar() {
        return orar;
    }

    public void setOrar(Orar orar) {
        this.orar = orar;
    }

    public Prezenta getPrezenta() {
        return prezenta;
    }

    public void setPrezenta(Prezenta prezenta) {
        this.prezenta = prezenta;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "tema=" + tema +
                ", notele=" + notele +
                ", prezenta=" + prezenta +
                ", orar=" + orar +
                '}';
    }
}

