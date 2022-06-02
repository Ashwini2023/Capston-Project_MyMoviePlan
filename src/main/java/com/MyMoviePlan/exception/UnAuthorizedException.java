package com.MyMoviePlan.exception;

@SuppressWarnings("serial")
public class UnAuthorizedException extends RuntimeException{

    public UnAuthorizedException(String message) {
        super(message);
    }


}