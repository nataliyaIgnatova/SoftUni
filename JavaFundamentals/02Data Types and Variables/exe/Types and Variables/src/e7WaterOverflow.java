import java.util.Scanner;

public class e7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= lines; i++) {

            int quantitiesWater = Integer.parseInt(scanner.nextLine());
            sum+=quantitiesWater;
            if(sum > 255) {

                sum-=quantitiesWater;

                System.out.println("Insufficient capacity!");
                continue;
            }


        }
        System.out.println(sum);
    }
}
