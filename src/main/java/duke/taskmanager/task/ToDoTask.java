package duke.taskmanager.task;

import duke.taskmanager.exceptions.EmptyTaskException;

/**
 * ToDoTask is a Task with task information.
 */
public class ToDoTask extends Task {
    private static final String TASK_TYPE = "T";

    /**
     * Creates a new to do task with information indicating the name of the task.
     * Default completion status of the task is false.
     *
     * @param taskName string of the name of the task
     * @throws EmptyTaskException if taskName is empty
     */
    public ToDoTask(String taskName) throws EmptyTaskException {
        super(TASK_TYPE, taskName);
        assert !(super.getTaskName().equals("")) : "Task should not be empty";
    }

    /**
     * Creates a new to do task with information indicating the name of the task.
     *
     * @param taskName string of the name of the task
     * @param isCompleted boolean of the completion status of the task.
     * @throws EmptyTaskException if taskName is empty
     */
    public ToDoTask(String taskName, boolean isCompleted) throws EmptyTaskException {
        super(TASK_TYPE, taskName, isCompleted);
        assert !(super.getTaskName().equals("")) : "Task should not be empty";
    }
}
