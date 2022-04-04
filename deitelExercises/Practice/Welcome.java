package Practice;

public class Welcome {
    public static void main(String[] args) {
        int number1 = 7;
        double number2 = 1.2;
              // System.out.print("Welcome\nto\nJava\nProgramming!");
        System.out.printf("I am a fine boy with 7 babe and 1.2 kobo%n");
        //System.out.println("I am a fine boy with 7 babe and 1.2 kobo");I am a fine boy with 7 babe and 1.2 kobo
        System.out.printf("%s%d%s%.1f%s%n","I am a fine boy with ",number1," babe and ",number2," kobo");
        System.out.printf("I am a fine boy with %d babe and %.1f kobo",number1,number2);
    }
}
