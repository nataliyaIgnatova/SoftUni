import java.util.Scanner;

public class e11MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());;;


        System.out.printf("%.0f",calculate(number1,operator,number2));
    }

    private static double calculate (int n1 , String symbol, int n2){
        double result = 0;

        switch (symbol){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }

        return  result;
    }
}
