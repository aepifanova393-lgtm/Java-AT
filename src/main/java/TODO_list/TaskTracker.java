package TODO_list;

import java.util.ArrayList;

public class TaskTracker {

    ArrayList<Task> listOfTasks = new ArrayList<>();

    public void addTask(Task task) {
        listOfTasks.add(task);
        System.out.println("Добавлена задача" + task);
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
                System.out.println("Задача " + nameTask + " выполнена!");
                return;
                }
            }
        System.out.println("Задача " + nameTask + " не найдена!");
        }

    public void getStatus (String nameTask) {
        for (Task t : listOfTasks) {
            String name = t.getNameTask();
            if (name.equals(nameTask)) {
                boolean status = t.getStatusTask();
                    if (status) {
                        System.out.println("Статус задачи " + name + ":" + "выполнена!");
                    } else {
                        System.out.println("Статус задачи " + name + ":" + "не выполнена!");
                        return;
                    }
            }
        }
        System.out.println("Задача " + nameTask + " не найдена!");
        }

    public void taskStatistics (ArrayList<Task> listOfTasks) {
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
        System.out.println("Всего задач: " + quantityTasks + "\n" + "Выполнено: " + quantityDone + "\n" + "Открыто: " + quantityNotDone);
    }
}

