import java.util.Scanner;

public enum e6StrongNumbers {;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int startNumber = n;
            int currantNumber = 0;
            int factorialNumber = 1;
            int sumFactorial = 0;


            while ( n > 0){

                currantNumber = n % 10;

                for (int i = 1; i <= currantNumber ; i++) {

                    factorialNumber = factorialNumber * i;

                }

                sumFactorial+=factorialNumber;

                n = n /10;


            }


        if(sumFactorial == startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }




    }
}
