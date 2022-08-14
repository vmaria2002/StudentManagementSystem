package controller;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class ProfesorMeniuController {

private MeniuProfesor meniuProfesor;
private ExamenAdaugat examenAdaugat;
private NoteAdugate noteAdugate;
private PrezentaAdaugare prezentaAdaugare;
private TemeAdaugate temeAdaugate;
private  PaginaStartView paginaStartView;

public ProfesorMeniuController(MeniuProfesor meniuProfesor, ExamenAdaugat examenAdaugat, NoteAdugate noteAdugate, PrezentaAdaugare prezentaAdaugare, TemeAdaugate temeAdaugate, PaginaStartView paginaStartView)
{
    this.examenAdaugat=examenAdaugat;
    this.meniuProfesor =meniuProfesor;
    this.noteAdugate =noteAdugate;
    this.temeAdaugate=temeAdaugate;
    this.prezentaAdaugare= prezentaAdaugare;
    this.paginaStartView=paginaStartView;


    this.meniuProfesor.addAdaugareTemeListenner(new CreateListennerTeme());
    this.meniuProfesor.addExamenListenner(new CreateListennerExamen());

    this.meniuProfesor.addNotaListenner(new CreateListennerNota());
    this.meniuProfesor.addPrezentaListenner(new CreateListennerPrezenta());
   this.meniuProfesor.addBackListenner( new CreateListennerBeack());
}



    class CreateListennerTeme implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            meniuProfesor.inchidMeniuProfesorView();
            temeAdaugate.deschidePaginaTemeView();

        }

    }

    class CreateListennerExamen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            meniuProfesor.inchidMeniuProfesorView();
            examenAdaugat.deschidePaginaExamenView();

        }

    }
    class CreateListennerBeack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            meniuProfesor.inchidMeniuProfesorView();
            paginaStartView.deschidePaginaStartView();

        }

    }



    class CreateListennerNota implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            meniuProfesor.inchidMeniuProfesorView();
            noteAdugate.deschidePaginaTemeView();
        }

    }

    class CreateListennerPrezenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            meniuProfesor.inchidMeniuProfesorView();
            prezentaAdaugare.deschidePaginaPrezentaView();
        }

    }



}
