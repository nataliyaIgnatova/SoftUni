import java.util.Scanner;

public class e3PassedOrFailed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float grade = Float.parseFloat(scanner.nextLine());

        if ( grade>=3 ) {
            System.out.printf("Passed!");
        } else{
            System.out.printf("Failed!");
        }
    }
}
