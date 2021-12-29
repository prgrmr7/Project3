/**
 * Starting to explore the features of JOptionPane...
 * In this test I used some features of the method to ask a question and present an answer.
 * @author Emerson de Almeida Rodrigues
 */

import javax.swing.JOptionPane;

public class Project3 {

    public static void main(String[] args) {
   
        String name = JOptionPane.showInputDialog("Hi! What is your name?");
		JOptionPane.showMessageDialog(null, "Wellcome, " + name + "! This is a test of some features of the JOptionPane method. Hope you like.");
   }
}