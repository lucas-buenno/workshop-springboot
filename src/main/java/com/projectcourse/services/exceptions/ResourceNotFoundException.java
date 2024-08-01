package com.projectcourse.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("We did not find user with id " + id + " in the database.");
    }
}
