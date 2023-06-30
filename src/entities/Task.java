package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class Task {

    public ArrayList<String> title = new ArrayList<>() {};
    private ArrayList<String> description = new ArrayList<>();
    private String date;
    private HashMap<Integer,String> tasks = new HashMap<>();


    public Task() {
    }


    public void addTask(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the task");
        String tit = sc.nextLine();
        System.out.println("Enter the description of the task");
        String desc = sc.nextLine();
//        System.out.println("Enter the date of the task");
//        String date = sc.nextLine(); //change to datetimeformatter
        title.add(tit);
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
        String arquivo = "src/taskTitle.txt";
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
        String arquivo = "src/taskDescription.txt";
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
        String caminhoDoArquivo = "src/taskTitle.txt";
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
        String caminhoDoArquivo = "src/taskDescription.txt";
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


}
