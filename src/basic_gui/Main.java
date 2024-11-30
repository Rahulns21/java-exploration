package basic_gui;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));

        JOptionPane.showMessageDialog(null, "Hello " + name + " you are " + age + " years old");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cms tall");
    }
}
