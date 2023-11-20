import java.util.Scanner;

public class e11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyBoardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0 ;
        int mouseCount = 0;
        int keyBoardCount = 0;
        int displayCount = 0;
        int gamesCount= 0;


        for (int i = 1; i <= games  ; i++) {

            if(i % 2 == 0){
                headsetCount++;
            }
            if(i % 3 == 0){
                mouseCount++;
            }

            if (i % 6 == 0){
                        keyBoardCount++;
                        if(keyBoardCount % 2 == 0){
                            displayCount++;
                        }
                    }
        }
        double totalPriceTrash = headsetCount * headsetPrice + mousePrice * mouseCount + keyBoardCount* keyBoardPrice+displayCount*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",totalPriceTrash);





    }
}
