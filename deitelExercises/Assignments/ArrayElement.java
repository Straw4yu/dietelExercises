package Assignments;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        Integer[] number = {11, 29, 34, 14, 75, 6, 27, 88, 29, 50};

//// using Collections.min() to find minimum element
        int min = Collections.min(Arrays.asList(number));

//// using Collections.max() to find maximum element
        int max = Collections.max(Arrays.asList(number));


        // getting array length
        int length = number.length;


        //sum of all values in array using for loop
        double average = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];

                average = sum / number.length;

            }

            // Iterate through all elements and add them to sum


            System.out.println("The minimum number is: " + min);
            System.out.println("The maximum number is: " + max);
            System.out.println("sum of given array is " + sum);
            System.out.println("The average number is:  " + average);


        }
    }













