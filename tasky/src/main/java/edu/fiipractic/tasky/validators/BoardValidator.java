package edu.fiipractic.tasky.validators;

import edu.fiipractic.tasky.apiutils.exceptions.InvalidParametersException;
import edu.fiipractic.tasky.apiutils.messages.ApiMessages;
import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.repositories.BoardsRepository;
import org.springframework.http.HttpStatus;

public class BoardValidator {

    public static void validate(Board board, BoardsRepository repository) {

        validateFields(board, repository);
    }

    public static boolean isIdValid(Integer boardId, BoardsRepository repository) {

        return !repository.existsById(boardId);
    }

    private static void validateFields(Board board, BoardsRepository repository) {

        if(board.getName() == null) {

            throw new InvalidParametersException(HttpStatus.BAD_REQUEST, ApiMessages.boardNameIsEmpty());
        }

        if(board.getId() != null && isIdValid(board.getId(), repository)) {

            throw new InvalidParametersException(HttpStatus.BAD_REQUEST, ApiMessages.boardIdIsAlreadyUsed(board.getId()));
        }
    }
}
