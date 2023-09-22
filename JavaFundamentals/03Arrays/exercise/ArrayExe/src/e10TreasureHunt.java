import java.util.Arrays;
import java.util.Scanner;

public class e10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chest = scanner.nextLine().split("|");
        String command = scanner.nextLine();

        while(!command.equals("Yohoho!")){
            String[] commandParts = command.split(" ");

            if(command.contains("Loot")){
                for (int i = 0; i < commandParts.length; i++) {
                    boolean alreadyIn = false;
                    for (int j = 0; j < chest.length ; j++) {
                        if(commandParts[i].equals(chest[j])){
                            alreadyIn = true;
                            break;
                        }
                        
                    }
                    if(!alreadyIn){
                        String newChest = commandParts[i]+ " " + String.join(" ",chest);
                        chest = newChest.split(" ");
                    }
                    
                }

            }else if(command.contains("Drop")){
                int position = Integer.parseInt(commandParts[0]);




            }else if(command.contains("Steal")){


            }

        }



    }
}
