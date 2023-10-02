import java.text.DecimalFormat;
import java.util.Scanner;

public class e08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number =Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.###");
        double result = valueOfNumber(number,powerInput);


        System.out.println(df.format(result));
    }
    public static double valueOfNumber(double n, double power){

        double value = Math.pow(n,power);
        return value;

    }
}
