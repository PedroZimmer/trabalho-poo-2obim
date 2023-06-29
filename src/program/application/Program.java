package program.application;

import program.entities.PendingTask;
import program.entities.Task;

import java.util.Scanner;

public class Program {


    public static void menu() {

        System.out.println("1. Add a task");
        System.out.println("2. List pending tasks");
        System.out.println("3. List done tasks");
        System.out.println("4. Exit");
    }

    public static int option() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public static void newPendingTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the task");
        String title = sc.nextLine();
        System.out.println("Enter the description of the task");
        String description = sc.nextLine();
        System.out.println("Enter the date of the task");
        String date = sc.nextLine(); //change to datetimeformatter
        PendingTask task = new Task(title, description, date);
        int size = task.getPendingTaskSize();
        task.addPendingTask(size+1, title);

    }



    public static void main(String[] args) {


        System.out.println("WELCOME TO THE TASK MANAGER");
        menu();// call the menu method

        int option = option();// call the option method
        while (option != 4) {
            switch (option) {
                case 1:
                    System.out.println("Add a task");
                    newPendingTask();
                    break;
                case 2:
                    System.out.println("List pending tasks");
                    break;
                case 3:
                    System.out.println("List done tasks");
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
