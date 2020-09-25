import jdk.swing.interop.SwingInterOpUtils;

import java.sql.*;

public class PSQL {
    public static final String userName = "Postgres";
    public static final String password = "5432";
    public static final String URL = "jdbc:postgresql://localhost:5432/testdb";


    public static void main(String[] args) {


    }

//    private static void printDataTable() {
//        try(Connection connection = DriverManager.getConnection(URL, userName, password);) {
//            System.out.println("Connection is working");
//
//            System.out.println("print all from table car");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM CAR");
//            System.out.printf("%-20s %-20s %-20s",
//                    "Model", "Price", "Color");
//            while (resultSet.next()) {
//                System.out.printf("%-20s %-20s %-20s",
//                        resultSet.getString("model"),
//                        resultSet.getString("price"),
//                        resultSet.getString("color"));
//            }
//            connection.close();
//
//        } catch (SQLException a) {
//            a.printStackTrace();
//        }
//    }
//
//    public static void insert(String model, String color, Long price) {
//try (Connection connection = DriverManager.getConnection(URL, userName, password);) {
//    System.out.println("Add row into table Car");
//    Statement statement = connection.createStatement();
//    statement.executeQuery(String.format(("INSER INTO CAR( model, price, color) VALUES ("));
//    statement.;
//}
//    }
//
//    public static void removeCarByParametres(String model, long price, String color) {
//        try(Connection connection = DriverManager.getConnection(URL, userName, password);) {
//            System.out.println("Connection is working");
//
//            System.out.println("print all from table car");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM CAR");
//            System.out.printf("%-20s %-20s %-20s",
//                    "Model", "Price", "Color");
//            while (resultSet.next()) {
//                System.out.printf("%-20s %-20s %-20s",
//                        resultSet.getString("model"),
//                        resultSet.getString("price"),
//                        resultSet.getString("color"));
//            }
//            connection.close();
//
//        } catch (SQLException a) {
//            a.printStackTrace();
//        }
//    }

}
