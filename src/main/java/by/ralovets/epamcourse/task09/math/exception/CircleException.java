package by.ralovets.epamcourse.task09.math.exception;

public class CircleException extends Exception {

    public CircleException() {
        super();
    }

    public CircleException(String message) {
        super(message);
    }

    public CircleException(Exception e) {
        super(e);
    }

    public CircleException(String message, Exception e) {
        super(message, e);
    }
}
