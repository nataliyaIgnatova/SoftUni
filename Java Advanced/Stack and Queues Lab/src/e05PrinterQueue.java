import java.util.ArrayDeque;
import java.util.Scanner;

public class e05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque <String> queue = new ArrayDeque<>();

        while(!input.equals("print")){


            if(!input.equals("cancel")){
                queue.offer(input);
            }else{
                if(queue.size() < 1){
                    System.out.println("Printer is on standby");
                }else {
                    queue.peek();
                    System.out.println("Canceled" + " " + queue.pop());
                }
            }

            input = scanner.nextLine();
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
