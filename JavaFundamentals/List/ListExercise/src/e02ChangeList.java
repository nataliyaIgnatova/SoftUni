import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            String [] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command){
                case "Delete":
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    for (int i = 0; i < numberList.size(); i++) {


                        if(numberList.get(i) == numberToRemove){
                            numberList.remove(numberList.get(i));
                            i = i -1;
                        }

            }
                    break;
                case "Insert":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);

                    numberList.add(index, numberToAdd);

                    break;

        }

        input = scanner.nextLine();
    }

        System.out.println(numberList.toString().replaceAll("[\\[\\],]",""));
}
}
