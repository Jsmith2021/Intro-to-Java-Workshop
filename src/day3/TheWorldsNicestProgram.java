package day3;

import javax.swing.JOptionPane;

public class TheWorldsNicestProgram {
public static void main(String[] args) {
	String name =JOptionPane.showInputDialog("What's your name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, name+", you are a great person");
}
}
