package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PrezentaAdaugare extends  JFrame {


    private JTextField prezentaTitluField;
    private JTextField numeStudentTextField;
    private JComboBox materiacomboBox;

    private  JButton adaugaButton;

   private  JRadioButton prezentRadioButton;

    public PrezentaAdaugare(){

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);


        numeStudentTextField= new JTextField();
        numeStudentTextField.setBounds(142, 178, 167, 19);
        this.getContentPane().add(numeStudentTextField);
        numeStudentTextField.setColumns(10);

        prezentaTitluField = new JTextField();
        prezentaTitluField.setText("Prezenta");
        prezentaTitluField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        prezentaTitluField.setBounds(314, 11, 73, 30);
        this.getContentPane().add(prezentaTitluField);
        prezentaTitluField.setColumns(10);

        adaugaButton = new JButton("Adauga");
        adaugaButton.setBackground(Color.YELLOW);
        adaugaButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        adaugaButton.setBounds(246, 379, 267, 49);
        this.getContentPane().add(adaugaButton);

        JLabel materiaLabel = new JLabel("Materia");
        materiaLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        materiaLabel.setBounds(40, 96, 105, 30);
        this.getContentPane().add(materiaLabel);

        JLabel numeStudentLabel = new JLabel("NumeStudent");
        numeStudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        numeStudentLabel.setBounds(25, 169, 105, 30);
        this.getContentPane().add(numeStudentLabel);

        materiacomboBox = new JComboBox();
        materiacomboBox.setModel(new DefaultComboBoxModel(new String[] {"AF", "CAN", "POO", "MES", "MSI", "BD"}));
        materiacomboBox.setBounds(126, 104, 145, 21);
        this.getContentPane().add(materiacomboBox);



        JLabel prezentaLeable = new JLabel("Prezent");
        prezentaLeable.setFont(new Font("Tahoma", Font.PLAIN, 17));
        prezentaLeable.setBounds(40, 229, 105, 30);
        this.getContentPane().add(prezentaLeable);

        prezentRadioButton = new JRadioButton("Prezent ");
        prezentRadioButton.setBounds(144, 237, 145, 21);
        this.getContentPane().add(prezentRadioButton);

    }

    public void deschidePaginaPrezentaView(){
        this.setVisible(true);
    }

    public void inchidePaginaPrezentaView(){
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

    public String getNumeStudentTextField() {
        return numeStudentTextField.getText();
    }

    public void setNumeStudentTextField(String numeStudentTextField) {
        this.numeStudentTextField.setText(numeStudentTextField);
    }

    public String getMateriaComboBox() {
        return (String) materiacomboBox.getSelectedItem();
    }

    public void setMateriaComboBox(String materiaComboBox) {
        this.materiacomboBox.setSelectedItem(materiaComboBox);
    }

    public boolean getPrezentRadioButton() {
        return prezentRadioButton.isSelected();
    }

    public void setPrezentRadioButton(boolean prezentRadioButton) {
        this.prezentRadioButton.setSelected(prezentRadioButton);
    }
}
