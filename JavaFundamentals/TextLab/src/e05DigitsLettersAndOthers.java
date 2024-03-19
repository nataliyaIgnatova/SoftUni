import java.util.Scanner;

public class e05DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if(Character.isDigit(symbol)){
                digits.append(symbol);

            }else if(Character.isLetter(symbol)){
                letters.append(symbol);
            }else{
                others.append(others);

            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
