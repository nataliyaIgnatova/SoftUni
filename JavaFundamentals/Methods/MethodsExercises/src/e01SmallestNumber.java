import java.util.Scanner;

import static java.lang.System.*;

public class e01SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        out.println(printSmallestNumber(n1,n2,n3));
    }

    public static int printSmallestNumber(int one, int two, int three) {

        int smallestNumber = 0;
        if (one < two && one < three){
            smallestNumber = one;
        }else if (two < one && two < three){
            smallestNumber = two;
        }else{
            smallestNumber = three;
        }

        return smallestNumber;
    }
}