import java.util.Scanner;

public class e06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String input){

        char middleChar = ' ';

        if (input.length() % 2 != 0){

                int indexOfMiddleChar = input.length()/2;
            System.out.println(input.charAt(indexOfMiddleChar));

            }
        else {
            int indexFirstOfMiddleChar = (input.length()/2)-1;
            int indexOfSecondMiddleChar = input.length()/2;

            System.out.print(input.charAt(indexFirstOfMiddleChar));
            System.out.println(input.charAt(indexOfSecondMiddleChar));
            }



    }
}
