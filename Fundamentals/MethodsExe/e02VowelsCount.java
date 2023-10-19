import java.util.Arrays;
import java.util.Scanner;

public class e02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(getVowelsCount(input));

    }

    public static String getVowelsCount (String text){
        int count = 0;
        for(char symbol : text.toLowerCase().toCharArray()){
            if(symbol == 'a' || symbol == 'e' || symbol == 'i'|| symbol == 'o'|| symbol == 'u'){
                count ++ ;
            }
        }
        return String.valueOf(count);
    }
}
