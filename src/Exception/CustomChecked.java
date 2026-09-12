package Exception;
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class CustomChecked {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new AgeException("Age is less than 18");
            }

            System.out.println("Eligible");
        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

