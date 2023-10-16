import java.util.*;
import java.util.stream.Collectors;

public class e03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();


            for (int i = 0; i < Math.min(numbers1.size(), numbers2.size()); i++) {

                result.add(i+i, numbers1.get(i));
                result.add(i+1+i, numbers2.get(i));
            }
        if(numbers1.size() > numbers2.size()){
            result.addAll(getRemainingElements(numbers1,numbers2));
        } else if (numbers2.size() > numbers1.size()) {
            result.addAll(getRemainingElements(numbers2,numbers1));

        }

        for (Integer number : result) {
            System.out.print(number + " ");

        }


    }

    private static Collection<Integer> getRemainingElements
            (List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = shorterList.size(); i < longerList.size(); i++) {
            numbers.add(longerList.get(i));


        }
        return numbers;
    }

}
