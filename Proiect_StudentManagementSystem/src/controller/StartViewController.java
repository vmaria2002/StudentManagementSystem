package controller;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartViewController {
private PaginaStartView paginaStartView;
private StudentStartView studentStartView;
private ProfesorStartView profesorStartView;
public StartViewController(PaginaStartView paginaStartView, StudentStartView studentStartView, ProfesorStartView profesorStartView) {
    this.paginaStartView = paginaStartView;
    this.profesorStartView=profesorStartView;
    this.studentStartView = studentStartView;

    this.paginaStartView.addProfesorButtonListenner(new CreateListennerProfesor());
    this.paginaStartView.addStudentButtonListenner(new CreateListennerStudent());

}
    class CreateListennerProfesor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            profesorStartView.deschidePaginaProfesorPassView();
            paginaStartView.inchidedePaginaStartView();
        }

        }
    class CreateListennerStudent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studentStartView.deschidePaginaStudentView();
            paginaStartView.inchidedePaginaStartView();
        }

    }
}
