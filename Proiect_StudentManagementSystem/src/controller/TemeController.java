package controller;

import model.Catalog;
import model.Student;
import model.Tema;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class TemeController {
    private TemeAdaugate temeAdaugate;
    private MeniuProfesor meniuProfesor;
    private Catalog catalog;

    public TemeController(Catalog catalog, TemeAdaugate temeAdaugate, MeniuProfesor meniuProfesor) {
        this.meniuProfesor=meniuProfesor;
        this.temeAdaugate = temeAdaugate;
        this.catalog=catalog;

        this.temeAdaugate.addtemaButtonListenner(new CreateListennerTeme());
    }

    class CreateListennerTeme implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String materia = temeAdaugate.getMateriacomboBox();
           String deadline =temeAdaugate.getDeadlinetextField();



           for(int i=0; i<catalog.getStudentList().size(); i++){
               catalog.getStudentList().get(i).getTema().adaugaMaterieSiTema(materia, deadline);


               System.out.println(catalog.getStudentList());
           }


            temeAdaugate.inchidePaginaTemeView();
            meniuProfesor.deschidMeniuProfesorView();
            meniuProfesor.showMessage("S-a adaugat tema: la "+ materia+" scadenta pana la data de: "+deadline);

        }

    }
public Catalog valoriNoi(){
        return this.catalog;
}

}
