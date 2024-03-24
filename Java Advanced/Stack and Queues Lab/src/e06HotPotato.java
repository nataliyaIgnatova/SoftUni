import java.util.ArrayDeque;
import java.util.Scanner;

public class e06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] children = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();



        for (int i = 0; i < children.length; i++) {
            queue.offer(children[i]);
        }

      while(queue.size() > 1){
          for (int i = 1; i < count ; i++) {
              queue.offer(queue.poll());
          }
          System.out.println("Removed " + queue.poll());
      }

        System.out.println("Last is " + queue.poll());
        
        
    }
}
