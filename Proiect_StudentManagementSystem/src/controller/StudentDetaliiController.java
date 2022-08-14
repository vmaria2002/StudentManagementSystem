package controller;
import model.Catalog;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class StudentDetaliiController {
    private Catalog catalog;
    private PaginaStartView paginaStartView;
    private StudentDetalii studentDetalii;
    private Student student;

    public StudentDetaliiController(Catalog catalog, Student student,  StudentDetalii studentDetalii, PaginaStartView paginaStartView) {
       this.catalog = catalog;
        this.studentDetalii = studentDetalii;
        this.paginaStartView=paginaStartView;
        this.student=student;
        this.studentDetalii.addbackButtonListenner(new CreateListennerBeack());

    }

    class CreateListennerBeack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

                 studentDetalii.inchideProfesorContNoutView();
                 paginaStartView.deschidePaginaStartView();





        }
    }
}



