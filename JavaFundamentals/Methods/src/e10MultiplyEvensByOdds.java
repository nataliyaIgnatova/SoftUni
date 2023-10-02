import java.util.Arrays;
import java.util.Scanner;

public class e10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int input = Math.abs(Integer.parseInt(scanner.nextLine()));


        System.out.println(printMultiply(input));
    }

    public static int getOddSum (int number){

        String inToString = Integer.toString(number);

        int [] array = Arrays
                .stream(inToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int n : array) {

            if(n % 2 == 0){

                sum += n;
            }
        }
        return sum;
    }
    public static int getEvenSum (int number){

        String intToString = Integer.toString(number);

        int [] array = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int n : array) {

            if(n % 2 != 0){
                sum += n;
            }
        }
        return sum;
    }

    public static int printMultiply (int number){

        return getEvenSum(number) * getOddSum(number);
    }




}
