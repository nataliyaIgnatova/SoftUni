import java.util.Scanner;

public class e10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        int product =0;


        for (int i = 1; i <= 10; i++) {
            product = n * i;

            System.out.printf("%d * %d = % d%n",n,i,product);
        }

        
    }
}
