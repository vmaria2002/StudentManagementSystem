package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PaginaStartView extends JFrame{
    private JButton studentButton;
    private JButton profesorButton;


    public PaginaStartView(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        JTextField titluField = new JTextField();
        titluField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        titluField.setBackground(Color.WHITE);
        titluField.setText("Student Management System");
        titluField.setBounds(357, 10, 284, 65);
        this.getContentPane().add(titluField);
        titluField.setColumns(10);

        JLabel statutLabel = new JLabel("Alegeti tipul de utilizator:");
        statutLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        statutLabel.setBounds(414, 138, 344, 21);
        this.getContentPane().add(statutLabel);

        studentButton = new JButton("Student");
        studentButton.setBackground(Color.CYAN);
        studentButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        studentButton.setBounds(240, 222, 202, 53);
        this.getContentPane().add(studentButton);

        profesorButton = new JButton("Profesor");
        profesorButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
        profesorButton.setBackground(Color.CYAN);
        profesorButton.setBounds(642, 211, 202, 53);
        this.getContentPane().add(profesorButton);

    }
    public void addStudentButtonListenner( ActionListener action){
        studentButton.addActionListener(action);
    }

    public void addProfesorButtonListenner( ActionListener action){
        profesorButton.addActionListener(action);
    }

    public void deschidePaginaStartView(){
        this.setVisible(true);
    }

    public void inchidedePaginaStartView(){
        this.setVisible(false);
    }

    public  void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);

    }

//nu sunt necesai gett-eri si sett-eri, nu avem capuri cu date preluate de la utilizator

}
