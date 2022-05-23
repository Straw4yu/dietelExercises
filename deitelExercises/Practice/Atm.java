package Practice;

import java.util.Scanner;

import static java.lang.System.exit;

public class Atm {
    public static void main(String[] args) {
        String prompt = """
        Welcome to ZuBank,
        Press softly
        1   To create account,
        2   To put money,
        3   To remove money,
        4   To sent urgent 2h,
        5   To check balance,
        6   To exit. 
        """;
        
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userResponse = scanner.nextInt();
        switch (userResponse){
            case 1: createAccount();
            break;
            case 2: putMoney();
            break;
            case 3: removeMoney();
            break;
            case 4: sentUrgent2h();
            break;
            case 5: checkBalance();
            break;
            case 6: exit();
            break;
            default:;

        }
    }

    private static void exit() {
    }

    private static void checkBalance() {
    }

    private static void sentUrgent2h() {
    }

    private static void removeMoney() {
    }

    private static void putMoney() {
    }

    private static void createAccount() {
    }
}
