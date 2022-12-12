import java.util.Scanner;

public class e5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";
        int countWrongPass = 0;

        for (int i = userName.length()-1; i >= 0 ; i--) {
            char currentSymbol = userName.charAt(i);
            password += currentSymbol;
        }

        String enterPassword = scanner.nextLine();
        int countWrongTry = 0;
        while(!enterPassword.equals(password)){

            countWrongTry++;

            if(countWrongTry >= 4){
                System.out.printf("User %s blocked!",userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");;


            enterPassword = scanner.nextLine();
        }

        if(enterPassword.equals(password)){
            System.out.printf("User %s logged in.",userName);
        }







    }
}
