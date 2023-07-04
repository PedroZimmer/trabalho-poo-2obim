package entities;

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


    public String toString() {
        return "PendingTask{" +
                "pending=" + pending +
                '}';
    }


}