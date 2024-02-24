package ArrayList;

import java.time.LocalDate;


public class TaskWork {
    private String name;
    private LocalDate date;
    private TaskStatus status;

    public TaskWork(String name, LocalDate date, TaskStatus status) {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public TaskStatus getStatus() {
        return status;
    }
    public void setStatus(TaskStatus status){
        this.status = status;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
}
