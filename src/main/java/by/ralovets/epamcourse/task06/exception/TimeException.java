package by.ralovets.epamcourse.task06.exception;

public class TimeException extends Exception {

    public TimeException() {
        super();
    }

    public TimeException(String message) {
        super(message);
    }

    public TimeException(Exception e) {
        super(e);
    }

    public TimeException(String message, Exception e) {
        super(message, e);
    }
}
