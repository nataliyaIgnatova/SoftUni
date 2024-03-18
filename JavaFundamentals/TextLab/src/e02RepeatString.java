import java.util.*;

public class e02RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");

        List<String> repeatText = new ArrayList<>();

        for (int i = 0; i < textArr.length; i++) {
            String currentWord = textArr[i];
            int length = currentWord.length();

            String repeatWord = repeatString(length, currentWord);
            repeatText.add(repeatWord);
        }
        System.out.println(String.join("",repeatText));

//        StringBuilder result = new StringBuilder();
//
//        for (String word : textArr) {
//
//            for (int i = 0; i < word.length() ; i++) {
//                result.append(word);
//
//            }
//
//        }
//        System.out.println(result);
    }

    public static String repeatString(int n, String word){
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + word;

        }
        return result;
    }
}
