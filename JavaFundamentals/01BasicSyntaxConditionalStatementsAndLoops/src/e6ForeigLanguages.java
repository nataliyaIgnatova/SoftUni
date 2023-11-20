import java.util.Scanner;

public class e6ForeigLanguages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if(country.equals("Usa") || country.equals("England")){

            System.out.println("English");
        }
        else if(country.equals("Spain") || country.equals("Mexico") || country.equals("Argentina") ){
            System.out.println("Spanish");
        }else {
            System.out.println("unknown");
        }




    }
}
