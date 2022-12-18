import java.util.Scanner;

public class e2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        String[]  numbersArr = numbers.split(" ");

        int[] newNumberArr = new int[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {

           newNumberArr[i] = Integer.parseInt(numbersArr[i]);



        }
        System.out.println();


    }
}
