package edu.fiipractic.tasky.apiutils.status;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.Annotation;

public class Status implements ResponseStatus {

    private final HttpStatus status;
    private String reason;

    public Status(HttpStatus status, String reason) {

        this.status = status;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public HttpStatus value() {
        return status;
    }

    @Override
    public HttpStatus code() {
        return status;
    }

    @Override
    public String reason() {
        return reason;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}