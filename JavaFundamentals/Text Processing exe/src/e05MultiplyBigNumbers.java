import java.math.BigInteger;
import java.util.Scanner;

public class e05MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNumber.multiply(new BigInteger(String.valueOf(secondNumber))));
    }
}
