import java.awt.*;
import java.awt.event.*;  // Import for handling button clicks (optional)

/**
 * A simple graphical user interface (GUI) application that creates a window
 * with a button labeled "username".
 */
public class A extends Frame {

    public A() {
        super("Username");  // Set the window title

        // Create a button with the label "username"
        Button b = new Button("username");

        // Set the button's position and size (consider using layout managers)
        b.setBounds(100, 150, 200, 90);

        // Set the frame's size
        setSize(400, 300);  // Example size (adjust as needed)

        // Use a layout manager (optional, but recommended for better organization)
         LayoutManager layout = new FlowLayout();
        // setLayout(layout);  // Uncomment to use a layout manager

        // Set the frame to be visible
        setVisible(true);

        // Add the button to the frame
        add(b);

        // Optionally, add an action listener to handle button clicks
        // (requires importing java.awt.event)
        /*
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
        */
    }

    public static void main(String[] args) {
        new A();  // Create an instance of the A class
    }
}
