import java.util.Scanner;

public class e12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(true){

            if(n % 2 != 0){
                System.out.println("Please write an even number.");
                n = Integer.parseInt(scanner.nextLine());
            }else {
                System.out.printf("The number is: %d",Math.abs(n));
                break;
            }

        }




    }
}
