import java.util.Scanner;

public class e4BackIn30Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int allTime = (hour * 60) + min + 30;

        int needHour = allTime / 60;
        int needMin = allTime % 60;

        if(needHour > 23){
            needHour = 0;
        }

        System.out.printf("%d:%02d",needHour,needMin);


    }
}
