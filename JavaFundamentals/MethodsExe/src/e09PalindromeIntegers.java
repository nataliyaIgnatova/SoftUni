import java.util.Scanner;

public class e09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isPalindrome(input));

            input = scanner.nextLine();
        }

    }
    public static boolean isPalindrome (String text){

        String reverseText = "";

        for (int i = text.length()-1; i >=0 ; i--) {

            reverseText += text.charAt(i);
        }

        return text.equals(reverseText);

    }
}
