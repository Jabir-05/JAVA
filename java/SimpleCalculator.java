import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    TextField display;
    double num1, num2, result;
    char operator;

    public SimpleCalculator() {
        super("Simple Calculator");

        // Create display field
        display = new TextField(20);
        display.setEditable(false);

        // Create buttons for numbers and operators
        Button button[] = new Button[16];
        String labels[] = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "C"};
        for (int i = 0; i < 16; i++) {
            button[i] = new Button(labels[i]);
            button[i].addActionListener(this);
        }

        // Create layout and add components
        GridLayout grid = new GridLayout(4, 4);
        setLayout(grid);
        add(display);
        for (Button b : button) {
            add(b);
        }

        // Set window size and visibility
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String data = ae.getActionCommand();

        if (Character.isDigit(data.charAt(0))) {
            // Append number to display
            display.setText(display.getText() + data);
        } else {
            if (data.equals("=")) {
                // Perform calculation
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                display.setText(String.valueOf(result));
            } else {
                // Store operator and first number
                operator = data.charAt(0);
                num1 = Double.parseDouble(display.getText());
                display.setText("");
            }
        }
    }

    public static void main(String args[]) {
        new SimpleCalculator();
    }
}
