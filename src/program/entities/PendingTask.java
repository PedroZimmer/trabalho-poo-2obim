package program.entities;

import java.util.Date;
import java.util.HashMap;

public class PendingTask extends Task {


    public PendingTask() {
    }

    public PendingTask(String title, String description, String date) {
        super(title, description, date);
    }

    private HashMap<Integer,String> listPendingTask = new HashMap<>();
                // <ID, Title>

    public void addPendingTask(int id, String title){
        listPendingTask.put(id, title);
    }

    public void printPendingTask(){
        for (Integer key : listPendingTask.keySet()) {
            System.out.println(key + " - " + listPendingTask.get(key));
        }
    }

    public void removePendingTask(int id){
        listPendingTask.remove(id);
    }

    public void clearPendingTask(){
        listPendingTask.clear();
    }

    public int getPendingTaskSize(){
        return listPendingTask.size();
    }

    public HashMap<Integer, String> getListPendingTask() {
        return listPendingTask;
    }









}
