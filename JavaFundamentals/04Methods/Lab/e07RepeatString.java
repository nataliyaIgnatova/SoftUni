import java.util.Scanner;

public class e07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStrin(input,number));
    }
    private static String repeatStrin(String str, int count){
        String result = "";
        for (int i = 0; i < count ; i++) {
            result = result + str;

        }
        return result;
    }
}
