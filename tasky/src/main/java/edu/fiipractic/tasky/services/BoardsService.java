package edu.fiipractic.tasky.services;

import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.repositories.BoardsRepository;
import edu.fiipractic.tasky.validators.BoardValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardsService {

    @Autowired
    private BoardsRepository repository;

    public void create(Board board) {

        BoardValidator.validate(board);

        repository.save(board);
    }
}
