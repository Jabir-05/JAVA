import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;

    public LoginFrame() {
        // Set layout to FlowLayout
        setLayout(new FlowLayout());

        // Create components
        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");
        usernameField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Set echo character for password field
        loginButton = new Button("Login");

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(this);

        // Set frame properties
        setTitle("Login Page");
        setSize(300, 150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check login credentials
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("your_username") && password.equals("your_password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
