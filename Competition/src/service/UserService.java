package service;

import bean.User;
import utility.InputUtility;

import java.util.Random;
import java.util.Scanner;

public class UserService {
    public static User[] users;

    private static User prepareStudent(){
        User user = new User();

        user.setName(InputUtility.askString("Enter user's name"));
        user.setSurename(InputUtility.askString("Enter user's surename"));
        user.setAge(InputUtility.askInt("Enter user's age"));
        return user;

    }

        public static void process(){
            while(true){
                int userMenu= InputUtility.askInt("Select the operation you want to perform: \n" +
                        "1. Registration \n" +
                        "2. Start \n" +
                        "3.Logout \n" +
                        "4.Exit \n");
                if(userMenu==1){
                    register();
                }
                else if(userMenu==2){
                    start();
                }
                else if(userMenu==3){
                    logout();
                }
                else if(userMenu==4){
                    exit();
                }
                else{
                    System.out.println("The operation was not selected correctly");
                }
            }

        }

    private static void register() {
        int registrationCount = InputUtility.askInt("How many userd will you enroll?");
        users = new User[registrationCount];
        for(int i=0; i<registrationCount; i++){
            users[i]=prepareStudent();
            users[i].setNumber(i);
        }
    }

    private static void start() {
        Random rnd = new Random();
        System.out.println("How many competitors will there be?");
        int reqem = rnd.nextInt(new Scanner(System.in).nextInt());
        System.out.println("Choose a number between 0 and " + reqem);
        int eded = new Scanner(System.in).nextInt();
        if(reqem == eded){
            System.out.println("Congratulations you won!");
        }
        else{
            System.out.println("You failed");
        }

    }

    private static void logout() {
        LoginService.login();

    }

    private static void exit() {
        System.exit(0);
    }
}
