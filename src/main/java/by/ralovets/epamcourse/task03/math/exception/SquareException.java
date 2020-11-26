package by.ralovets.epamcourse.task03.math.exception;

public class SquareException extends Exception {

    public SquareException() {
        super();
    }

    public SquareException(String message) {
        super(message);
    }

    public SquareException(Exception e) {
        super(e);
    }

    public SquareException(String message, Exception e) {
        super(message, e);
    }
}
