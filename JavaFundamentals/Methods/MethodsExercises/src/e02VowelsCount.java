import java.util.Arrays;
import java.util.Scanner;

public class e02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

       printCountVowels(input);

    }

    public static void printCountVowels(String text){
        int sum = 0 ;

        for (char symbol : text.toLowerCase().toCharArray()) {

            if(symbol == 'a' ||symbol == 'e' ||symbol == 'o' ||symbol == 'i' ||symbol == 'u'  ){
                sum++;
            }


            }
        System.out.println(sum);
        }

    }

