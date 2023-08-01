import javax.swing.*;

public class SimpleCalculator extends JFrame {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton clearButton;

    public SimpleCalculator() {
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(10, 10, 100, 20);
        add(firstNumberField);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(10, 40, 100, 20);
        add(secondNumberField);

        resultField = new JTextField();
        resultField.setBounds(10, 70, 100, 20);
        resultField.setEditable(false);
        add(resultField);

        addButton = new JButton("+");
        addButton.setBounds(120, 10, 50, 20);
        addButton.addActionListener(e -> {
            try {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                resultField.setText(Double.toString(firstNumber + secondNumber));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Invalid number format!");
            }
        });
        add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setBounds(120, 40, 50, 20);
        subtractButton.addActionListener(e -> {
            try {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                resultField.setText(Double.toString(firstNumber - secondNumber));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Invalid number format!");
            }
        });
        add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(120, 70, 50, 20);
        multiplyButton.addActionListener(e -> {
            try {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                resultField.setText(Double.toString(firstNumber * secondNumber));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Invalid number format!");
            }
        });
        add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setBounds(180, 10, 50, 20);
        divideButton.addActionListener(e -> {
            try {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                resultField.setText(Double.toString(firstNumber / secondNumber));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Invalid number format!");
            }
        });
        add(divideButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(180, 40, 50, 20);
        clearButton.addActionListener(e -> {
            firstNumberField.setText("");
            secondNumberField.setText("");
            resultField.setText("");
        });
        add(clearButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}