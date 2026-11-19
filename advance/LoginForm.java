import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnClear;

    public LoginForm() {
        super("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 180);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(new JLabel("Username:"));
        txtUsername = new JTextField();
        add(txtUsername);

        add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnClear = new JButton("Clear");
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);

        add(btnLogin);
        add(btnClear);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String user = txtUsername.getText().trim();
            String pass = new String(txtPassword.getPassword());

            if (user.equals("admin") && pass.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Login Successful! Welcome, " + user + ".");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnClear) {
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
