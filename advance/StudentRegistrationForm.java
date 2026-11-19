import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    private JTextField txtName, txtRollNo;
    private JRadioButton rbMale, rbFemale;
    private ButtonGroup genderGroup;
    private JComboBox<String> cbBranch;
    private JButton btnSubmit, btnReset;

    public StudentRegistrationForm() {
        super("Student Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(new JLabel("Student Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Roll Number:"));
        txtRollNo = new JTextField();
        add(txtRollNo);

        add(new JLabel("Gender:"));
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        add(genderPanel);

        add(new JLabel("Branch:"));
        String[] branches = {"Computer Science", "Information Technology", "Electronics", "Mechanical", "Civil"};
        cbBranch = new JComboBox<>(branches);
        add(cbBranch);

        btnSubmit = new JButton("Submit");
        btnReset = new JButton("Reset");
        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);
        add(btnSubmit);
        add(btnReset);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name = txtName.getText().trim();
            String roll = txtRollNo.getText().trim();
            String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Not Selected";
            String branch = (String) cbBranch.getSelectedItem();

            String message = "Student Details:\n"
                    + "Name: " + name + "\n"
                    + "Roll No: " + roll + "\n"
                    + "Gender: " + gender + "\n"
                    + "Branch: " + branch;

            JOptionPane.showMessageDialog(this, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);

        } else if (e.getSource() == btnReset) {
            txtName.setText("");
            txtRollNo.setText("");
            genderGroup.clearSelection();
            cbBranch.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
