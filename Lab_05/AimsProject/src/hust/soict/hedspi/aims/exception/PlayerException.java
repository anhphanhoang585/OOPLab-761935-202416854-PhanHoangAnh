package hust.soict.hedspi.aims.exception;

import hust.soict.hedspi.aims.Throwable;

public class PlayerException extends Exception {
    public PlayerException(String message) {
        super(message);
    }

    public PlayerException(String message, Throwable cause) {
        super(message, cause);
    }
}
