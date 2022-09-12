package duke.chatbot.commandmanager;

import java.util.HashMap;
import java.util.Map;

import duke.chatbot.ChatBot;
import duke.chatbot.commandmanager.commands.ByeCommandHandler;
import duke.chatbot.commandmanager.commands.Command;
import duke.chatbot.commandmanager.commands.DeadlineTaskCommandHandler;
import duke.chatbot.commandmanager.commands.DeleteTaskCommandHandler;
import duke.chatbot.commandmanager.commands.EventTaskCommandHandler;
import duke.chatbot.commandmanager.commands.FindTaskCommandHandler;
import duke.chatbot.commandmanager.commands.ListTaskCommandHandler;
import duke.chatbot.commandmanager.commands.MarkTaskCommandHandler;
import duke.chatbot.commandmanager.commands.TodoTaskCommandHandler;
import duke.chatbot.commandmanager.commands.UnmarkTaskCommandHandler;
import duke.chatbot.commandmanager.commands.UpdateTaskCommandHandler;
import duke.chatbot.commandmanager.commands.exceptions.InvalidCommandException;
import duke.chatbot.taskmanager.TaskManager;

/**
 * CommandManager class manages a list of commands that can be executed.
 */
public class CommandManager {
    private final Map<String, Command> commandTable;
    public CommandManager() {
        this.commandTable = new HashMap<>();
    }

    /**
     * Initializes the command table with all commands that can be executed.
     *
     * @param chatBot a reference to the chatbot
     * @param taskManager a reference to the task manager
     */
    public void initialize(ChatBot chatBot, TaskManager taskManager) {
        this.commandTable.put("bye", new ByeCommandHandler(chatBot));
        this.commandTable.put("list", new ListTaskCommandHandler(taskManager));
        this.commandTable.put("todo", new TodoTaskCommandHandler(taskManager));
        this.commandTable.put("deadline", new DeadlineTaskCommandHandler(taskManager));
        this.commandTable.put("event", new EventTaskCommandHandler(taskManager));
        this.commandTable.put("mark", new MarkTaskCommandHandler(taskManager));
        this.commandTable.put("unmark", new UnmarkTaskCommandHandler(taskManager));
        this.commandTable.put("delete", new DeleteTaskCommandHandler(taskManager));
        this.commandTable.put("find", new FindTaskCommandHandler(taskManager));
        this.commandTable.put("update", new UpdateTaskCommandHandler(taskManager));
    }

    public Command getCommand(String command) throws InvalidCommandException {
        if (!(this.commandTable.containsKey(command))) {
            throw new InvalidCommandException();
        }
        return this.commandTable.get(command);
    }
}
