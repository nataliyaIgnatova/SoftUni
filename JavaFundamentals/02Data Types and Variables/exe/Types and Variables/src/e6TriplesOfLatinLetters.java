import java.util.Scanner;

public class e6TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char first = 'a';
        char second = 'b';
        char third = 'c';

        for (first = 'a' ; first < 'a' + n; first++) {

           for (second = 'a'; second < 'a' + n; second++) {

                for ( third = 'a';third < 'a' + n; third++) {

                    System.out.printf("%c%c%c%n",first,second,third);

                }

            }

        }

    }
}
