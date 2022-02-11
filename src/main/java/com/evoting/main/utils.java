package com.evoting.main;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class utils {
    public enum VoteOption {
        YES_VOTE,
        NO_VOTE,
        NULL_VOTE
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class NotFoundException extends RuntimeException {

    }
}

