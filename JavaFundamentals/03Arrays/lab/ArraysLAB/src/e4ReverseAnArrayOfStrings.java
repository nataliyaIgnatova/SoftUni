import java.util.Scanner;

public class e4ReverseAnArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] textArr = scanner.nextLine().split(" ");

        for (int i = 0; i < textArr.length / 2; i++) {
            String oldElement = textArr[i];
            textArr [i] = textArr[textArr.length - 1 -i];
            textArr[textArr.length - 1 - i] = oldElement;

        }
        System.out.println(String.join(" ",textArr));

    }
}
