import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader object to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt the user to input their name
        System.out.print("Enter your name: ");
        
        try {
            // Read the user's input
            String name = reader.readLine();
            
            // Display the output
            System.out.println("Hello, " + name + "! Welcome to the program.");
            
            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            e.printStackTrace();
        }
    }
}