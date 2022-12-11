import java.util.Scanner;

public class e11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int product = 0;

        for (int i = multiplier; i <= 10 ; i++) {

            product = n * i;

            System.out.printf("%d * %d = %d%n",n,i,product);

        }

        if(multiplier >10) {

            product = n * multiplier;

            System.out.printf("%d * %d = %d",n,multiplier,product);

        }



    }
}
