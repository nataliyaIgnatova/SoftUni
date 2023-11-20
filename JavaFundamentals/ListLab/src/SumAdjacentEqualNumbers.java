import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Double::parseDouble)
                .collect(Collectors.toList());



        for (int i = 0; i < numbers.size()-1; i++) {

            if (numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbers, " "));

    }
    public static String joinElementsByDelimiter(List<Double> list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
           String numberDf  = df.format(item) + delimiter;
           result += numberDf;

        }
        return result;
    }


}