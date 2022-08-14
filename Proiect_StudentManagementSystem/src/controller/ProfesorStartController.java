package controller;
import model.Catalog;
import model.Profesor;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class ProfesorStartController {
  private  ProfesorStartView profesorStartView;
  private MeniuProfesor meniuProfesor;
  private ProfesorContNou profesorContNou;
  private Catalog catalog;
  private Profesor profesorulMeu;

  public ProfesorStartController(Catalog catalog, ProfesorStartView profesorStartView,MeniuProfesor meniuProfesor,ProfesorContNou profesorContNou  ) {
      this.profesorStartView=profesorStartView;
      this.meniuProfesor=meniuProfesor;
      this.profesorContNou = profesorContNou;
      this.catalog=catalog;
this.profesorulMeu=new Profesor();
      this.profesorStartView.addcrateAccountButtonListenner(new CreateListennerCreate());
      this.profesorStartView.addLogInButtonListenner(new CreateListennerLogIn());
  }

    class CreateListennerCreate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            profesorStartView.inchidePaginaProfesorPassStartView();
            profesorContNou.deschidePaginaProfesorContNouView();


        }
    }

    class CreateListennerLogIn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String user =profesorStartView.getUserNameField();
                String pass = profesorStartView.getPasswordField();

                System.out.println(user+pass);
int gasit=0;
                for(Profesor s: catalog.getProfesors()) {
                    if (s.getNume().equals(user) && s.getParola().equals(pass)) {
                        gasit = 1;
                        profesorulMeu = s;
                        System.out.println(profesorulMeu);


                        profesorStartView.showMessage("Ati introdus user-ul si parola corect");
                        meniuProfesor.deschidMeniuProfesorView();

                        profesorStartView.inchidePaginaProfesorPassStartView();
                    break;
                    }
                }
                if(gasit==0)
                        profesorStartView.showMessage("Nu ati introdus unser-ul si parola corect");

        }catch(Exception exception){
                        profesorStartView.showMessage("Date invalide");
                    }
            }
        }
public Profesor obtinProf(){
      return profesorulMeu;
}

    }


