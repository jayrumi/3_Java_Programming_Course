package org.erumyantsev.figure.exception;

/**
 * Created by Yauheni_Rumiantsau on 7/1/2017.
 */
public class WrongDelimiterException extends Exception {

    public WrongDelimiterException() {

    }

    public WrongDelimiterException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDelimiterException(String message) {
        super(message);
    }

    public WrongDelimiterException(Throwable cause) {
        super(cause);
    }

}