package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ProfesorContNou extends JFrame {
    private JTextField profesorLogareTextField;
    private JTextField userNameField;
    private JPasswordField passwordField;


    private JButton createAccountButton;

    public ProfesorContNou(){

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        profesorLogareTextField = new JTextField();
        profesorLogareTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        profesorLogareTextField.setText("Profesor-Cont Nou");
        profesorLogareTextField.setBounds(269, 32, 159, 30);
        this.getContentPane().add(profesorLogareTextField);
        profesorLogareTextField.setColumns(10);

        JLabel userLabel = new JLabel("UserName");
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        userLabel.setBounds(64, 248, 73, 13);
        this.getContentPane().add(userLabel);

        userNameField = new JTextField();
        userNameField.setBounds(155, 247, 96, 19);
        this.getContentPane().add(userNameField);
        userNameField.setColumns(10);

        JLabel passwoedLabel = new JLabel("PassWord");
        passwoedLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwoedLabel.setBounds(64, 299, 73, 13);
        this.getContentPane().add(passwoedLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(155, 298, 96, 19);
        this.getContentPane().add(passwordField);

        createAccountButton = new JButton("Cont nou");
        createAccountButton.setBackground(Color.YELLOW);
        createAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        createAccountButton.setBounds(135, 359, 152, 49);
        this.getContentPane().add(createAccountButton);



    }
    public void deschidePaginaProfesorContNouView(){
        this.setVisible(true);
    }

    public void inchideProfesorContNoutView(){
        this.setVisible(false);
    }

    public void addcrateAccountButtonListenner( ActionListener action){
        createAccountButton.addActionListener(action);
    }

    public  void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
        refresh();

    }
    public void refresh(){
        userNameField.setText(null);
        passwordField.setText(null);


    }

    public String getUserNameField() {
        return userNameField.getText();
    }

    public void setUserNameField(String userNameField) {
        this.userNameField.setText(userNameField);
    }

    public String getPasswordField() {
        return new String(passwordField.getPassword());
    }

    public void setPasswordField(String passwordField) {
        this.passwordField.setText(passwordField);
    }


}
