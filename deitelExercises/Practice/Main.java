package Practice;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showInputDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showInputDialog(null, "You are " + height + " cm tall");
    }


}


     //Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name? ");
//        String name =scanner.nextLine();
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("What is your favorite food? ");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("My favorite food is "+food);



