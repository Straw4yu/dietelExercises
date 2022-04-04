package Practice;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius ");
        int r = input.nextInt();
        System.out.println("area= " + (22/7) * r * r);
        System.out.println("diameter= "+ 2 * r);
        System.out.println("circumference= "+2 * (22/7) * r);
    }
}
