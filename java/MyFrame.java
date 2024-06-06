import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("My First Frame");

        // Create a label
        JLabel label = new JLabel("Hello, this is my frame!");

        // Add the label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame visibility
        frame.setVisible(true);
    }
}
