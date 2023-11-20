import java.util.Scanner;

public class e9SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int yieldStartingSource = Integer.parseInt(scanner.nextLine());

        int daysCount = 0;
        int workersConsume = 0;
        int spiceExtracted = 0;

        for (int sum = yieldStartingSource; sum >= 100 ; sum -= 10) {


            int sumWorkers = sum - 26;
            spiceExtracted +=sumWorkers  ;
            daysCount++;

        }
        System.out.println(daysCount);
        System.out.printf("%d", spiceExtracted - 26);



    }

}
