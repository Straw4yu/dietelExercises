package Assignments;

import java.util.Random;

public class PasswordGeneration{
    public static void main(String[] args) {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";

        String add = upper+lower+number;
        int len=12;
        char[] passwords = new char[12];
        Random rand = new Random();

        for(int i = 0; i < len; i++){
            passwords[i] = add.charAt(rand.nextInt(add.length()));
        }
        System.out.println("Generated password is:" + new String(passwords));
    }
}
