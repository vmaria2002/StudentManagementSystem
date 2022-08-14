package controller;

import model.Catalog;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class StudentContNouController {

    private StudentStartView studentStartView;
    private StudentContNou studentContNou;
    private Catalog catalog;

    public StudentContNouController(Catalog catalog, StudentContNou studentContNou, StudentStartView studentStartView) {
        this.studentContNou = studentContNou;
        this.studentStartView = studentStartView;
        this.catalog = catalog;

        this.studentContNou.addcrateAccountButtonListenner(new CreateListennerCreate());

    }

    class CreateListennerCreate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String user = studentContNou.getUserNameField();
            String pass = studentContNou.getPasswordField();
            Student student = new Student(user, pass);
            int gasit = 0;
            for (Student s : catalog.getStudentList()) {
                if (s.getNume().equals(user) && s.getParola().equals(pass)) {
                    gasit = 1;
                    studentContNou.showMessage("Studentul exista! Logati-va");
                }
            }
            if (gasit == 0) {
                catalog.getStudentList().add(student);

                System.out.println(catalog);
                studentContNou.inchideStudentContNoutView();
                studentStartView.deschidePaginaStudentView();
                studentContNou.showMessage("Cont nou!");
            }


        }
    }
        public Catalog valoriNoi() {
            return this.catalog;
        }

    }
