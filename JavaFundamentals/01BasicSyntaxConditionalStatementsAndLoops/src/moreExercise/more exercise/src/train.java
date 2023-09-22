import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int [firstArr.length-1];
        int sum =0;

        for (int i = 0; i < firstArr.length; i++) {

            if(firstArr.length == 1){
                sum = firstArr[0]+firstArr[1];
                break;
            }
            else{
                condensed[i] = firstArr[i] + firstArr[i + 1];
            }
        }
        System.out.println(sum);





    }
}


