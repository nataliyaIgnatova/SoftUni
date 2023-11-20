import java.util.Scanner;

public class e10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if(isDivisible(i) && isOneDigitOdd(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isDivisible(int n){
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }

        return sum % 8 == 0;
    }

    public static boolean isOneDigitOdd (int number) {

        int oddNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return  false;
}
}



