package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A type of duke.Task that keeps track of the date and time of a task and the task's description.
 */
public class Event extends Task {
    protected LocalDate at;

    public Event(String description, LocalDate at) {
        super(description);
        this.at = at;
    }

    /**
     * Returns duke.Event's String form.
     *
     * @return String.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    /**
     * Returns the task type of duke.Todo.
     *
     * @return 2 to represent duke.Event task type.
     */
    @Override
    public int taskType() {
        return 2;
    }

    /**
     * Returns the description in the format that will be saved into Hard drive.
     *
     * @return String
     */
    @Override
    public String toSavedFormat() {
        return super.description + "/~/" + this.at;
    }
}