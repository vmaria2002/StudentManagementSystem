package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentDetalii extends JFrame{
private JButton backButton;
    private JTextField titluTextField;
     private JTextField noteTextArea;
     private JTextField temeTextArea;
     private JTextField orarTextArea;

    public StudentDetalii() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);
        this.setBounds(400, 77, 1051, 476);

        titluTextField = new JTextField();
        titluTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        titluTextField.setText("Student-detalii");
        titluTextField.setBounds(269, 32, 159, 30);
        this.getContentPane().add(titluTextField);
        titluTextField.setColumns(10);

        JLabel noteLabel = new JLabel("Examen+Nota");
        noteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        noteLabel.setBounds(21, 221, 144, 13);
        this.getContentPane().add(noteLabel);

        JLabel orarLabel = new JLabel("Orar");
        orarLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        orarLabel.setBounds(46, 306, 73, 13);
        this.getContentPane().add(orarLabel);

        backButton = new JButton("Revenire La Pagina Principala");
        backButton.setBackground(Color.YELLOW);
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        backButton.setBounds(192, 371, 267, 49);
        this.getContentPane().add(backButton);

        JLabel temeLabel = new JLabel("Teme+deadline");
        temeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        temeLabel.setBounds(21, 111, 116, 51);
        this.getContentPane().add(temeLabel);

        noteTextArea = new JTextField();
        noteTextArea.setBounds(143, 100, 564, 62);
        this.getContentPane().add(noteTextArea);

        temeTextArea = new JTextField();
        temeTextArea.setBounds(143, 195, 564, 62);
        this.getContentPane().add(temeTextArea);

         orarTextArea = new JTextField();
        orarTextArea.setBounds(143, 280, 564, 62);
        this.getContentPane().add(orarTextArea);
    }

    public void deschidePaginaProfesorContNouView(){
        this.setVisible(true);
    }

    public void inchideProfesorContNoutView(){
        this.setVisible(false);
    }

    public void addbackButtonListenner( ActionListener action){
        backButton.addActionListener(action);
    }

    public  void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
        refresh();

    }
    public void refresh(){
        temeTextArea.setText(null);
        orarTextArea.setText(null);
        noteTextArea.setText(null);

    }

    public String getNoteTextArea() {
        return noteTextArea.getText();
    }

    public void setNoteTextArea(String noteTextArea) {
        this.noteTextArea.setText(noteTextArea);
    }

    public String getTemeTextArea() {
        return temeTextArea.getText();
    }

    public void setTemeTextArea(String temeTextArea) {
        this.temeTextArea.setText(temeTextArea);
    }

    public String getOrarTextArea() {
        return orarTextArea.getText();
    }

    public void setOrarTextArea(String orarTextArea) {
        this.orarTextArea.setText(orarTextArea);
    }
}



