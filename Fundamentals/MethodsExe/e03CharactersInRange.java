import java.util.Scanner;

public class e03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputOne = scanner.nextLine().charAt(0);
        char inputTwo = scanner.nextLine().charAt(0);

        printRange(inputOne,inputTwo);
    }

    public static void printRange (char one, char two){
        int start = Math.min(one, two );
        int end = Math.max(one, two);

        for (int i = start + 1; i < end ; i++) {
            System.out.print((char) i + " " );
        }

    }
}
