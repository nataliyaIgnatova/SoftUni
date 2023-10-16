import java.math.BigDecimal;
import java.util.Scanner;

public class e04Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

       if(actionInput.equals("add")){
           System.out.println(printAdd(number1,number2));
       }  else if(actionInput.equals("multiply")){
            System.out.println(printMultiply(number1,number2));
        }  if(actionInput.equals("subtract")){
            System.out.println(printSubtract(number1,number2));
        }  if(actionInput.equals("divide")){


            System.out.println(printDivide(number1,number2));
        }
    }

    public static int printAdd(int num1, int num2){
        int result = num1 + num2;

        return result;
    }

    public static int printMultiply(int num1, int num2){
        int result = num1 * num2;

        return result;

    }
    public static int printSubtract( int num1, int num2){
        int result = num1 - num2 ;

        return result;

    }
    public static int printDivide(int num1, int num2){
       int result = num1 / num2;

       return result;

    }
}
