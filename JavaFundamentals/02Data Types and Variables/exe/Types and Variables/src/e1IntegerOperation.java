import java.util.Scanner;

public class e1IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());
        int numFour = Integer.parseInt(scanner.nextLine());

        int sum = numOne + numTwo;
        int divide = sum /numThree;
        int multiply = divide * numFour;

        System.out.println(multiply);



    }
}