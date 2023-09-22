import java.util.Scanner;

public class splitArrayToNumbrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] inputArr = inputLine.split(" ");

        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr [i] = Integer.parseInt(inputArr[i]);
        }
    }

}
