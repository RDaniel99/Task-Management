package edu.fiipractic.tasky.apiutils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BoardException extends ResponseStatusException {

    public BoardException(HttpStatus status, String message) {

        super(status, message);
    }
}
