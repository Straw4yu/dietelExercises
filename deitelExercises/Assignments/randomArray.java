package Assignments;

import java.util.Arrays;

public class randomArray {
    public static void main(String[] args) {
        int[] randomThreeHundred = new int[300];
       for (int i =0; i < randomThreeHundred.length; i++){
           randomThreeHundred[i] = i + 1;
       }
        for (int i =0; i < randomThreeHundred.length; i++)
        System.out.print(randomThreeHundred[i] + " ");

    }
}


