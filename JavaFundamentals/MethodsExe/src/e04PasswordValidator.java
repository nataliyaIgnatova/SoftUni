import java.util.Scanner;

public class e04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = isValidLength(password);

        if(!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidContent(password);

        if (!isValidContent){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidCount = isValidCountNumber(password);

        if (!isValidCount){
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidCount && isValidContent){
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidCountNumber (String pass){
        int count = 0;
        for (char symbol: pass.toCharArray()){
            if(Character.isDigit(symbol)){
                count++;
            }
        }
        return count >= 2;
    }

    public static boolean isValidContent (String pass){
        for (char symbol : pass.toCharArray()){
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidLength(String pass){
        return pass.length() >= 6 && pass.length() <= 10;
    }
}
