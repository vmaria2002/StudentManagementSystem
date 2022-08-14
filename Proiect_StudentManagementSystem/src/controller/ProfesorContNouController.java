package controller;

import model.Catalog;
import model.Prezenta;
import model.Profesor;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class ProfesorContNouController {
    private ProfesorStartView profesorStartView;
    private ProfesorContNou profesorContNou;
    private Catalog catalog;

    public ProfesorContNouController(Catalog catalog, ProfesorStartView profesorStartView, ProfesorContNou profesorContNou) {
        this.profesorContNou = profesorContNou;
        this.profesorStartView = profesorStartView;
this.catalog=catalog;
        this.profesorContNou.addcrateAccountButtonListenner(new CreateListennerCreate());

    }

    class CreateListennerCreate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            String user = profesorContNou.getUserNameField();
            String pass = profesorContNou.getPasswordField();
            Profesor profesor = new Profesor(user, pass);
            int gasit = 0;
            for (Profesor s : catalog.getProfesors()) {
                if (s.getNume().equals(user) && s.getParola().equals(pass)) {
                    gasit = 1;
                    profesorContNou.showMessage("Profesorul exista! Logati-va");
                    profesorContNou.inchideProfesorContNoutView();
                    profesorStartView.deschidePaginaProfesorPassView();

                }
            }
            if (gasit == 0) {
                catalog.getProfesors().add(profesor);

                System.out.println(catalog);
                profesorContNou.inchideProfesorContNoutView();
                profesorStartView.deschidePaginaProfesorPassView();
                profesorContNou.showMessage("Cont nou creat!");
            }


        }
    }


    public Catalog valoriNoi() {
        return this.catalog;
    }
}
