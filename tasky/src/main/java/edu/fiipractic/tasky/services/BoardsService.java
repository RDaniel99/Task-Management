package edu.fiipractic.tasky.services;

import edu.fiipractic.tasky.apiutils.exceptions.InvalidParametersException;
import edu.fiipractic.tasky.apiutils.messages.ApiMessages;
import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.repositories.BoardsRepository;
import edu.fiipractic.tasky.utils.IdGenerator;
import edu.fiipractic.tasky.validators.BoardValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BoardsService {

    @Autowired
    private BoardsRepository repository;

    public void create(Board board) {

        BoardValidator.validate(board, repository);

        if(board.getId() == null) {

            board.setId(IdGenerator.generate());
        }

        repository.save(board);
    }

    public void delete(Integer boardId) {

        if(BoardValidator.isIdValid(boardId, repository)) {

            throw new InvalidParametersException(HttpStatus.BAD_REQUEST, ApiMessages.boardWithInvalidId(boardId));
        }

        repository.deleteById(boardId);
    }
}
