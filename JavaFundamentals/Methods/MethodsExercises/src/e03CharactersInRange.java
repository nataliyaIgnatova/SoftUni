import java.util.Scanner;

public class e03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputOne = scanner.nextLine().charAt(0);
        char inputTwo = scanner.nextLine().charAt(0);

        printCharactersInRange(inputOne,inputTwo);

    }

    public static void printCharactersInRange(char first, char second){
        int start = Math.min(first, second);
        int end = Math.max(first, second);

        for (int i = start + 1; i < end ; i++) {

            System.out.print((char)i +" ");

        }
    }
}
