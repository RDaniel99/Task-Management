package edu.fiipractic.tasky.controllers;

import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.services.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("board")
public class BoardsController {

    @Autowired
    private BoardsService service;

    @PostMapping("/")
    public String createBoard(@RequestBody Board board) {
        return service.create(board);
    }
}
