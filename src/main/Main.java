package main;

import customer.Customer;
import customer_service.CustomerService;

public class Main {
    public static void main(String[] args) {
        Customer<Integer, String, String> customere = new Customer(1, "Tuan", "122 to 24C");
        Integer id = customere.getID();
        String name = customere.getName();
        String address = customere.getAddress();

        System.out.println("ID: "+id + " Ten: " + name + " Dia chi: " + address);
    }

}
