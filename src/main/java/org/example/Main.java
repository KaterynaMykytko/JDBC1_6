package org.example;

import java.sql.SQLException;

import static org.example.DBConnector.update;

public class Main {
    public static void main(String[] args) throws SQLException {

        Customer customer = new Customer(1, "Kateryna", "Mykytko",
                "Chernihiv", 35446676);

        Customer customer2 = new Customer(2, "Yuliya", "Piven",
                "Kiev", 24325544);

        Customer customer3 = new Customer(3, "Ksenia", "Alekseeva",
                "Chernihiv", 12345657);

        Customer customer4 = new Customer(4, "Yuriy", "Veligorskiy",
                "Warshaw", 23454456);

        //insert(customer);
        //insert(customer2);
        //insert(customer3);
        //insert(customer4);
        //deleteById(4);
        update(1);
    }
}