package duke;

public class Parser {
    public enum taskType {
        TODO, DEADLINE, EVENT, MARK, UNMARK, DELETE, HELP, INVALID, FIND
    }

    /**
     * Finds the task type of command.
     *
     * @param getCommand Command string from the user.
     */
    public static taskType getTaskType (String getCommand) {
        String[] inputLine = getCommand.split(" ",2);
        switch (inputLine[0]) {
        case "todo":
            return taskType.TODO;
        case "deadline":
            return taskType.DEADLINE;
        case "event" :
            return taskType.EVENT;
        case "mark":
            return taskType.MARK;
        case "unmark":
            return taskType.UNMARK;
        case "delete":
            return taskType.DELETE;
        case "help":
            return taskType.HELP;
        case "find":
            return taskType.FIND;
        default: return taskType.INVALID;
        }
    }

}
