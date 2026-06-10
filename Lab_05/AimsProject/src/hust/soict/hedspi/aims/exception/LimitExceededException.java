package hust.soict.hedspi.aims.exception;

import hust.soict.hedspi.aims.Throwable;

public class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }

    public LimitExceededException(String message, Throwable cause) {
        super(message, cause);
    }
}
