import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commandsNumber; i++) {
            String command = scanner.nextLine();
            String [] commandArr = command.split(" ");
            String guestName = commandArr[0];

            if(command.contains("is going!")){

                if(guests.contains(guestName)){
                    System.out.printf("%s is already in the list!%n", guestName);
                }else{
                guests.add(guestName);
                }

            } else if (command.contains("is not going!")) {

                if(guests.contains(guestName)){
                    guests.remove(guestName);
                }else{
                    System.out.printf("%s is not in the list!%n", guestName);
                }

            }

        }
       for(String name : guests){
           System.out.println(name);
       }



    }
}
