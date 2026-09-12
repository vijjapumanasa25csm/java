package Exception;
class InvalidMarksException extends RuntimeException {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomUnchecked {
    public static void main(String[] args) {
        int marks = 120;

        if (marks > 100) {
            throw new InvalidMarksException("Marks cannot be greater than 100");
        }

        System.out.println("Valid marks");
    }
}

