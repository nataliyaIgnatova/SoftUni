import java.util.Arrays;
import java.util.Scanner;

public class e3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArr = new String[n];
        String [] secondArr = new String [n];

        for (int i = 0 ; i < n ; i++) {

            String [] numbers = scanner.nextLine().split(" ");

            String firstElement = numbers[0];
            String secondElement = numbers[1];

            if(i % 2 == 0){
                firstArr[i] = firstElement;
                secondArr[i] = secondElement;

            } else{
                firstArr[i] = secondElement;
                secondArr[i] = firstElement;

            }

    }System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
}
}
