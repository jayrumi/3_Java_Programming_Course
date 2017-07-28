package org.rumyantsev.gameroom.exception;

public class ToyException extends Exception {

    public ToyException() {
    }

    public ToyException(String message) {
        super(message);
    }

    public ToyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToyException(Throwable cause) {
        super(cause);
    }

    public ToyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
