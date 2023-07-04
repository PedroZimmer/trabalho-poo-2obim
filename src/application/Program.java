package application;

import entities.CompletedTask;
import entities.PendingTask;
import entities.Task;

import java.util.ArrayList;
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


    public static void main(String[] args) {

        Task task = new Task();

        System.out.println("WELCOME TO THE TASK MANAGER");
        menu();// MENU

        task.readTxtTaskTitle();
        int initialSize = task.getTitle().size();
        task.readTxtTaskDescription();
        task.readTxtPendingTask();
        task.readTxtCompletedTask();

        PendingTask pendingTask = new PendingTask(task.getPending());
        CompletedTask completedTask = new CompletedTask(task.getCompleted());

        System.out.println("PENDINGS TASK:" + pendingTask);

        System.out.println("COMPLETED TASK:" + completedTask);


        int option = option();// OPTION


        while (option != 4) {

            switch (option) {

                case 1:
                    System.out.println("Add a task");
                    task.addTask();

                    break;

                case 2:
                    System.out.println("Pending tasks: ");
                    pendingTask.printPendingTask(task.getTitle());
                    break;

                case 3:
                    System.out.println("List done tasks");
                    completedTask.printCompletedTask(task.getTitle());
                    break;

                default:
                    System.out.println("Invalid option");
                    break;

            }

            menu();// call the menu method
            option = option();// call the option method
            System.out.println("\n");
        }

        task.writeTxtTaskTitle(initialSize);
        task.writeTxtTaskDescription(initialSize);

        System.out.println("Goodbye");

    }
}
