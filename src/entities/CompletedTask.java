package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CompletedTask extends Task {


    private ArrayList<Integer> completed = new ArrayList<>();

    public CompletedTask() {
    }

    public void setCompleted(ArrayList<Integer> completed) {
        this.completed = completed;
    }

    public CompletedTask(ArrayList<Integer> completed) {
        this.completed = completed;
    }

    @Override
    public ArrayList<Integer> getCompleted() {
        return completed;
    }

    public void sortCompletedTask() {
        completed.sort(null);
    }

    public void writeTxtCompletedTask() {
        String arquivo = "src/data/completedTask.txt";
        sortCompletedTask();
        try {
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.close();
            for (int i = 0; i < completed.size(); i++) {
                FileWriter x = new FileWriter(arquivo, true);
                BufferedWriter y = new BufferedWriter(x);
                y.write(String.valueOf(completed.get(i)));
                y.newLine();
                y.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printCompletedTask(ArrayList<String> title) {
        System.out.println("Completed tasks: ");
        for (int i = 0; i < completed.size(); i++) {
            System.out.println(completed.get(i) + " - " + title.get(completed.get(i)-1));
        }

    }


}
