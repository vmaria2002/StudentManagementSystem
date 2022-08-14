package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MeniuProfesor extends JFrame {

    private JTextField titluTextField;
    private JButton adaugareNotaButton;
    private JButton temeButton;
    private JButton prezentaButton;
    private JButton adaugareExameneButton;
    private JButton paginaStartButton;


    public MeniuProfesor() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        titluTextField = new JTextField();
        titluTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        titluTextField.setText("Profesor");
        titluTextField.setBounds(314, 11, 73, 30);
        this.getContentPane().add(titluTextField);
        titluTextField.setColumns(10);

        temeButton = new JButton("Teme");
        temeButton.setBackground(Color.YELLOW);
        temeButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        temeButton.setBounds(31, 81, 267, 49);
        this.getContentPane().add(temeButton);

        prezentaButton = new JButton("Prezenta");
        prezentaButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        prezentaButton.setBackground(Color.YELLOW);
        prezentaButton.setBounds(437, 81, 267, 49);
        this.getContentPane().add(prezentaButton);

        adaugareNotaButton = new JButton("Adaugare Nota");
        adaugareNotaButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adaugareNotaButton.setBackground(Color.YELLOW);
        adaugareNotaButton.setBounds(31, 235, 267, 49);
        this.getContentPane().add(adaugareNotaButton);

        adaugareExameneButton = new JButton("Adaugare Examene");
        adaugareExameneButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adaugareExameneButton.setBackground(Color.YELLOW);
        adaugareExameneButton.setBounds(437, 235, 267, 49);
        this.getContentPane().add(adaugareExameneButton);

        paginaStartButton = new JButton("pagina Start");
        paginaStartButton.setBounds(251, 347, 220, 69);
       this.getContentPane().add(paginaStartButton);


    }

    public void deschidMeniuProfesorView(){
        this.setVisible(true);
    }

    public void inchidMeniuProfesorView(){
        this.setVisible(false);
    }

    public void addNotaListenner( ActionListener action){
        adaugareNotaButton.addActionListener(action);
    }
    public void addAdaugareTemeListenner( ActionListener action){
        temeButton.addActionListener(action);
    }
    public void addPrezentaListenner( ActionListener action){
        prezentaButton.addActionListener(action);
    }

    public void addBackListenner( ActionListener action){
        paginaStartButton.addActionListener(action);
    }

    public void addExamenListenner( ActionListener action){
        adaugareExameneButton.addActionListener(action);
    }

    public  void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
