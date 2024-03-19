import java.util.ArrayDeque;
import java.util.Scanner;

public class e01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!command.equals("Home")){

            if(!command.equals("back")){
                stack.push(command);
                System.out.println(command);
            }else{
                if(stack.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    stack.pop();

                    System.out.println(stack.peek());
                }
            }

            command = scanner.nextLine();
        }

    }
}