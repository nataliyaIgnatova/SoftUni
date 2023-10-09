import java.util.Scanner;

public class e04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(!isValidLength(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(input)){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidCountDigits = isValidCountDigits(input);
        if(!isValidCountDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if(isValidLength(input) && isValidContent(input) && isValidCountDigits(input)){
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength (String text){

        return text.length() >= 6 && text.length() <= 10;

    }
    public static boolean isValidContent(String text){

        for(char symbol : text.toCharArray()){
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits (String text){
        int countDigits = 0;

        for(char symbol : text.toCharArray()){
            if (Character.isDigit(symbol)){
                countDigits++;
            }

        }

        return  countDigits >=2;
    }
}
