package entities;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CompletedTask extends Task {


    private ArrayList<Integer> completed = new ArrayList<>();


    public CompletedTask() {
    }

    public CompletedTask(ArrayList<Integer> completed) {
        this.completed = completed;
    }

//    public void readTxtCompletedTask() {
//        String caminhoDoArquivo = "src/data/" +
//                "completedTask.txt";
//        Path arquivo = Paths.get(caminhoDoArquivo);
//        try{
//            // Realiza a leitura de todas as linhas do arquivo
//            List<String> linhas = Files.readAllLines(arquivo);
//
//            // Loop Funcional
//            // Alternativas forEach, for com indices ( for de i)
//            for (String linha : linhas) {
//                Integer numero = Integer.parseInt(linha);
//
//                // Adicionar o número à lista de tarefas pendentes
//                completed.add(numero);
//            }
////            linhas.forEach(System.out::println);
//        }catch(Exception e){
//            // Se algo de errado acontecer
//            // Arquivo não encontrado
//            e.printStackTrace();
//        }
//    }


    public String toString() {
        return "CompletedTask{" +
                "completed=" + completed +
                '}';
    }






}
