import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    private String description;
    private String dueDate;
    private String priority;

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