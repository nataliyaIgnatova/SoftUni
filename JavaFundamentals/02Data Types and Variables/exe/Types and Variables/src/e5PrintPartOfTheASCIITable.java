import java.util.Scanner;

public class e5PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        char charIndex = ' ';

        for (int i = first; i <= last; i++) {

             charIndex = (char) i;

            System.out.printf("%c ",charIndex);
        }






    }


}
