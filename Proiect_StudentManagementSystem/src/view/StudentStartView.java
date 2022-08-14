package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentStartView extends JFrame {

    private JTextField studentLogareTextField;
    private JTextField userNameField;
    private JPasswordField passwordField;

     private  JButton logIniButton;
     private JButton createAccountButton;

    public StudentStartView() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        this.setBounds(400, 77, 1051, 476);

        studentLogareTextField = new JTextField();
        studentLogareTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        studentLogareTextField.setText("Student-Log in");
        studentLogareTextField.setBounds(269, 32, 117, 30);
        this.getContentPane().add(studentLogareTextField);
        studentLogareTextField.setColumns(10);

        JLabel userLabel = new JLabel("UserName");
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        userLabel.setBounds(64, 248, 73, 13);
        this.getContentPane().add(userLabel);

        userNameField = new JTextField();
        userNameField.setBounds(155, 247, 96, 19);
        this.getContentPane().add(userNameField);
        userNameField.setColumns(10);

        logIniButton = new JButton("Log in");
        logIniButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        logIniButton.setBounds(110, 375, 152, 36);
        this.getContentPane().add(logIniButton);

        JLabel passwoedLabel = new JLabel("PassWord");
        passwoedLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwoedLabel.setBounds(64, 299, 73, 13);
        this.getContentPane().add(passwoedLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(155, 298, 81, 19);
        this.getContentPane().add(passwordField);

        createAccountButton = new JButton("Cont nou");
        createAccountButton.setBackground(Color.YELLOW);
        createAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        createAccountButton.setBounds(486, 357, 152, 49);
        this.getContentPane().add(createAccountButton);
    }
    public void addLogInButtonListenner( ActionListener action){
        logIniButton.addActionListener(action);
    }

    public void addcrateAccountButtonListenner( ActionListener action){
        createAccountButton.addActionListener(action);
    }

    public void deschidePaginaStudentView(){
        this.setVisible(true);
    }

    public void inchidePaginaStudentView(){
        this.setVisible(false);
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



