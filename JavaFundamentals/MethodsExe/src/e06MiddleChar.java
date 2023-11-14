import java.util.Scanner;

public class e06MiddleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);
    }

    public static void printMiddleChar(String input){

        char middleChar = ' ';

        if (input.length() % 2 != 0){
            int indexOfMiddleChar = input.length()/2;
            System.out.println(input.charAt(indexOfMiddleChar));
        }else {
            int indexOfMiddleCharOne = input.length()/2-1;
            int indexOfMiddleCharTwo = input.length()/2;
            System.out.print(input.charAt(indexOfMiddleCharOne));
            System.out.println(input.charAt(indexOfMiddleCharTwo));
        }
    }
}
