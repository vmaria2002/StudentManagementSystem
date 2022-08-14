package controller;

import model.Catalog;
import model.Note;
import model.Student;
import view.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class NotaController {
    private NoteAdugate noteAdugate;
    private MeniuProfesor meniuProfesor;
    private Catalog catalog;


    public NotaController(Catalog catalog, NoteAdugate noteAdugate, MeniuProfesor meniuProfesor) {
        this.meniuProfesor=meniuProfesor;
        this.noteAdugate=noteAdugate;
        this.catalog=catalog;

        this.noteAdugate.addtemaButtonListenner(new CreateListennerNote());
    }

    class CreateListennerNote implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String materia = noteAdugate.getMateriacomboBox();
            String nume =noteAdugate.getnumetextField();
            int nota = noteAdugate.getNotacomboBox();
           int gasit=0;
            for(int i=0; i<catalog.getStudentList().size(); i++){
                Student student = catalog.getStudentList().get(i);

                if(student.getNume().equals(nume)){
                    gasit =1;
                    Note note = student.getNotele();
                    note.adaugaMaterieSiNota(materia, nota);
                    student.setNotele(note);
                    catalog.getStudentList().set(i, student);
                    System.out.println(catalog);
                    noteAdugate.showMessage("S-a adaugat nota "+ nota+ "la nateria: "+ materia+ "pentru studentul: "+nume);
                    noteAdugate.inchidePaginaTemeView();
                    meniuProfesor.deschidMeniuProfesorView();
                    break;
                }
            }
            if(gasit==0) {
                noteAdugate.showMessage("nu s-a gasit studentul");
            }



        }

        }
        public Catalog valoriNoi(){
            return  this.catalog;
    }

}
