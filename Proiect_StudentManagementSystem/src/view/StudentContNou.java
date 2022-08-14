package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentContNou extends JFrame {
    private JTextField studentLogareTextField;
    private JTextField userNameField;
    private JPasswordField passwordField;


   private JButton createAccountButton;

public StudentContNou(){

    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //se inchide doar fereastra
    this.getContentPane().setBackground(Color.WHITE);
    this.getContentPane().setLayout(null);

    this.setBounds(400, 77, 1051, 476);

    studentLogareTextField = new JTextField();
    studentLogareTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
    studentLogareTextField.setText("Student-Cont Nou");
    studentLogareTextField.setBounds(269, 32, 159, 30);
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

    /*JLabel numeLabel = new JLabel("Name");
    numeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    numeLabel.setBounds(64, 166, 73, 13);
    this.getContentPane().add(numeLabel);

    numeField = new JTextField();
    numeField.setColumns(10);
    numeField.setBounds(135, 165, 116, 19);
    this.getContentPane().add(numeField);
*/
}
    public void deschidePaginaStudentContNouView(){
        this.setVisible(true);
    }

    public void inchideStudentContNoutView(){
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
