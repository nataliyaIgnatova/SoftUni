import java.util.Scanner;

public class e2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {

                if (secondArr[i].equals(firstArr[j])) {
                    System.out.printf("%s ", secondArr[i]);
                }

            }

        }

//        for (String elementSecondArray:secondArr) {
//               for (String elementFirstArray:firstArr) {
        //if..{
//                      System.out.println( elementFirstArray + " ");
//                      break;
        //}
 //   }
//
//        }

    }
}
