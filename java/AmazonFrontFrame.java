import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmazonFrontFrame extends Frame {
    // Components
    Button loginButton, signUpButton;
    Label titleLabel, descriptionLabel;

    public AmazonFrontFrame() {
        // Frame settings
        setTitle("Amazon");
        setSize(500, 300);
        setLayout(new GridLayout(4, 1));
        setVisible(true);

        // Title
        titleLabel = new Label("Welcome to Amazon");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);

        // Description
        descriptionLabel = new Label("Welcome Jabir Imteyaz");
        add(descriptionLabel);

        // Buttons
        loginButton = new Button("Login");
        signUpButton = new Button("Sign Up");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement login functionality
                System.out.println("Login button clicked");
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement sign-up functionality
                System.out.println("Sign Up button clicked");
            }
        });

        Panel buttonPanel = new Panel(new GridLayout(1, 2));
        buttonPanel.add(loginButton);
        buttonPanel.add(signUpButton);

        add(buttonPanel);

        // Closing the Frame
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AmazonFrontFrame();
    }
}
