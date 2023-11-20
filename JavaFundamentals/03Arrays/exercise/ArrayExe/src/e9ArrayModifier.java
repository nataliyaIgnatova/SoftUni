import java.util.Arrays;
import java.util.Scanner;

public class e9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();



        while(!command.equals("end")){

            if (command.contains("swap")){
                //превръщаме комндата в масив и взимаме съответните числа на индексите,които се намират
                int index1 =Integer.parseInt(command.split(" ")[1]);
                int index2 =Integer.parseInt(command.split(" " )[2]);

                int element1 = numberArr[index1];
                int element2 = numberArr[index2];

                //размяна
                numberArr[index1] = element2;
                numberArr[index2] = element1;



            }else if(command.contains("multiply")){
                int index1 =Integer.parseInt(command.split(" ")[1]);
                int index2 =Integer.parseInt(command.split(" ")[2]);

                int element1 = numberArr[index1];
                int element2 = numberArr[index2];

                int multiply = element1 * element2;
                numberArr[index1]=multiply;

            }else if(command.contains("decrease")){

                for (int i = 0; i < numberArr.length; i++) {
                    //numberArr[i]--;
                    //numberArr[i]-=1
                    int currentNumber = numberArr[i];
                    int decrease = currentNumber - 1;
                    numberArr[i] = decrease;

                }

            }


            command = scanner.nextLine();
        }

        for (int i = 0; i < numberArr.length; i++) {
            int currentNmber = numberArr[i];

            if(i != numberArr.length-1) {
                System.out.print(currentNmber + ", ");
            }else{//ako сме на последното число
                System.out.print(currentNmber);
            }
        }





    }
}
