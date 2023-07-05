package application;

import entities.CompletedTask;
import entities.PendingTask;
import entities.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {


    public static void menu() {
        System.out.println("------------------------");
        System.out.println("1. Add a task");
        System.out.println("2. List pending tasks");
        System.out.println("3. List done tasks");
        System.out.println("4. Exit");
        System.out.println("------------------------");

    }

    public static int option() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public static void seeDescription(ArrayList<String> description, ArrayList<String> title) {
        System.out.println("Select a task to see the description");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println(title.get(option-1) + ":\n" + description.get(option - 1));

    }

    public static void main(String[] args) {

        Task task = new Task();

        System.out.println("WELCOME TO THE TASK MANAGER");
        menu();

        task.readTxtTaskTitle();
        int initialSize = task.getTitle().size();
        task.readTxtTaskDescription();
        task.readTxtPendingTask();
        task.readTxtCompletedTask();

        PendingTask pendingTask = new PendingTask(task.getPending());
        CompletedTask completedTask = new CompletedTask(task.getCompleted());

        int option = option();

        while (option != 4) {

            switch (option) {

                case 1:
                    System.out.println("Add a task");
                    task.addTask();

                    break;

                case 2:
                    //LIST PENDING TASK
                    pendingTask.printPendingTask(task.getTitle());

                    if (pendingTask.getPending().size() != 0) {
                        seeDescription(task.getDescription(), task.getTitle());
                        System.out.println("Do you want to complete a task? (y/n)");
                        Scanner sc = new Scanner(System.in);
                        String answer = sc.nextLine();
                        if (answer.equals("y")) {
                            completedTask.setCompleted(pendingTask.completeTask(completedTask.getCompleted()));
                        } else if (answer.equals("n")) {
                            System.out.println("Ok");
                        } else {
                            System.out.println("Invalid option");
                        }

                    }

                    break;

                case 3:

                    completedTask.printCompletedTask(task.getTitle());
                    seeDescription(task.getDescription(), task.getTitle());

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
        pendingTask.writeTxtPendingTask();
        completedTask.writeTxtCompletedTask();

        System.out.println("Goodbye");

    }
}
