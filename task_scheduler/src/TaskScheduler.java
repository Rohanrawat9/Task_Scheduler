import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskScheduler {
    private static final List<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Task Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting Task Scheduler. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        System.out.println("Enter due date (yyyy-MM-dd):");
        String dueDate = scanner.nextLine();

        System.out.println("Enter priority level (High, Medium, Low):");
        String priority = scanner.nextLine();

        Task task = new Task(description, dueDate, priority);
        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
    public static class Task {
        private final String description;
        private final String dueDate;
        private final String priority;

        public Task(String description, String dueDate, String priority) {
            this.description = description;
            this.dueDate = dueDate;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "description='" + description + '\'' +
                    ", dueDate='" + dueDate + '\'' +
                    ", priority='" + priority + '\'' +
                    '}';
        }
    }
}

