package edu.fiipractic.tasky.controllers;

import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.repositories.BoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("board")
public class BoardsController {

    @Autowired
    private BoardsRepository repository;

    @PostMapping("/")
    public String createBoard(@RequestBody Board board) {
        repository.save(board);
        return "Succeeeeeeess";
    }
}
