import controller.*;
import model.*;
import view.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Student student = new Student("Maria", "m1");

//******************Studenti:*****************************************
        Orar orar = new Orar();
        ArrayList<String> luni = new ArrayList<String>();
        luni.add("AF");
        luni.add("MES");

        orar.getOrar().put(1, luni);

        Tema tema = new Tema();
        Note nota = new Note();
        Prezenta prezenta = new Prezenta();

        tema.adaugaMaterieSiTema("AF", "23-04-2022");

        nota.adaugaMaterieSiNota("AF", 10);
        nota.adaugaMaterieSiNota("BD", 10);

        prezenta.adaugaMaterieSiPrezenta("AF", true);

        student.setOrar(orar);
        student.setTema(tema);
        student.setNotele(nota);
        student.setPrezenta(prezenta);
        catalog.getStudentList().add(student);


//***********************Profesori:******************************
        Profesor profesor= new Profesor("Popescu", "pop");
        profesor.setDisciplina("AF");

        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(student);

        profesor.setStudenti(studenti);
        catalog.getProfesors().add(profesor);
// ***************************************************************
        System.out.println(catalog.getStudentList());


        ExamenAdaugat examenAdaugat = new ExamenAdaugat();


        MeniuProfesor meniuProfesor = new MeniuProfesor();


        NoteAdugate noteAdugate = new NoteAdugate();

        PaginaStartView paginaStartView = new PaginaStartView();

        paginaStartView.deschidePaginaStartView();

        PrezentaAdaugare prezentaAdaugare = new PrezentaAdaugare();


        ProfesorContNou profesorContNou = new ProfesorContNou();


        ProfesorStartView profesorStartView = new ProfesorStartView();


        StudentContNou studentContNou = new StudentContNou();


        StudentDetalii studentDetalii = new StudentDetalii();


        StudentStartView studentStartView = new StudentStartView();


        TemeAdaugate temeAdaugate = new TemeAdaugate();




        StartViewController startViewController = new StartViewController(paginaStartView, studentStartView, profesorStartView);

        StudentStartViewController studentStartViewController = new StudentStartViewController(catalog, studentStartView, studentContNou, studentDetalii);

        catalog = studentStartViewController.valoriNoi();
        Student studentulCautat = studentStartViewController.studetCautat();
        StudentContNouController studentContNouController = new StudentContNouController(catalog, studentContNou, studentStartView);
        catalog = studentContNouController.valoriNoi();

        StudentDetaliiController studentDetaliiController = new StudentDetaliiController(catalog, studentulCautat, studentDetalii, paginaStartView);


        ProfesorStartController profesorStartController = new ProfesorStartController(catalog, profesorStartView, meniuProfesor, profesorContNou);
Profesor prof =profesorStartController.obtinProf();
        ProfesorContNouController profesorContNouController = new ProfesorContNouController(catalog, profesorStartView, profesorContNou);
catalog = profesorContNouController.valoriNoi();
        ProfesorMeniuController profesorMeniuController = new ProfesorMeniuController(meniuProfesor, examenAdaugat, noteAdugate, prezentaAdaugare, temeAdaugate, paginaStartView);

        TemeController temeController = new TemeController(catalog, temeAdaugate, meniuProfesor);
catalog= temeController.valoriNoi();

       ExamenController examenController = new ExamenController(catalog, examenAdaugat, meniuProfesor);
catalog= examenController.valoriNoi();

       NotaController notaController = new NotaController(catalog, noteAdugate, meniuProfesor);
catalog= notaController.valoriNoi();

PrezentaController prezentaController = new PrezentaController(catalog, prezentaAdaugare, meniuProfesor);
catalog= prezentaController.valoriNoi();

    }
}