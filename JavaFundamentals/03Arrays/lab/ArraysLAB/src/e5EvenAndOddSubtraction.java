import java.util.Arrays;
import java.util.Scanner;

public class e5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOdd = 0;
        int sumEven  = 0;

        for (int i = 0; i < numberArr.length ; i++) {

            if(numberArr[i] % 2 == 0){

                sumEven+=numberArr[i];

            }else{
                sumOdd+=numberArr[i];
            }

        }
        System.out.printf("%d",sumEven-sumOdd);
    }

}
