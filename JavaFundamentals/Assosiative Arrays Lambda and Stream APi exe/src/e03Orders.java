import java.util.*;

public class e03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        while(!data.equals("buy")){
            String name = data.split("\\s+")[0];
            double price = Double.parseDouble(data.split("\\s+")[1]);
            int quantity = Integer.parseInt(data.split("\\s+")[2]);

            productQuantity.putIfAbsent(name, 0);
            productQuantity.put(name, productQuantity.get(name) + quantity);
            productPrice.put(name, price);

            data = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry:productPrice.entrySet() ) {

            String productName = entry.getKey();
            double finalSum = productQuantity.get(productName) * productPrice.get(productName);

            System.out.printf("%s -> %.2f%n",productName, finalSum );


        }

    }
}
