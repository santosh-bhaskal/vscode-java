import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricityBillCalculator extends JFrame implements ActionListener {
    private JTextField txtName, txtUnits;
    private JComboBox<String> cbType;
    private JButton btnCalculate, btnReset;
    private JLabel lblResult;

    public ElectricityBillCalculator() {
        super("Electricity Bill Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 260);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        add(new JLabel("Customer Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Units Consumed:"));
        txtUnits = new JTextField();
        add(txtUnits);

        add(new JLabel("Consumer Type:"));
        cbType = new JComboBox<>(new String[]{"Residential", "Commercial"});
        add(cbType);

        btnCalculate = new JButton("Calculate Bill");
        btnReset = new JButton("Reset");
        btnCalculate.addActionListener(this);
        btnReset.addActionListener(this);
        add(btnCalculate);
        add(btnReset);

        add(new JLabel("Total Bill Amount:"));
        lblResult = new JLabel("Rs. 0.00");
        lblResult.setFont(new Font("Arial", Font.BOLD, 14));
        lblResult.setForeground(new Color(0, 128, 0));
        add(lblResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            String name = txtName.getText().trim();
            String unitStr = txtUnits.getText().trim();

            if (name.isEmpty() || unitStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both name and units!");
                return;
            }

            try {
                double units = Double.parseDouble(unitStr);
                String type = (String) cbType.getSelectedItem();
                // Residential rate = Rs 5/unit, Commercial rate = Rs 8/unit
                double rate = "Residential".equals(type) ? 5.0 : 8.0;
                double bill = units * rate;

                lblResult.setText(String.format("Rs. %.2f", bill));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid numeric units!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == btnReset) {
            txtName.setText("");
            txtUnits.setText("");
            cbType.setSelectedIndex(0);
            lblResult.setText("Rs. 0.00");
        }
    }

    public static void main(String[] args) {
        new ElectricityBillCalculator();
    }
}
