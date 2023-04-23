package model;

import enummeration.Division;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /*HotelManagement hotelManagement = new HotelManagement("Hilton", 200);
       Chef chef = new Chef(101, "Paul", "Smith", 60000,101, 1);
       Server server = new Server(201, "Jessica", "Younger", 40000, 101, 1);
       Table table = new Table(1, 201, 101);
       Menu menu = new Menu(1, "Fish and Chips", 12.99);
       Customer customer = new Customer(101, "Jones", 101, 101, 101);
       Bill bill = new Bill(101, 101, 30.00);
       Order order = new Order(101, 1, "Fish & Chips", 2, 101, 201);
       Card card = new Card(101, 101);
       Cash cash = new Cash(101, 102);*/

        HouseCleaner emp1 = new HouseCleaner(101, 1, "Jessica", "Marshal", 30000, Division.HOUSE_CLEANER);
        Manager emp2 = new Manager(102, 1, "John", "Smith", 60000, Division.MANAGEMENT);
        Receptionist emp3 = new Receptionist(103, 1, "Rebecca", "Jones", 40000, Division.RECEPTIONIST);
        Chef chef1 = new Chef(101, "Paul", "Smith", 60000, 101, 1);
        Server server1 = new Server(201, "Jessica", "Younger", 40000, 101, 1);

        System.out.println(emp1);


        Hotel hotel1 = new Hotel("Hilton", 100);
        Hotel hotel2 = new Hotel("Hilton", 100);
        Hotel hotel3 = new Hotel("Marriott", 200);

        if (hotel1.equals(hotel2)) {
            System.out.println("Hotel1 = Hotel2");
        } else {
            System.out.println("Hotel1 != Hotel2");
        }
            System.out.println("Hotel1: " + hotel1.hashCode() + " Hotel2: " + hotel2.hashCode());

        if (hotel1.equals(hotel3)) {
            System.out.println("Hotel1 = Hotel3");
        } else {
            System.out.println("Hotel1 != Hotel3");
        }

    System.out.println("Hotel1: " + hotel1.hashCode() + " Hotel3: " + hotel3.hashCode());


   Map<Hotel, Double> hotels = new HashMap<>();
       hotels.put((Hotel) hotel1, 22.5);
       hotels.put((Hotel) hotel2, 25.4);

       Hotel hotel4 = new Hotel("Hilton", 100);
       boolean result = hotels.containsKey(hotel4);
       System.out.println("result " + result);
       System.out.println(hotel2.equals(hotel1));

       System.out.println("Hotel1: " + hotel1.hashCode() + " Hotel2: " + hotel2.hashCode());

    }
}
