package edu.fiipractic.tasky.apiutils.messages;

public class ApiMessages {

    // COMMON MESSAGES
    public static String unknownError() { return "Something went wrong"; }

    // BOARD MESSAGES
    public static String boardCreated() { return "Board created successfully"; }
    public static String boardDeleted() { return "Board deleted successfully"; }
    public static String boardWithInvalidId(Integer id) { return "Board with id " + id + " does not exist"; }
    public static String boardIdIsAlreadyUsed(Integer id) { return "Board with " + id + " is assigned to another board"; }
    public static String boardNameIsEmpty() { return "Board Name can not be empty"; }
}
