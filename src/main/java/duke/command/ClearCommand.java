package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class ClearCommand extends Command {

    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        storage.clear();
        taskList.clear();
        return ui.clear();
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
