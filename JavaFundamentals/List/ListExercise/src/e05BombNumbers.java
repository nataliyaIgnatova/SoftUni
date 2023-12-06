import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String bombAndPower = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            String[] arr = bombAndPower.split(" ");
            int bombNumber = Integer.parseInt(arr[0]);
            int power = Integer.parseInt(arr[1]);

            if(numbers.get(i) == bombNumber){

                for (int j = i + 1; j <= i + power ; j++) {
                    if(j >= 0 && j <= numbers.size()-1){
                    numbers.remove(j);


                } else{
                    continue;
                }
                }
                    for (int k = i-1; k >= i-power ; k--) {
                        if(k >= 0 && k <= numbers.size()-1){
                            numbers.remove(k);
                        }else{
                            continue;
                        }

                    }

                for (int j = 0; j < numbers.size(); j++) {
                    if(bombNumber == numbers.get(j)){
                        numbers.remove(j);
                        break;
                    }

                }



        }

    }
        for (int i = 0; i < numbers.size() ; i++) {

            sum+= numbers.get(i);

        }

        System.out.println(sum);
}
}
