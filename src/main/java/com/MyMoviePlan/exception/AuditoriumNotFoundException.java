package com.MyMoviePlan.exception;

@SuppressWarnings("serial")
public class AuditoriumNotFoundException extends RuntimeException {

    public AuditoriumNotFoundException(String message) {
        super(message);
    }
}