package TODO_list;

public class Main {
    static void main() {

        TaskTracker tracker = new TaskTracker();

        Task task1 = new Task("To enjoy life", false);
        Task task2 = new Task ("Play games", false);
        Task task3 = new Task ("Pet the cat", false);

        tracker.addTask(task1);
        tracker.addTask(task2);
        tracker.addTask(task3);

        System.out.println(tracker);

        task1.printInfo();
        task2.printInfo();
        task3.printInfo();

        task3.setStatusTask(true);
        task3.printInfo();

        tracker.updateStatus("Play games");
        tracker.getStatus("Play games");

        tracker.taskStatistics();
    }


}
