import java.util.*;
import java.util.stream.Collectors;

public class e07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> input =  Arrays
                            .stream(scanner.nextLine().split("\\|"))
                            .collect(Collectors.toList());

        List<String> newList = new ArrayList<>();

        for (int i = input.size()-1; i >= 0 ; i--) {

            String[] numbers = input.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if(!numbers[j].equals("")){
                    newList.add(numbers[j]);
                }

            }

        }

        System.out.println(newList.toString().replaceAll("[\\[\\],|\\\\s+]",""));

    }
}
