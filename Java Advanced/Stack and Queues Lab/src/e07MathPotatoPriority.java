import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class e07MathPotatoPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> queue = new PriorityQueue<>();

        for (String child: children) {
            queue.offer(child);

        }
        int cycle = 1;

        while (queue.size() > 1){

            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
                if(){
                    System.out.println("Prime " + queue.peek());
                }else {
                    System.out.println("Removed " + queue.poll());
                }
                cycle++;
            }
        }
        System.out.println("Last is " + queue.poll());

    }
}
