import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentResultManagementSystem extends JFrame implements ActionListener {
    private JTextField txtName, txtRoll, txtM1, txtM2, txtM3;
    private JButton btnCalculate, btnReset;
    private JLabel lblTotal, lblPercentage, lblGrade;

    public StudentResultManagementSystem() {
        super("Student Result System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 380);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 2, 8, 8));

        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(new JLabel("Student Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Roll Number:"));
        txtRoll = new JTextField();
        add(txtRoll);

        add(new JLabel("Subject 1 Marks:"));
        txtM1 = new JTextField();
        add(txtM1);

        add(new JLabel("Subject 2 Marks:"));
        txtM2 = new JTextField();
        add(txtM2);

        add(new JLabel("Subject 3 Marks:"));
        txtM3 = new JTextField();
        add(txtM3);

        btnCalculate = new JButton("Calculate");
        btnReset = new JButton("Reset");
        btnCalculate.addActionListener(this);
        btnReset.addActionListener(this);
        add(btnCalculate);
        add(btnReset);

        Font boldFont = new Font("Arial", Font.BOLD, 13);

        add(new JLabel("Total Marks (out of 300):"));
        lblTotal = new JLabel("-");
        lblTotal.setFont(boldFont);
        add(lblTotal);

        add(new JLabel("Percentage:"));
        lblPercentage = new JLabel("-");
        lblPercentage.setFont(boldFont);
        add(lblPercentage);

        add(new JLabel("Grade:"));
        lblGrade = new JLabel("-");
        lblGrade.setFont(boldFont);
        add(lblGrade);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            try {
                double m1 = Double.parseDouble(txtM1.getText().trim());
                double m2 = Double.parseDouble(txtM2.getText().trim());
                double m3 = Double.parseDouble(txtM3.getText().trim());

                double total = m1 + m2 + m3;
                double percentage = total / 3.0;

                String grade;
                if (percentage >= 85) grade = "A+ (Distinction)";
                else if (percentage >= 70) grade = "A (First Class)";
                else if (percentage >= 55) grade = "B (Second Class)";
                else if (percentage >= 40) grade = "Pass";
                else grade = "Fail";

                lblTotal.setText(String.format("%.2f / 300", total));
                lblPercentage.setText(String.format("%.2f %%", percentage));
                lblGrade.setText(grade);
                lblGrade.setForeground(grade.equals("Fail") ? Color.RED : new Color(0, 128, 0));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid marks for all 3 subjects!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == btnReset) {
            txtName.setText("");
            txtRoll.setText("");
            txtM1.setText("");
            txtM2.setText("");
            txtM3.setText("");
            lblTotal.setText("-");
            lblPercentage.setText("-");
            lblGrade.setText("-");
            lblGrade.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new StudentResultManagementSystem();
    }
}
