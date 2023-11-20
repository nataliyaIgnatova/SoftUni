
import java.util.Arrays;
import java.util.Scanner;

public class traIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] peopleArr = new int[n];
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            peopleArr [i-1] = peopleCount;

            sum+=peopleCount;
        }

        for (int i = 0; i < peopleArr.length ; i++) {
            System.out.printf("%d ", peopleArr[i]);
        }
        System.out.printf("%n%d",sum);

        }

}
