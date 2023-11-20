import java.util.Scanner;

public class e1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumPeople =0;
        int[] peopleArr = new int[n];

        for (int i = 0; i < n; i++) {

            int people = Integer.parseInt(scanner.nextLine());
            sumPeople+=people;


            peopleArr[i] = people;

            System.out.printf("%d ",peopleArr[i]);
        }
        System.out.printf("%n%d",sumPeople);





    }
}