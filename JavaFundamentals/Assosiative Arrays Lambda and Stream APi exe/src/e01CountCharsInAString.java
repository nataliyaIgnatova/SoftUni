import java.util.*;

public class e01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> characterMap = new HashMap<>();

        for (char symbol : text.toCharArray()) {

            if(symbol == ' '){
                continue;
            }
            characterMap.putIfAbsent(symbol,0);
            characterMap.put(symbol, characterMap.get(symbol)+1);
        }

        characterMap.forEach((key, value) -> System.out.println(key + " -> " + value));





    }
}