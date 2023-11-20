import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class e08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numberFirst = scanner.nextLong();
        long numberSecond = scanner.nextLong();

        printDivision(numberFirst,numberSecond);

    }
    public static long getFactorialFirst (long numberOne){

        long result = 1;

        for (int i = 1; i <= numberOne ; i++) {
            result *= i;
        }

        return result;

    }

    public static long getFactorialSecond (long numberTwo){

        long result = 1;

        for (int i = 1; i <= numberTwo ; i++) {
            result *= i;
        }

        return result;

    }

    public static void printDivision(long one,long two){

        double value = getFactorialFirst(one) * 1.00 / getFactorialSecond(two);

        System.out.printf("%.2f", value);
    }
}
