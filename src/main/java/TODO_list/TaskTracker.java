package TODO_list;

import java.util.ArrayList;

public class TaskTracker {

    ArrayList<Task> listOfTasks = new ArrayList<>();

    public void addTask(Task task) {
        listOfTasks.add(task);
        System.out.println("Task added: " + task.getNameTask());
    }

    @Override
    public String toString() {
        return "Tasks: \n" + listOfTasks;
    }

    public void updateStatus (String nameTask) {
        for (Task t : listOfTasks) {
            String name = t.getNameTask();
            if (name.equals(nameTask)) {
                t.setStatusTask(true);
                System.out.println("Task " + nameTask + " is done!");
                return;
                }
            }
        System.out.println("Task " + nameTask + " is not done!");
        }

    public void getStatus (String nameTask) {
        for (Task t : listOfTasks) {
            String name = t.getNameTask();
            if (name.equals(nameTask)) {
                boolean status = t.getStatusTask();
                    if (status) {
                        System.out.println("Task status: " + name + " done");
                        return;
                    } else {
                    System.out.println("Task status: " + name + " is not done");
                        return;
                }
            }
        }
        System.out.println("Task " + nameTask + " is not found");
        }

    public void taskStatistics () {
        int quantityTasks = listOfTasks.size();
        int quantityDone = 0;
        int quantityNotDone = 0;
        for (Task t : listOfTasks) {
            boolean status = t.getStatusTask();
                if (status) {
                    quantityDone++;
                } else {
                    quantityNotDone++;
                }
        }
        System.out.println("Total tasks: " + quantityTasks + "\n" + "Done: " + quantityDone + "\n" + "Open: " + quantityNotDone);
    }
}

