import java.util.Scanner;

public class E1StudentInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.next());
        double grade = Double.parseDouble(sc.next());

        String format = String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);

        System.out.println(format);










    }
}