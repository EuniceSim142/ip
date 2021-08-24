package duke.command;

import duke.Storage;
import duke.task.TaskList;
import duke.Ui;

public class ListCommand extends Command {

    public ListCommand() {
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.list(taskList);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
