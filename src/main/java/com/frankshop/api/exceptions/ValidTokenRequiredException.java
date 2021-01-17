package com.frankshop.api.exceptions;

public class ValidTokenRequiredException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -8231632004949631702L;

    public ValidTokenRequiredException() {

        super("valid token required");
    }
}
