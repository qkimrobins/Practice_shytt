import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    JTextField textField;
    double num1, num2, result;
    char operator;

    public Calculator() {
        // Frame settings
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If number pressed
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            textField.setText(textField.getText() + command);
        }
        // Clear
        else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
        }
        // Equals
        else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
        }
        // Operator
        else {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
