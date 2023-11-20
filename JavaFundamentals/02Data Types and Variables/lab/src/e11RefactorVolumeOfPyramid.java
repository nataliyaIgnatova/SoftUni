import java.util.Scanner;

public class e11RefactorVolumeOfPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());



        System.out.printf("Length: %f%n ",length);
        System.out.printf("Width: %f%n ",width);
        System.out.printf("Height: %f%n ",height);

        double volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);



    }
}
