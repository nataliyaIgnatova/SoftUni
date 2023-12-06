import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> playerTwo =  Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sum = 0;
        while (playerOne.size()-1 >= 0 && playerTwo.size()-1 >= 0){
            int cardOne = playerOne.get(0);
            int cardTwo = playerTwo.get(0);

            if(cardOne > cardTwo){
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);
            } else if (cardTwo > cardOne) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerOne.remove(0);
                playerTwo.remove(0);

            } else {
                playerOne.remove(0);
                playerTwo.remove(0);
            }
        }

        if(playerOne.size() > 0){
            for (int i = 0; i < playerOne.size(); i++) {
                sum += playerOne.get(i);

            }
            System.out.printf("First player player wins! Sum: %d", sum);
        }else{
            for (int i = 0; i < playerTwo.size(); i++) {
                sum+= playerTwo.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
