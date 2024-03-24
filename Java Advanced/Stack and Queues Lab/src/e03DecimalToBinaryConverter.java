import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class e03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (input != 0){
            stack.push(input % 2);
            input /= 2;

        }

        for (int i = stack.size()-1; i >= 0 ; i--) {
            System.out.print(stack.pop());
        }

    }
}
