package program.application;

import java.util.Scanner;
import program.entities.User;
import program.entities.UserLogin;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("USER:");
        System.out.println("You have a registered account? (y/n)");
        char resp = sc.next().charAt(0);
        if (resp == 'y') {
            System.out.println("Enter your username:");
            String username = sc.next();
            System.out.println("Enter your password:");
            String password = sc.next();
            System.out.println("Welcome " + username + "!");
        } else {
            System.out.println("Enter your username:");
            String username = sc.next();
            System.out.println("Enter your password:");
            String password = sc.next();
            System.out.println("Enter your email:");
            String email = sc.next();



        }











        sc.close();

    }
}
