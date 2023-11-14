import java.util.Scanner;

public class e04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {

            String asteriks = repeatString(banWordsArr.length);
            text = text.replace(banWord, asteriks);



        }
    }

    public static String repeatString (int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*" ;

        }
        return result;
    }
}
