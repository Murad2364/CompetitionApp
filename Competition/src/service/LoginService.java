package service;

import java.util.Scanner;

public class LoginService {
    public static void login() {
        int chance = 3;
        while (chance > 0) {
            System.out.println("Enter username");
            String username = new Scanner(System.in).nextLine();

            System.out.println("Enter pasword");
            int pasword = new Scanner(System.in).nextInt();

            if (username.equals("Sarkhan") && pasword == 12345) {
                System.out.println("Successfuly login");
                UserService.process();
                break;
            } else {
                System.out.println("You entered the wrong username or password. Please try again");
                chance--;
            }
            if (chance ==0){
                System.out.println("You banned!");
                System.exit(0);
            }
        }
    }
}
