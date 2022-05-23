package Practice;

import javax.swing.JOptionPane;

public class Addition2 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;

        String string1 = JOptionPane.showInputDialog("Enter first number");
        number1 = Integer.parseInt(string1);

        String string2 = JOptionPane.showInputDialog("Enter second number");
        number2 = Integer.parseInt(string2);

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null, sum);
    }
}
