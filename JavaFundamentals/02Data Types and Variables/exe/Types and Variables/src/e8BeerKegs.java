import java.util.Scanner;

public class e8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxKegName = "";

        for (int i = 1; i <=3 ; i++) {

            String kegName = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if(maxVolume < volume ){
                maxVolume = volume;
                maxKegName = kegName;
            }
        }
        System.out.println(maxKegName);



    }
}
