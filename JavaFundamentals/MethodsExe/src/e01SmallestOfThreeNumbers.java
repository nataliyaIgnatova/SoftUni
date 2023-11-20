import java.util.Scanner;

public class e01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(n1, n2, n3);
    }

    public static void printSmallestNumber (int number1,int number2, int number3){

        if(number1 < number2 && number1 < number3){
            System.out.println(number1);
        } else if (number2 < number1 && number2 < number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }
}