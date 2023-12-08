import java.util.*;

public class e02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map <String, Integer> textMap = new LinkedHashMap<>();

        while (!text.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            textMap.putIfAbsent(text, 0);
            textMap.put(text, textMap.get(text)+quantity);


            text = scanner.nextLine();
        }

        textMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
