package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NoteAdugate extends JFrame {
    private JTextField titluTextField;
    private JTextField numeStudentTextField;
    private JComboBox materiaComboBox;
    private JComboBox notaComboBox;
    private JButton adaugaButton;

    public NoteAdugate(){

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        titluTextField = new JTextField();
        titluTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        titluTextField.setText("Nota");
        titluTextField.setBounds(314, 11, 73, 30);
        this.getContentPane().add(titluTextField);
        titluTextField.setColumns(10);

        adaugaButton = new JButton("Adauga");
        adaugaButton.setBackground(Color.YELLOW);
        adaugaButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adaugaButton.setBounds(246, 379, 267, 49);
        this.getContentPane().add(adaugaButton);

        JLabel materiaLabel = new JLabel("Materia");
        materiaLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        materiaLabel.setBounds(40, 96, 105, 30);
        this.getContentPane().add(materiaLabel);

        JLabel deadLineLabel = new JLabel("Nume");
        deadLineLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        deadLineLabel.setBounds(40, 169, 105, 30);
        this.getContentPane().add(deadLineLabel);

        materiaComboBox = new JComboBox();
        materiaComboBox.setModel(new DefaultComboBoxModel(new String[] {"AF", "CAN", "POO", "MES", "MSI", "BD"}));
        materiaComboBox.setBounds(126, 104, 145, 21);
        this.getContentPane().add(materiaComboBox);

        numeStudentTextField = new JTextField();
        numeStudentTextField.setBounds(142, 178, 129, 19);
        this.getContentPane().add(numeStudentTextField);
        numeStudentTextField.setColumns(10);

        JLabel lblNota = new JLabel("Nota");
        lblNota.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNota.setBounds(40, 229, 105, 30);
        this.getContentPane().add(lblNota);

        notaComboBox = new JComboBox();
        notaComboBox.setModel(new DefaultComboBoxModel(new String[] {"4", "5", "6", "7", "8", "9", "10"}));
        notaComboBox.setBounds(149, 237, 110, 21);
        this.getContentPane().add(notaComboBox);

    }
    public void deschidePaginaTemeView(){
        this.setVisible(true);
    }

    public void inchidePaginaTemeView(){
        this.setVisible(false);
    }

    public  void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
        refresh();

    }
    public void refresh(){
        numeStudentTextField.setText(null);

    }
    public void addtemaButtonListenner( ActionListener action){
        adaugaButton.addActionListener(action);
    }

    public String getnumetextField() {
        return numeStudentTextField.getText();
    }

    public void setnumetextField(String numeStudentTextField) {
        this.numeStudentTextField.setText(numeStudentTextField);
    }

    public String getMateriacomboBox() {

        return (String) materiaComboBox.getSelectedItem();
    }

    public void setMateriacomboBox(String materiacomboBox) {
        this.materiaComboBox.setSelectedItem(materiacomboBox);
    }
    public int getNotacomboBox() {
        return Integer.parseInt((String) notaComboBox.getSelectedItem());
    }



}



