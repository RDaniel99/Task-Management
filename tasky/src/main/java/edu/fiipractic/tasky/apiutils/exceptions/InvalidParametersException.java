package edu.fiipractic.tasky.apiutils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidParametersException extends ResponseStatusException {

    public InvalidParametersException(HttpStatus status, String reason) {

        super(status, reason);
    }
}
