import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class e7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countSameNumbers = 1;
        int maxSequence = 0;
        int number= 0;

        for (int i= 1; i < array.length-1 ; i++) {

            if(array[i] == array[i-1] || array[i] == array.length-1 ) {
                countSameNumbers++;
                if(maxSequence < countSameNumbers){
                    maxSequence= countSameNumbers;
                    number = array[i];
                }
            } else {
                countSameNumbers = 1;
            }
        }
        for (int i = 0; i < maxSequence; i++) {

            System.out.print(number + " ");

        }
    }
}
