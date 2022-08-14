package controller;
import model.Catalog;
import model.Orar;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExamenController {
    private ExamenAdaugat examenAdaugat;
    private MeniuProfesor meniuProfesor;
    private Catalog catalog;

    public ExamenController(Catalog catalog, ExamenAdaugat examenAdaugat, MeniuProfesor meniuProfesor) {
        this.meniuProfesor =meniuProfesor;
        this.examenAdaugat = examenAdaugat;
        this.catalog = catalog;

        this.examenAdaugat.addtemaButtonListenner(new CreateListennerExamen());
    }

    class CreateListennerExamen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String materia = examenAdaugat.getMateriacomboBox();
            int zi = examenAdaugat.getZiTextField();

            for (int i = 0; i < catalog.getStudentList().size(); i++) {
                Orar orar = catalog.getStudentList().get(i).getOrar();
                ArrayList<String> ziCuEx = orar.getOrar().get(zi); //am obtinut string-ul cu examene
                if(orar.getOrar().get(zi)==null)
                    ziCuEx=new ArrayList<>();
                else
                    ziCuEx=orar.getOrar().get(zi);


                    ziCuEx.add(materia); //am adaugat examenul
                    orar.adaugaZiSiExamene(zi, ziCuEx);
                    catalog.getStudentList().get(i).setOrar(orar);

                }

                System.out.println(catalog.getStudentList());



             examenAdaugat.inchidePaginaExamenView();
             meniuProfesor.deschidMeniuProfesorView();
             meniuProfesor.showMessage("S-a adaugat exemen la: " + materia + " are loc: " + zi);

        }

}


    public Catalog valoriNoi() {
        return this.catalog;

    }
}