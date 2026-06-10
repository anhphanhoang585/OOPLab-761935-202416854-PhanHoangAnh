package hust.soict.hedspi.aims.exception;

import hust.soict.hedspi.aims.Throwable;

public class RuntimeException extends Exception {
    public RuntimeException() {
        super();
    }

    public RuntimeException(String message) {
        super(message);
    }

    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeException(Throwable cause) {
        super(cause);
    }
}
