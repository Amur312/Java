package ArrayList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskWork task_1 = new TaskWork("Task 1", LocalDate.now(), TaskStatus.NEW);
        TaskWork task_2 = new TaskWork("Task 2", LocalDate.now(), TaskStatus.NEW);
        TaskWork task_3 = new TaskWork("Task 3", LocalDate.now(), TaskStatus.NEW);
        TaskWork task_4 = new TaskWork("Task 4", LocalDate.now(), TaskStatus.NEW);
        TaskWork task_5 = new TaskWork("Task 5", LocalDate.now(), TaskStatus.COMPLETED);
        taskList.addTask(task_1);
        taskList.addTask(task_2);
        taskList.addTask(task_3);
        taskList.addTask(task_4);
        taskList.addTask(task_5);
        taskList.printTasks();

        System.out.println("----------------------------------------------------------");
        taskList.removeTask(1);
        taskList.printTasks();

        System.out.println("----------------------------------------------------------");
        taskList.removeTask(task_3);
        taskList.printTasks();

        System.out.println("----------------------------------------------------------");
        taskList.printCompletedTasks();

        System.out.println("----------------------------------------------------------");
        taskList.changeStatus(0,TaskStatus.IN_PROGRESS);
        taskList.printTasks();

    }
}
