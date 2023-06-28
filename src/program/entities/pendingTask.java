package program.entities;

import java.util.Date;
import java.util.HashMap;

public class pendingTask extends task{


    public pendingTask() {
    }

    pendingTask(String title, String description, Date date) {
        super(title, description, date);
    }

    private HashMap<Integer,String> listPendingTask = new HashMap<>();

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





}
