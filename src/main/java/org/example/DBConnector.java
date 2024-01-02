package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class DBConnector {
        private static Connection connection;
        public static final String URL = "jdbc:mysql://localhost:3306/NewDB?serverTimezone=CET";
        public static final String USER_NAME = "jdbc_user";
        public static final String PASSWORD = "1234567890";

        public static Connection getConnection() throws SQLException {
            if (Objects.isNull(connection)) {
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            }
            return connection;
        }


    public static void insert(Customer customer) throws SQLException {
        String query = "INSERT INTO Customer(customerId, firstName, lastName, city, phone) " +
                "VALUES(?,?,?,?,?)";

        PreparedStatement statement = getConnection().prepareStatement(query);

        statement.setInt(1, customer.getCustomerId());
        statement.setString(2, customer.getFirstName());
        statement.setString(3, customer.getLastName());
        statement.setString(4, customer.getCity());
        statement.setInt(5, customer.getPhone());

        try (statement) {
            statement.executeUpdate();
        }
    }
    public static void deleteById(int id) throws SQLException {
        String query = "DELETE FROM customer WHERE customerId = ?";
        PreparedStatement statement = getConnection().prepareStatement(query);
        statement.setInt(1, id);

        try (statement) {
            statement.executeUpdate();
        }

    }
    public static void update(int id) throws SQLException {
        String query = "UPDATE Customer SET city = 'Oslo' WHERE customerId = ?";
        PreparedStatement statement = getConnection().prepareStatement(query);
        statement.setInt(1, id);

        try (statement) {
            statement.executeUpdate();
        }
    }

}
