import java.util.ArrayDeque;
import java.util.Scanner;

public class e02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] expression = scanner.nextLine().split("\\s+");

        for (int i = expression.length-1; i >= 0 ; i--) {
            String token = expression[i];
            stack.push(token);
        }

        while(stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            switch (op){
                case "+":
                    stack.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNum - secondNum));
            }
        }

        System.out.println(stack.pop());


    }
}
