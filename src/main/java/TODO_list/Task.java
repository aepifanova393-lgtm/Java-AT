package TODO_list;

public class Task {
    private final String nameTask;
    private boolean statusTask;

    //getter and setter
    public void setStatusTask (boolean statusTask) {
        this.statusTask = statusTask;
    }

    public boolean getStatusTask() {
        return statusTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    //конструктор
    public Task (String nameTask, boolean statusTask) {
        this.nameTask = nameTask;
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Name task: " + nameTask + " " + "Status task: " + statusTask;
    }

    //метод вывода информации
    public void printInfo() {
        if (statusTask) {
            System.out.println("Task " + nameTask + " is done!");
        } else {
            System.out.println("Task " + nameTask + ":" + "Check registration");
        }
    }
}
