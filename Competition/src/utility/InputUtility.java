package utility;

import java.util.Scanner;

public class InputUtility {

    public static String askString(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();
    }

    public static Integer askInt(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }
}
