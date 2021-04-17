package edu.fiipractic.tasky.controllers;

import edu.fiipractic.tasky.apiutils.messages.ApiMessages;
import edu.fiipractic.tasky.apiutils.status.Status;
import edu.fiipractic.tasky.models.Board;
import edu.fiipractic.tasky.services.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardsController {

    @Autowired
    private BoardsService service;

    @RequestMapping(value = "/board/", method = RequestMethod.POST)
    public Status createBoard(@RequestBody Board board) {

        service.create(board);

        return new Status(HttpStatus.CREATED, ApiMessages.boardCreated());
    }

    @RequestMapping(value="/board/{boardId}", method = RequestMethod.DELETE)
    public Status deleteBoard(@PathVariable Integer boardId) {

        service.delete(boardId);

        return new Status(HttpStatus.OK, ApiMessages.boardDeleted());
    }
}
