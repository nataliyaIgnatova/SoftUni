import java.util.Arrays;
import java.util.Scanner;

public class e4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());




            for (int i = 0; i < rotations; i++) {

                int firstNumber = numbers[0];

                for (int k = 0; k < numbers.length-1 ; k++) {

                    numbers[k] = numbers[k+1];

                }

                numbers[numbers.length-1] = firstNumber;

                }

        for (int number:numbers) {
            System.out.print(number + " ");

        }
    }


    }

