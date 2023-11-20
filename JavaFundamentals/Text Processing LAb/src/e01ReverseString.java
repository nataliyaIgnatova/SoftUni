import java.util.Scanner;

public class e01ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")){
            String reversText = "";
            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);
                reversText = reversText + symbol;

            }

            System.out.printf("%s = %s%n", text, reversText);


           text = scanner.nextLine();
        }
    }
}