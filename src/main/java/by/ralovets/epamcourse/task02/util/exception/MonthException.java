package by.ralovets.epamcourse.task02.util.exception;

public class MonthException extends Exception {

    public MonthException() {
        super();
    }

    public MonthException(String message) {
        super(message);
    }

    public MonthException(Exception e) {
        super(e);
    }

    public MonthException(String message, Exception e) {
        super(message, e);
    }
}
