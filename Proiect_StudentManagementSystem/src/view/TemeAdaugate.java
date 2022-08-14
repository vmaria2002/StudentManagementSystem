package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TemeAdaugate extends JFrame {
    private JTextField titluTextField;
    private JTextField deadlinetextField;
    private JComboBox materiacomboBox;
    private JButton adaugaButton;

public TemeAdaugate(){

    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
    this.getContentPane().setBackground(Color.WHITE);
    this.getContentPane().setLayout(null);

    this.setBounds(400, 77, 1051, 476);

    titluTextField = new JTextField();
    titluTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
    titluTextField.setText("Teme");
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

    JLabel deadLineLabel = new JLabel("Deadline");
    deadLineLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
    deadLineLabel.setBounds(40, 169, 105, 30);
    this.getContentPane().add(deadLineLabel);

    materiacomboBox = new JComboBox();
    materiacomboBox.setModel(new DefaultComboBoxModel(new String[] {"AF", "CAN", "POO", "MES", "MSI", "BD"}));
    materiacomboBox.setBounds(126, 104, 145, 21);
    this.getContentPane().add(materiacomboBox);

    deadlinetextField = new JTextField();
    deadlinetextField.setBounds(142, 178, 129, 19);
    this.getContentPane().add(deadlinetextField);
    deadlinetextField.setColumns(10);

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
        deadlinetextField.setText(null);

    }
    public void addtemaButtonListenner( ActionListener action){
        adaugaButton.addActionListener(action);
    }

    public String getDeadlinetextField() {
        return deadlinetextField.getText();
    }

    public void setDeadlinetextField(String deadlinetextField) {
        this.deadlinetextField.setText(deadlinetextField);
    }

    public String getMateriacomboBox() {
        return (String) materiacomboBox.getSelectedItem();
    }

    public void setMateriacomboBox(String materiacomboBox) {
        this.materiacomboBox.setSelectedItem(materiacomboBox);
    }

}
