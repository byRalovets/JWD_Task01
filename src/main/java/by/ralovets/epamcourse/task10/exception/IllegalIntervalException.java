package by.ralovets.epamcourse.task10.exception;

public class IllegalIntervalException extends Exception {

    public IllegalIntervalException() {
        super();
    }

    public IllegalIntervalException(String message) {
        super(message);
    }

    public IllegalIntervalException(Exception e) {
        super(e);
    }

    public IllegalIntervalException(String message, Exception e) {
        super(message, e);
    }
}
