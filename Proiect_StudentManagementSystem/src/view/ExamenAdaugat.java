package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExamenAdaugat extends JFrame {
    private JTextField ziTextField;
    private JTextField examenTitluField;
    private JComboBox materiacomboBox;

    private JButton adaugaButton;

    public ExamenAdaugat() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        examenTitluField = new JTextField();
        examenTitluField.setText("Examen");
        examenTitluField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        examenTitluField.setBounds(326, 10, 73, 30);
        this.getContentPane().add(examenTitluField);
        examenTitluField.setColumns(10);

        adaugaButton = new JButton("Adauga");
        adaugaButton.setBackground(Color.YELLOW);
        adaugaButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adaugaButton.setBounds(246, 379, 267, 49);
        this.getContentPane().add(adaugaButton);

        JLabel materiaLabel = new JLabel("Materia");
        materiaLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        materiaLabel.setBounds(40, 96, 105, 30);
        this.getContentPane().add(materiaLabel);

        JLabel zi = new JLabel("zi");
        zi.setFont(new Font("Tahoma", Font.PLAIN, 17));
        zi.setBounds(40, 169, 105, 30);
        this.getContentPane().add(zi);

        materiacomboBox = new JComboBox();
        materiacomboBox.setModel(new DefaultComboBoxModel(new String[]{"AF", "CAN", "POO", "MES", "MSI", "BD"}));
        materiacomboBox.setBounds(126, 104, 145, 21);
        this.getContentPane().add(materiacomboBox);

        ziTextField = new JTextField();
        ziTextField.setBounds(142, 178, 167, 19);
        this.getContentPane().add(ziTextField);
        ziTextField.setColumns(10);
    }

    public void deschidePaginaExamenView() {
        this.setVisible(true);
    }

    public void inchidePaginaExamenView() {
        this.setVisible(false);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
        refresh();

    }

    public void refresh() {
        ziTextField.setText(null);

    }

    public void addtemaButtonListenner(ActionListener action) {
        adaugaButton.addActionListener(action);
    }

    public int getZiTextField() {
        return Integer.parseInt(ziTextField.getText());
    }

    public void setZiTextField(int ziTextField) {
        this.ziTextField.setText(String.valueOf(ziTextField));
    }

    public String getMateriacomboBox() {
        return (String) materiacomboBox.getSelectedItem();
    }

    public void setMateriacomboBox(String materiacomboBox) {

        this.materiacomboBox.getSelectedItem();
    }
}
