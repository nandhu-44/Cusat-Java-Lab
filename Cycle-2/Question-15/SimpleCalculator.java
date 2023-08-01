import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JLabel num1Label, num2Label, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JButton calculateButton;

    private JRadioButton addButton, subButton, mulButton, divButton, modButton, floorDivButton;
    private ButtonGroup buttonGroup;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(275, 350);
        setResizable(false);
        setLayout(null);

        num1Label = new JLabel("Number 1");
        num2Label = new JLabel("Number 2");
        resultLabel = new JLabel("Result");

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();

        num1Label.setBounds(25, 25, 75, 25);
        num1Field.setBounds(25, 50, 75, 25);
        num1Field.setBorder(BorderFactory.createEmptyBorder());

        num2Label.setBounds(150, 25, 75, 25);
        num2Field.setBounds(150, 50, 75, 25);
        num2Field.setBorder(BorderFactory.createEmptyBorder());

        resultLabel.setBounds(50, 185, 75, 25);
        resultField.setBounds(50, 210, 150, 25);
        resultField.setFocusable(false);
        resultField.setBorder(BorderFactory.createEmptyBorder());

        calculateButton = new JButton("Calculate");

        calculateButton.setBounds(75, 250, 100, 40);

        addButton = new JRadioButton("+");
        subButton = new JRadioButton("-");
        mulButton = new JRadioButton("*");
        divButton = new JRadioButton("/");
        modButton = new JRadioButton("%");
        floorDivButton = new JRadioButton("//");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(addButton);
        buttonGroup.add(subButton);
        buttonGroup.add(mulButton);
        buttonGroup.add(divButton);
        buttonGroup.add(modButton);
        buttonGroup.add(floorDivButton);

        addButton.setBounds(65, 85, 50, 50);
        subButton.setBounds(115, 85, 50, 50);
        modButton.setBounds(165, 85, 50, 50);
        mulButton.setBounds(65, 135, 50, 50);
        divButton.setBounds(115, 135, 50, 50);
        floorDivButton.setBounds(165, 135, 50, 50);

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
        this.add(modButton);
        this.add(floorDivButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (num1Field.getText().isEmpty() || num2Field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!addButton.isSelected() && !subButton.isSelected() && !mulButton.isSelected() && !divButton.isSelected() && !modButton.isSelected() && !floorDivButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Select an operation", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double num1 = 0, num2 = 0, result = 0;
        try {
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
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
        } else if (modButton.isSelected()) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 % num2;
        } else if (floorDivButton.isSelected()) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 / num2;
            result = Math.floor(result);
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
