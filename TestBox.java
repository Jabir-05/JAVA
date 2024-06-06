// Define the package Mypackage
package Mypackage;

// Define the Box class
public class Box {
    private double length;
    private double breadth;
    private double depth;

    // Constructors
    public Box(double length, double breadth, double depth) {
        this.length = length;
        this.breadth = breadth;
        this.depth = depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * breadth * depth;
    }

    // Method to display all information of the Box
    public void displayBoxInfo() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + calculateVolume());
    }
}
 {
    
}
// Import the Box class from the Mypackage package
import Mypackage.Box;

// Define the TestBox class
public class TestBox {
    public static void main(String[] args) {
        // Create two Box objects by taking necessary information externally
        Box box1 = new Box(5.0, 3.0, 2.0);
        Box box2 = new Box(4.0, 6.0, 3.0);

        // Display information of Box objects
        System.out.println("Box 1 information:");
        box1.displayBoxInfo();
        System.out.println("\nBox 2 information:");
        box2.displayBoxInfo();
    }
}

