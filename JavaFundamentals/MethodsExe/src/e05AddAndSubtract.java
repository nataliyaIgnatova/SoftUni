import java.util.Scanner;

public class e05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = getSubtract(firstNumber,secondNumber,thirdNumber);
        System.out.println(result);
    }

    public static int getSumOfFirst (int n1, int n2){

        return n1 + n2;
    }
    public static int getSubtract(int n1, int n2, int n3){
        return getSumOfFirst(n1,n2) - n3;
    }
}
