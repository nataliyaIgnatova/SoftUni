import java.util.Scanner;

public class e11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberSnowballs = Integer.parseInt(scanner.nextLine());

        double value = 0;
       double highestValue =  Double.MIN_VALUE;
       int highSnow = 0;
       int highTime = 0;
       int highQuality = 0;

        for (int i = 0; i < nNumberSnowballs ; i++) {

            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            value = Math.pow(snow * 1.0 /time, quality);

            if(value > highestValue){
                highestValue = value;
                highSnow = snow;
                highTime = time;
                highQuality = quality;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)",highSnow,highTime,highestValue,highQuality);
    }
}
