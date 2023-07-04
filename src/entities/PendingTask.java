package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PendingTask extends Task {


    private ArrayList<Integer> pending = new ArrayList<Integer>();


    public PendingTask() {
    }

    public PendingTask(ArrayList<Integer> pending) {
        this.pending = pending;
    }


    public void printPendingTask(ArrayList<String> title) {
        System.out.println("Tarefas pendentes: ");
        for (int i = 0; i < pending.size(); i++) {
            System.out.println(pending.get(i) + " - " + title.get(pending.get(i)-1));
        }

    }

//    public void writePendingTask() {
//        String arquivo = "src/data/pendingTask.txt";
//        try {
//            // Append -> Adicionar no final do arquivo
//            for (int i = initialSize; i < title.size(); i++) {
//                FileWriter fw = new FileWriter(arquivo, true); // se tirar o append
//                BufferedWriter bw = new BufferedWriter(fw);
//                bw.write(description.get(i));
//                bw.newLine();
//                bw.close();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }








    public String toString() {
        return "PendingTask{" +
                "pending=" + pending +
                '}';
    }


}