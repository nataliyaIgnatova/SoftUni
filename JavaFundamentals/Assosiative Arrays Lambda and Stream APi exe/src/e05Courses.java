import java.util.*;

public class e05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> courseCount = new LinkedHashMap<>();
        Map<String, String> courseStudents = new LinkedHashMap<>();

        while (!input.equals("end")){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            courseCount.putIfAbsent(course, 0);
            courseCount.put(course, courseCount.get(course)+1);
            courseStudents.put(student, course);


            input = scanner.nextLine();
        }

        for (Map.Entry<String,Integer> entry: courseCount.entrySet()) {
            System.out.println(entry.getKey()+": " + entry.getValue());

                for (Map.Entry<String, String> entryTwo : courseStudents.entrySet()) {
                    if(!entryTwo.getValue().equals(entry.getKey())){
                        continue;
                    }
                    System.out.println("-- " + entryTwo.getKey());
                }
            }

    }
}
