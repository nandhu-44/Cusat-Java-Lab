import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JLabel num1Label, num2Label, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JButton calculateButton;

    private JRadioButton addButton, subButton, mulButton, divButton;
    private ButtonGroup buttonGroup;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(525, 500);
        setResizable(false);
        setLayout(null);

        num1Label = new JLabel("Number 1");
        num2Label = new JLabel("Number 2");
        resultLabel = new JLabel("Result");

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();

        num1Label.setBounds(100, 75, 100, 25);
        num1Field.setBounds(100, 100, 100, 25);
        num1Field.setBorder(BorderFactory.createEmptyBorder());

        num2Label.setBounds(300, 75, 100, 25);
        num2Field.setBounds(300, 100, 100, 25);
        num2Field.setBorder(BorderFactory.createEmptyBorder());

        resultLabel.setBounds(150, 275, 100, 25);
        resultField.setBounds(150, 300, 200, 25);
        resultField.setFocusable(false);
        resultField.setBorder(BorderFactory.createEmptyBorder());

        calculateButton = new JButton("Calculate");

        calculateButton.setBounds(200, 350, 100, 40);

        addButton = new JRadioButton("+");
        subButton = new JRadioButton("-");
        mulButton = new JRadioButton("*");
        divButton = new JRadioButton("/");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(addButton);
        buttonGroup.add(subButton);
        buttonGroup.add(mulButton);
        buttonGroup.add(divButton);

        addButton.setBounds(170, 200, 50, 50);
        subButton.setBounds(220, 200, 50, 50);
        mulButton.setBounds(270, 200, 50, 50);
        divButton.setBounds(320, 200, 50, 50);

        calculateButton.addActionListener(this);

        this.add(num1Label);
        this.add(num2Label);
        this.add(resultLabel);
        this.add(num1Field);
        this.add(num2Field);
        this.add(resultField);
        this.add(calculateButton);
        this.add(addButton);
        this.add(subButton);
        this.add(mulButton);
        this.add(divButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (num1Field.getText().isEmpty() || num2Field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!addButton.isSelected() && !subButton.isSelected() && !mulButton.isSelected() && !divButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Select an operation", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;
        if (addButton.isSelected()) {
            result = num1 + num2;
        } else if (subButton.isSelected()) {
            result = num1 - num2;
        } else if (mulButton.isSelected()) {
            result = num1 * num2;
        } else if (divButton.isSelected()) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 / num2;
        }
        int resultAsInt = (int) result;
        if (result == resultAsInt) {
            resultField.setText(String.valueOf(resultAsInt));
            return;
        }
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
