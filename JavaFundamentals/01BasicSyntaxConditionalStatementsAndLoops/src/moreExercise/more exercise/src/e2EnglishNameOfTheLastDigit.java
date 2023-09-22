import java.util.Scanner;

public class e2EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



            int currentNumber = n % 10;

            if(currentNumber == 0){
                System.out.println("zero");
            }else if(currentNumber == 1){
                System.out.println("one");
            }else if (currentNumber == 2){
                System.out.println("two");
            }else if (currentNumber == 3){
                System.out.println("three");
            } else if (currentNumber == 4) {
                System.out.println("four");
            }else if (currentNumber == 5) {
                System.out.println("five");
            }else if (currentNumber == 6) {
                System.out.println("six");
            }else if (currentNumber == 7) {
                System.out.println("seven");
            }else if (currentNumber == 8) {
                System.out.println("eight");
            }else {
                System.out.println("nine");
            }



        }
    }

