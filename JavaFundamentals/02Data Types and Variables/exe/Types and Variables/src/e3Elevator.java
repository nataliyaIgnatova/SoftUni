import java.util.Scanner;

public class e3Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacityPeople = Integer.parseInt(scanner.nextLine());

       double numberCourse =Math.ceil(numberPeople *1.0 / capacityPeople);

        System.out.printf("%.0f",numberCourse);



    }
}


