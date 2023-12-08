import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e09PockemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


        int sum = 0;

        while (numbers.size()  > 0){
           int indexToRemove = Integer.parseInt(scanner.nextLine());
            int indexValue = 0;
           if(indexToRemove < 0){
               indexValue = numbers.get(0);
               numbers.set(0,numbers.get(numbers.size())-1);
           }else if(indexToRemove > numbers.size()-1){
               indexValue = numbers.get(numbers.size()-1);
               numbers.set(numbers.size()-1, numbers.get(0) );

           }else{
               indexValue = numbers.get(indexToRemove);
               numbers.remove(numbers.get(indexToRemove));
           }

            sum+= indexValue;

            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) <= indexValue ){
                    numbers.set(i, numbers.get(i)+indexValue);

                }else {
                    numbers.set(i, numbers.get(i) - indexValue);
                }

            }



        }
        System.out.println(sum);
    }
}
