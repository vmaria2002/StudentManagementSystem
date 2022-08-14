package controller;
import model.Catalog;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
public class StudentStartViewController {

private StudentStartView studentStartView;
private StudentDetalii studentDetalii;
private StudentContNou studentContNou;
private Catalog catalog;

public Student studentulMeu;
public StudentStartViewController(Catalog catalog, StudentStartView studentStartView, StudentContNou studentContNou, StudentDetalii studentDetalii){

    this.studentStartView =studentStartView;
    this.studentContNou=studentContNou;
    this.studentDetalii =studentDetalii;
    this.catalog = catalog;

    this.studentStartView.addcrateAccountButtonListenner(new CreateListennerCreate());
    this.studentStartView.addLogInButtonListenner(new CreateListennerLogIn());

}

    class CreateListennerCreate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

                studentContNou.deschidePaginaStudentContNouView();
                studentStartView.inchidePaginaStudentView();


        }

    }

    class CreateListennerLogIn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try{

                String user = studentStartView.getUserNameField();
                String pass = studentStartView.getPasswordField();

               System.out.println(user+pass);
                //Student student = new Student(user, pass);

int gasit =0;

               for(Student s: catalog.getStudentList()) {
                   if (s.getNume().equals(user) && s.getParola().equals(pass)) {
                       gasit = 1;
                       studentulMeu = s;
                       System.out.println(studentulMeu);


                       studentStartView.showMessage("Ati introdus user-ul si parola corect");


                       studentDetalii.deschidePaginaProfesorContNouView();


                       studentDetalii.setTemeTextArea(s.getTema().toString());
                       studentDetalii.setNoteTextArea(s.getNotele().toString());
                       studentDetalii.setOrarTextArea(s.getOrar().toString()); //va afisa tot orarul

                       studentStartView.inchidePaginaStudentView();
                       break;
                   }
               }


                     if(gasit==0)
                    studentStartView.showMessage("Nu ati introdus unser-ul si parola corect");


            }catch(Exception exception){
                studentStartView.showMessage("Date invalide!!");

            }
        }

    }
    public Student studetCautat(){
    return studentulMeu;
    }
    public Catalog valoriNoi(){
      return  this.catalog;
    }

}
