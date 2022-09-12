package duke.chatbot.commands;

import duke.chatbot.commands.exceptions.InvalidArgumentsException;

/**
 * Interface that provide commands an execute method
 */
public interface UpdateCommand {
    public String execute(int itemNumber, String updatedArguments) throws InvalidArgumentsException;
}