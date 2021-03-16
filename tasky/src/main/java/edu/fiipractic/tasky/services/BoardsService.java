package edu.fiipractic.tasky.services;

import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.repositories.BoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardsService {

    @Autowired
    private BoardsRepository repository;

    public String create(Board board) {
        repository.save(board);

        return "Success";
    }
}
