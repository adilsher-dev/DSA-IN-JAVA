
// Custom checked exception
class InvalidAgeException extends Exception {//This Is Our Custom Checked Exception Class

    InvalidAgeException(String message) {
        super(message);
    }
}


class AgeCheck{

    static void validateAge(int age) throws InvalidAgeException{

        if ( age < 18 ){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else {
            System.out.println("Eligible to Vote");
        }
    }
}



public class CustomException {
    public static void main(String[] args) {

        try{
            AgeCheck.validateAge(16);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
