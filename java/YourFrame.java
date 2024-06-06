package com.uttamsoft.awt;
import java.awt.Frame;

public class MyFrame extends Frame {
    
    public MyFrame() {
        setVisible(true);
        setSize(500, 500);
        setTitle("Welcome to Amity University");
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
