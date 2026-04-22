import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener {

    JTextField textField;
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 40, 220, 30);
        add(textField);

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        int x = 30, y = 100;

        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            btn.setBounds(x, y, 50, 40);
            btn.addActionListener(this);
            add(btn);

            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Numbers
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
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            textField.setText("" + result);
        }

        // Operators
        else {
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}