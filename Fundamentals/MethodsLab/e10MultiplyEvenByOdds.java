import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class e10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiply(input));

    }
    public static int getOddSum (int input){
        String intToString = Integer.toString(input);

        int [] array = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        for (int n : array) {
            if(n % 2 == 0){
                sum += n;
            }

        }
        return  sum;
    }

    public static int getEvenSum(int input){
        String inToString = Integer.toString(input);

        int[] array = Arrays
                .stream(inToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int n : array ) {

            if(n % 2 != 0){
                sum +=n;
            }

        }
        return sum;
    }

    public static int getMultiply (int number){
        return getEvenSum(number) * getOddSum(number);
    }
}
