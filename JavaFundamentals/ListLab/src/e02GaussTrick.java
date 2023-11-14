import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        for (int i = 0; i < numbers.size() /2; i++) {

            numbers.set(i, (numbers.get(i) + numbers.get(numbers.size()-i-1)));

            System.out.print(numbers.get(i) + " ");

        }

        if(numbers.size() % 2 != 0){
            System.out.print(numbers.get(numbers.size()/2 ));
        }




    }
}
