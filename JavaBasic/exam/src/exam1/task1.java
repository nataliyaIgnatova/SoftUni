package exam1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        int countTransportCards = Integer.parseInt(scanner.nextLine());
        int countMuseumTickets = Integer.parseInt(scanner.nextLine());

        double priceNights = 20;
        double priceTransport = 1.60;
        double priceMuseum = 6;


        double AllNights = countNights * priceNights;
        double AllCards = countTransportCards * priceTransport;
        double AllTickets = countMuseumTickets * priceMuseum;

        double sumOnePerson = AllNights + AllCards + AllTickets;
        double sumGroup = countPeople * sumOnePerson;
        double finalSum = sumGroup + sumGroup * 25/100;

        System.out.printf("%.2f", finalSum);


    }
}
