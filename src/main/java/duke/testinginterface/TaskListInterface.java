package duke.testinginterface;

import duke.task.Task;

import java.time.LocalDate;
import java.util.ArrayList;

public interface TaskListInterface {
    public ArrayList<Task> getTasks();
    public void addTask(Task task);
    public void deleteTask(int pos);
    public ArrayList<Task> checkDate(LocalDate date);
}
