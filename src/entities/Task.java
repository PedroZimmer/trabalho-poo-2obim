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

//        PendingTask pendingTask = new PendingTask();
//        pendingTask.addPendingTask()
    }

    public void printTask(){

        for (int i = 0; i < title.size(); i++) {

            System.out.println(i+1 + " - " + title.get(i));


        }
        System.out.println("\n");
    }

    public void writeTxtTaskTitle(String x){
        String arquivo = "src/data/taskTitle.txt";
        try {
            // Append -> Adicionar no final do arquivo
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.newLine();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeTxtTaskDescription(String x){
        String arquivo = "src/data/taskDescription.txt";
        try {
            // Append -> Adicionar no final do arquivo
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.newLine();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //VAI COLOCAR OS TITULOS NO ARRAYLIST
    public void readTxtTaskTitle(){
        String caminhoDoArquivo = "src/data/taskTitle.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            // Realiza a leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            // Alternativas forEach, for com indices ( for de i)
            for (String linha : linhas) {
                title.add(linha);
            }
//            linhas.forEach(System.out::println);
        }catch(Exception e){
            // Se algo de errado acontecer
            // Arquivo não encontrado
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS DESCRICOES NO ARRAYLIST
    public void readTxtTaskDescription(){
        String caminhoDoArquivo = "src/data/" +
                "taskDescription.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            // Realiza a leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            // Loop Funcional
            // Alternativas forEach, for com indices ( for de i)
            for (String linha : linhas) {
                description.add(linha);
            }
//            linhas.forEach(System.out::println);
        }catch(Exception e){
            // Se algo de errado acontecer
            // Arquivo não encontrado
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS TAREFAS PENDENTES NO ARRAYLIST
    public void readTxtPendingTask() {
        String caminhoDoArquivo = "src/data/" +
                "pendingTask.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            // Realiza a leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            // Loop Funcional
            // Alternativas forEach, for com indices ( for de i)
            for (String linha : linhas) {
                Integer numero = Integer.parseInt(linha);

                // Adicionar o número à lista de tarefas pendentes
                pending.add(numero);
            }
//            linhas.forEach(System.out::println);
        }catch(Exception e){
            // Se algo de errado acontecer
            // Arquivo não encontrado
            e.printStackTrace();
        }
    }

    //VAI COLOCAR AS TAREFAS COMPLETADAS NO ARRAYLIST
    public void readTxtCompletedTask() {
        String caminhoDoArquivo = "src/data/" +
                "completedTask.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            // Realiza a leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            // Loop Funcional
            // Alternativas forEach, for com indices ( for de i)
            for (String linha : linhas) {
                Integer numero = Integer.parseInt(linha);

                // Adicionar o número à lista de tarefas pendentes
                completed.add(numero);
            }
//            linhas.forEach(System.out::println);
        }catch(Exception e){
            // Se algo de errado acontecer
            // Arquivo não encontrado
            e.printStackTrace();
        }
    }


}
