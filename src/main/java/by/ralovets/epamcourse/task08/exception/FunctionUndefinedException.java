package by.ralovets.epamcourse.task08.exception;

public class FunctionUndefinedException extends Exception {

    public FunctionUndefinedException() {
        super();
    }

    public FunctionUndefinedException(String message) {
        super(message);
    }

    public FunctionUndefinedException(Exception e) {
        super(e);
    }

    public FunctionUndefinedException(String message, Exception e) {
        super(message, e);
    }
}
