import java.util.Arrays;
import java.util.Scanner;

public class e6EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elementArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean noSuchIndex = true;

        for (int i = 0; i < elementArray.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < elementArray.length; j++) {
                if(j== elementArray.length-1){
                    rightSum += 0;
                    break;
                }
                 else if (j == elementArray.length-1 && i == elementArray.length-1 ) {
                    rightSum = 0;
                    leftSum += elementArray[j-1];

                }else if(j==0 && i == 0){
                    leftSum = 0;
                    rightSum += elementArray[j+1];
                }
                else if(i > j){
                    leftSum += elementArray[j];
                }else {
                    rightSum += elementArray[j+1];
                }

            }
            if(leftSum == 0 && rightSum == 0){
                System.out.println(0);
                noSuchIndex = false;

            } else if (leftSum == rightSum){
                System.out.println(i);
               noSuchIndex = false;

            }

        }
        if (noSuchIndex) {
            System.out.println("no");
        }




    }
}
