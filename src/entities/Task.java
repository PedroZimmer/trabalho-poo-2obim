package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Task {

    private ArrayList<String> title = new ArrayList<>() {};
    private ArrayList<String> description = new ArrayList<>();
    private ArrayList<Integer> pending = new ArrayList<>();
    private ArrayList<Integer> completed = new ArrayList<>();


    public Task() {
    }

    public ArrayList<String> getTitle() {
        return title;
    }

    public int getTitleSize() {
        return title.size();
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public ArrayList<Integer> getPending() {
        return pending;
    }

    public ArrayList<Integer> getCompleted() {
        return completed;
    }


    public void addTask(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the task");
        String tit = sc.nextLine();
        title.add(tit);

        System.out.println("Enter the description of the task");
        String desc = sc.nextLine();
        description.add(desc);
        pending.add(getTitleSize());
    }


    public void writeTxtTaskTitle(int initialSize){
        String arquivo = "src/data/taskTitle.txt";
        try {
            for (int i = initialSize; i < title.size(); i++) {
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(title.get(i));
                bw.newLine();
                bw.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeTxtTaskDescription(int initialSize){
        String arquivo = "src/data/taskDescription.txt";
        try {
            for (int i = initialSize; i < title.size(); i++) {
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(description.get(i));
                bw.newLine();
                bw.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //VAI COLOCAR OS TITULOS NO ARRAYLIST
    public void readTxtTaskTitle(){
        String caminhoDoArquivo = "src/data/taskTitle.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                title.add(linha);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS DESCRICOES NO ARRAYLIST
    public void readTxtTaskDescription(){
        String caminhoDoArquivo = "src/data/" +
                "taskDescription.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                description.add(linha);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS TAREFAS PENDENTES NO ARRAYLIST
    public void readTxtPendingTask() {
        String caminhoDoArquivo = "src/data/" +
                "pendingTask.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                Integer numero = Integer.parseInt(linha);
                pending.add(numero);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS TAREFAS COMPLETADAS NO ARRAYLIST
    public void readTxtCompletedTask() {
        String caminhoDoArquivo = "src/data/" +
                "completedTask.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                Integer numero = Integer.parseInt(linha);
                completed.add(numero);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
