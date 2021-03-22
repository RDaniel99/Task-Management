package edu.fiipractic.tasky.validators;

import edu.fiipractic.tasky.apiutils.exceptions.InvalidParametersException;
import edu.fiipractic.tasky.apiutils.messages.ApiMessages;
import edu.fiipractic.tasky.models.Board;
import org.springframework.http.HttpStatus;

public class BoardValidator {

    public static void validate(Board board) {

        validateFields(board);
    }

    private static void validateFields(Board board) {
        if(board.getId() == null) {

            throw new InvalidParametersException(HttpStatus.BAD_REQUEST, ApiMessages.boardIdIsEmpty());
        }

        if(board.getName() == null) {

            throw new InvalidParametersException(HttpStatus.BAD_REQUEST, ApiMessages.boardNameIsEmpty());
        }
    }
}
