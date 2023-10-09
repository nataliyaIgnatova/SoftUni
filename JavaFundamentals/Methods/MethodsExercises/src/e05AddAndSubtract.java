import java.util.Scanner;

public class e05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        digitSubtract(one, two, three);
    }


    public static void digitSubtract(int first, int second , int thirdNumber){

        int subtract = (first + second) - thirdNumber;

        System.out.println(subtract);

    }
}
