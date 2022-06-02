package com.MyMoviePlan.exception;

@SuppressWarnings("serial")
public class MovieShowNotFoundException extends RuntimeException {
    public MovieShowNotFoundException(String message) {
        super(message);
    }
}
