import java.util.*;

public class e04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> userRegister = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String commands = scanner.nextLine();
            String command = commands.split("\\s+")[0];
            String user = commands.split("\\s+")[1];


            if(command.equals("register")){
                String license = commands.split("\\s+")[2];

                if(userRegister.containsKey(user)){
                    System.out.printf("ERROR: already registered with plate number %s%n", userRegister.get(user));
                }else{
                userRegister.putIfAbsent(user, license);
                    System.out.printf("%s registered %s successfully%n",user, userRegister.get(user));
                }
            } else if (command.equals("unregister")) {

                if(!userRegister.containsKey(user)){
                    System.out.printf("ERROR: user %s not found%n", user);
                }else{
                    System.out.printf("%s unregistered successfully%n", user);
                    userRegister.remove(user);

                }
                
            }

        }

        userRegister.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
