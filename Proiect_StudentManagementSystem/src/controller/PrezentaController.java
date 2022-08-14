package controller;
import model.Catalog;
import model.Prezenta;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
public class PrezentaController {
    private PrezentaAdaugare prezentaAdaugare;
    private MeniuProfesor meniuProfesor;
    private Catalog catalog;
    public PrezentaController(Catalog catalog, PrezentaAdaugare prezentaAdaugare,MeniuProfesor meniuProfesor){

   this.meniuProfesor=meniuProfesor;
   this.prezentaAdaugare=prezentaAdaugare;
    this.catalog=catalog;
   this.prezentaAdaugare.addtemaButtonListenner(new CreateListennerPrezenta());



    }
    class CreateListennerPrezenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String materia =prezentaAdaugare.getMateriaComboBox();
            String nume =prezentaAdaugare.getNumeStudentTextField();
            boolean estePrezent =prezentaAdaugare.getPrezentRadioButton();

            int gasit=0;
            for(int i=0; i<catalog.getStudentList().size(); i++){
                Student student = catalog.getStudentList().get(i);

                if(student.getNume().equals(nume)){
                    gasit =1;
                    Prezenta prezenta = student.getPrezenta();
                    prezenta.adaugaMaterieSiPrezenta(materia, estePrezent);
                    student.setPrezenta(prezenta);
                    catalog.getStudentList().set(i, student);
                    System.out.println(catalog);
                    prezentaAdaugare.showMessage("S-a adaugat prezenta "+prezenta+ "la nateria: "+ materia+ "pentru studentul: "+nume);
                    prezentaAdaugare.inchidePaginaPrezentaView();
                    meniuProfesor.deschidMeniuProfesorView();
                    break;
                }
            }
            if(gasit==0) {
                prezentaAdaugare.showMessage("nu s-a gasit studentul");
            }

        }

    }
public Catalog valoriNoi(){
        return this.catalog;
    }
}
