package ArrayList;

import java.util.ArrayList;


public class TaskList {
    private ArrayList<TaskWork> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(TaskWork task) {
        if (task != null) {
            tasks.add(task);
        } else {
            throw new IllegalArgumentException("Task cannot be null");
        }
    }

    public void removeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        tasks.remove(index);
    }

    public void removeTask(Object obj) {
        tasks.remove(obj);
    }

    public void printTasks() {
        for (TaskWork task : tasks) {
            System.out.println(task.getName() + " - " + task.getDate() + " - " + task.getStatus());
        }
    }

    public void printCompletedTasks() {
        for (TaskWork task : tasks) {
            if (task.getStatus().equals(TaskStatus.COMPLETED))
                System.out.println("COMPLETED Task: " + task.getName() + " - " + task.getDate() + " - " + task.getStatus());
        }
    }

    public TaskWork getTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return tasks.get(index);
    }

    public void changeStatus(int index, TaskStatus newStatus) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        getTask(index).setStatus(newStatus);
    }
}
