package program.application;

import program.entities.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {


    public static void menu() {

        System.out.println("1. Add a task");
        System.out.println("2. List pending tasks");
        System.out.println("3. List done tasks");
        System.out.println("4. Clear tasks");
        System.out.println("5. Exit");
    }

    public static int option() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public static void task() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the task");
        String title = sc.nextLine();
        System.out.println("Enter the description of the task");
        String description = sc.nextLine();
        System.out.println("Enter the date of the task");
        String date = sc.nextLine();
//        task task = new task(title, description, date);
    }

    public static void main(String[] args) {



        File arquivo = new File("program");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println("WELCOME TO THE TASK MANAGER");
        menu();// call the menu method

        int option = option();// call the option method
        while (option != 5) {
            switch (option) {
                case 1:
                    System.out.println("Add a task");
                    new task();
                    break;
                case 2:
                    System.out.println("List pending tasks");
                    break;
                case 3:
                    System.out.println("List done tasks");
                    break;
                case 4:
                    System.out.println("Clear tasks");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            menu();// call the menu method
            option = option();// call the option method
        }

        System.out.println("Goodbye");







    }
}
