package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PendingTask extends Task {


    private ArrayList<Integer> pending = new ArrayList<Integer>();

    public PendingTask() {
    }

    public PendingTask(ArrayList<Integer> pending) {
        this.pending = pending;
    }

    @Override
    public ArrayList<Integer> getPending() {
        return pending;
    }

    public void writeTxtPendingTask() {
        String arquivo = "src/data/pendingTask.txt";
        try {
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.close();
            for (int i = 0; i < pending.size(); i++) {
                FileWriter x = new FileWriter(arquivo, true);
                BufferedWriter y = new BufferedWriter(x);
                y.write(String.valueOf(pending.get(i)));
                y.newLine();
                y.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printPendingTask(ArrayList<String> title) {

        if (pending.size() == 0) {
            System.out.println("Don't have any pending tasks");
        } else {
            System.out.println("Pending tasks: ");
            for (int i = 0; i < pending.size(); i++) {
                System.out.println(pending.get(i) + " - " + title.get(pending.get(i) - 1));
            }
        }
    }

    public ArrayList<Integer> completeTask(ArrayList<Integer> completed){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the task you want to complete");
        int op = sc.nextInt();
        pending.remove((Integer) op);
        completed.add(op);
        return completed;

    }



}