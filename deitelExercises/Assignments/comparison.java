package Assignments;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer ");
        int number1 = input.nextInt();

        System.out.println("Enter the second integer ");
        int number2 = input.nextInt();

        if(number1 == number2){
            System.out.println("First number = Second number");
        }

        else if(number1 > number2){
            System.out.println("First number is greater than Second number");
        }

        else if(number1 < number2){
            System.out.println("First number is lesser than Second number");
        }

        else if(number1 != number2){
            System.out.println("First number is not equal to Second number");
        }


    }
}
