package hust.soict.hedspi.aims.exception;

import hust.soict.hedspi.aims.Throwable;

public class Exception extends Throwable {
    public Exception() {
        super();
    }

    public Exception(String message) {
        super(message);
    }

    public Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception(Throwable cause) {
        super(cause);
    }
}
