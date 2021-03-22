package edu.fiipractic.tasky.controllers;

import edu.fiipractic.tasky.apiutils.exceptions.BoardException;
import edu.fiipractic.tasky.apiutils.messages.ApiMessages;
import edu.fiipractic.tasky.apiutils.status.Status;
import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.services.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("board")
public class BoardsController {

    @Autowired
    private BoardsService service;

    @PostMapping("/")
    public Status createBoard(@RequestBody Board board) {

        service.create(board);

        return new Status(HttpStatus.CREATED, ApiMessages.boardCreatedMessage());
    }
}
