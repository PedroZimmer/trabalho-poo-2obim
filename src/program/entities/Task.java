package program.entities;

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
        writeTxtTaskTitle(tit);
        writeTxtTaskDescription(desc);
        title.add(tit);
        description.add(desc);
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
    public void readTxtTasksDescriptions(){
        String caminhoDoArquivo = "program/taskDescription.txt";
        Path arquivo = Paths.get(caminhoDoArquivo);
        try{
            // Realiza a leitura de todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);
            // Loop Funcional
            // Alternativas forEach, for com indices ( for de i)
            linhas.forEach(System.out::println);
        }catch(Exception e){
            // Se algo de errado acontecer
            // Arquivo não encontrado
            e.printStackTrace();
        }
    }


}
