package duke.taskmanager.exceptions;

/**
 * Exception that is thrown when there is an invalid event time.
 */
public class InvalidEventException extends Exception {
    /**
     * Exception that handles invalid date formats for event tasks.
     */
    public InvalidEventException(String dateFormat) {
        super("You have an invalid event time!\nEvent times should be in the format: " + dateFormat + "\n");
    }
}