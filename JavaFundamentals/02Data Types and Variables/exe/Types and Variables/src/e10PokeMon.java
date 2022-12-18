import java.util.Scanner;

public class e10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countTarget = 0;
        int powerRemain = pokePower;

        while (powerRemain >= distance) {

            powerRemain -= distance;
            countTarget++;

            if (pokePower / 2 == powerRemain) {

                    powerRemain /= exhaustionFactor;


            }
        }
            System.out.println(powerRemain);
            System.out.println(countTarget);

    }
}