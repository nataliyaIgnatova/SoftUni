import java.util.Scanner;

public class e06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double lengthInput = Double.parseDouble(scanner.nextLine());


        printRectangleArea(widthInput,lengthInput);

    }

    public static double getRectangleArea(double width,double length){

        return width  * length;

    }
    public static void printRectangleArea(double width,double length){
        double area = getRectangleArea(width, length);
        System.out.printf("%.0f",area);
    }
}
