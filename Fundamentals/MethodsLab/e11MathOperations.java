import java.util.Scanner;

public class e11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberFirst =Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numberSecond = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(numberFirst, operator, numberSecond));
    }

    private static double calculate (int a , String action , int b){
        double result = 0;
        switch (action){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

        }
        return result;
    }
}
