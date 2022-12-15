import java.util.Scanner;

public class e2PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pound = Integer.parseInt(scanner.nextLine());

        double dollar = pound * 1.36;

        System.out.printf("%.3f",dollar);
    }
}
