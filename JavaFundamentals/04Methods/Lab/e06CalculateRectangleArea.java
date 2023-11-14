import java.util.Scanner;

public class e06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = printArea(width,length);
        System.out.printf("%.0f", area);


    }

    public static double printArea(double number1, double number2){

        return number1*number2;
    }
}
