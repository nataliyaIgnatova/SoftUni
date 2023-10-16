import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class e08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
       double power = Double.parseDouble(scanner.nextLine());

        DecimalFormat value = new DecimalFormat("0.####");

        double result = getPower(input, power);

        System.out.println(value.format(result));

    }
    public static double getPower (double num1,double num2){

        double result = 1;

        for (int i = 0; i < num2; i++) {

         result = result * num1;


        }
        return result;
    }
}
