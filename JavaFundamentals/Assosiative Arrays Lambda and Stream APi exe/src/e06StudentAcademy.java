import java.util.*;

public class e06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentsList = new LinkedHashMap<>();
        Map<String, Integer> countGrades = new LinkedHashMap<>();

        boolean isTrue = false;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentsList.containsKey(name)){
                studentsList.put(name, grade);
                countGrades.put(name, 0);

            }else{
                studentsList.put(name, studentsList.get(name)+ grade);
                countGrades.put(name,countGrades.get(name)+1);

            }



        }



    }


}



