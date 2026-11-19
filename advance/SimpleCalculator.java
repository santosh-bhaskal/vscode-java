import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField txtNum1, txtNum2;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide;
    private JLabel lblResult;

    public SimpleCalculator() {
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 280);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel main = new JPanel(new GridLayout(2, 2, 10, 10));
        main.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));

        main.add(new JLabel("First Number:"));
        txtNum1 = new JTextField();
        main.add(txtNum1);

        main.add(new JLabel("Second Number:"));
        txtNum2 = new JTextField();
        main.add(txtNum2);

        add(main, BorderLayout.CENTER);

        btnAdd      = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide   = new JButton("/");

        Font opFont = new Font("Arial", Font.BOLD, 20);
        btnAdd.setFont(opFont);
        btnSubtract.setFont(opFont);
        btnMultiply.setFont(opFont);
        btnDivide.setFont(opFont);

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);

        JPanel btnPanel = new JPanel(new GridLayout(1, 4, 8, 0));
        btnPanel.add(btnAdd);
        btnPanel.add(btnSubtract);
        btnPanel.add(btnMultiply);
        btnPanel.add(btnDivide);

        lblResult = new JLabel("0");
        lblResult.setFont(new Font("Arial", Font.BOLD, 16));
        lblResult.setForeground(new Color(0, 102, 204));

        JPanel resultRow = new JPanel(new GridLayout(1, 2, 10, 0));
        resultRow.add(new JLabel("Calculated Result:"));
        resultRow.add(lblResult);

        JPanel south = new JPanel(new GridLayout(2, 1, 0, 8));
        south.setBorder(BorderFactory.createEmptyBorder(5, 15, 15, 15));
        south.add(btnPanel);
        south.add(resultRow);

        add(south, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = txtNum1.getText().trim();
        String s2 = txtNum2.getText().trim();

        if (s1.isEmpty() || s2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both numbers!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double n1 = Double.parseDouble(s1);
            double n2 = Double.parseDouble(s2);
            double result = 0;

            if (e.getSource() == btnAdd) {
                result = n1 + n2;
            } else if (e.getSource() == btnSubtract) {
                result = n1 - n2;
            } else if (e.getSource() == btnMultiply) {
                result = n1 * n2;
            } else if (e.getSource() == btnDivide) {
                // Event Handling requirement: Display appropriate message on division by zero
                if (n2 == 0) {
                    lblResult.setText("Error: Division by zero");
                    lblResult.setForeground(Color.RED);
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero! Please enter a non-zero denominator.", "Division by Zero Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                result = n1 / n2;
            }

            lblResult.setForeground(new Color(0, 102, 204));
            if (result == (long) result) {
                lblResult.setText(String.format("%d", (long) result));
            } else {
                lblResult.setText(String.format("%.4f", result));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
