import java.util.Scanner;

public class e01ValidUserName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String [] usernames = text.split(", ");

        for (String username : usernames){

            if(isValidUserName(username)){
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUserName (String name){
        if (name.length() < 3 || name.length() > 16){
            return false;
        }

        for (char symbol: name.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }

        }
        return true;
    }
}