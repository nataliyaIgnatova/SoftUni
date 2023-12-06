import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    if(index >= 0 && index <= numbers.size()-1){
                        numbers.add(index, numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandArr[1]);

                    if(indexToRemove >= 0 && indexToRemove <= numbers.size()-1){
                        numbers.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String commandTwo = commandArr[1];
                    int count = Integer.parseInt(commandArr[2]);
                    switch (commandTwo){
                        case "left":
                            for (int i = 1; i <= count; i++) {
                                int firstNumber = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(firstNumber);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int lastNumber = numbers.get(numbers.size()-1);
                                numbers.remove(numbers.get(numbers.size()-1));
                                numbers.add(0,lastNumber);
                            }

                            break;
                    }
            }



            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
