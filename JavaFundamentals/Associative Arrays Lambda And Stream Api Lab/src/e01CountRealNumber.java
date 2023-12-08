import java.text.DecimalFormat;
import java.util.*;

public class e01CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

        TreeMap<Double, Integer> countsMap = new TreeMap<>();

        for (double number : numbers) {
            if(!countsMap.containsKey(number)){
                countsMap.put(number, 1);
            }else{
                int value = countsMap.get(number);
                countsMap.put(number, value + 1);
            }

        }
        for (Map.Entry<Double, Integer> entry : countsMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            double num = entry.getKey();
            System.out.printf("%s -> %d%n", df.format(num), entry.getValue());
        }


    }
}