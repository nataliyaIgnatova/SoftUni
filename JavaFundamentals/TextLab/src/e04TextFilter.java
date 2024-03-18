import java.util.Scanner;

public class e04TextFilter  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String banWord : bannedWordsArr ){

            text = text.replace(banWord, repeatString(bannedWordsArr.length));
        }
        System.out.println(text);

    }
    public static String repeatString( int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}
