import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e10SoftUniPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split("\\,\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        boolean isTrue = true;

        while (!command.equals("course start")){

            if(command.contains("Add")){
                String course = command.split(":")[1];
                for (int i = 0; i < courses.size(); i++) {

                    if(course.equals(courses.get(i))){
                       isTrue = false;
                       break;
                    }
                }
                if(isTrue){
                    courses.add(course);
                }
            } else if (command.contains("Insert")) {
                String course = command.split(":")[1];
                int indexToInsert = Integer.parseInt(command.split(":")[2]);

                courses.add(indexToInsert, course);
            } else if (command.contains("Remove")) {
                String courseToRemove = command.split(":")[1];

                for (int i = 0; i < courses.size(); i++) {

                    if (courseToRemove.equals(courses.get(i))){
                        courses.remove(courses.get(i));
                    }

                }
            } else if (command.contains("Swap")) {
                String courseOne = command.split(":")[1];
                String courseTwo = command.split(":")[2];
                int index1 = 0;
                int index2 = 0;

                for (int i = 0; i < courses.size()-1; i++) {

                    if(courseOne.equals(courses.get(i))){

                        index1 = i;
                    }
                    if(courseTwo.equals(courses.get(i))){
                        index2 = i;
                    }

                }

                  courses.set(index1, courseTwo);
                  courses.set(index2, courseOne);




            }else if(command.contains("Exercise")){
                String course = command.split(":")[1];


                for (int i = 0; i < courses.size(); i++) {

                    if(course.equals(courses.get(i))){
                        isTrue = true;
                    }else{
                        isTrue = false;
                    }

                }
                if (isTrue == false) {
                    courses.add(course);
                    courses.add(course+"-Exercise");

                }
                }


            command = scanner.nextLine();

            }

        for (int i = 0; i < courses.size(); i++) {

            System.out.println(i + 1 + "." + courses.get(i));

        }
    }
}
