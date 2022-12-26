import java.util.Arrays;
import java.util.Scanner;

public class e8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < numbers.length ; i++) {
            int numberOne = numbers[i];
            int sum = 0;

            for (int j = i + 1; j < numbers.length ; j++) {
                int numberTwo = numbers[j];

                sum = numberOne + numberTwo;

                if (sum == magicNumber){
                    System.out.println(numberOne + " " + numberTwo);
                }
            }

        }



    }
}
