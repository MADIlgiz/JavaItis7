package com.company;

import java.sql.*;
import java.util.Scanner;


public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/Java_itis_7";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qweasdzxcvbn";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = 0;
            System.out.println("1. добавить пользователя");
            System.out.println("2. добавить пользователю машину");
            System.out.println("3. посмотреть всех пользователей");
            System.out.println("4. посмотреть все машины");
            System.out.println("5. выход");
            command = scanner.nextInt();
            switch (command) {
                case 5: {
                    System.exit(0);
                }
                break;
                case 1: {
                    Statement statement = connection.createStatement();
                    // запускаем выражение и получаем результирующе множество
                    // пока в resultSet что-то есть
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    System.out.println("Введите Возраст:");
                    int age = scanner.nextInt();
//        statement
//                .executeUpdate("INSERT INTO owner(name, age) VALUES " +
//                "('" + name + "', " + age + ");");
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO owner(name, age) VALUES (?, ?)");
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.execute();
                }
                break;
                case 2: {
                    Statement statement = connection.createStatement();
                    // запускаем выражение и получаем результирующе множество
                    // пока в resultSet что-то есть
                    System.out.println("Введите марку:");
                    String name = scanner.next();
                    System.out.println("Введите цвет:");
                    String color = scanner.next();
                    System.out.println("Введите id пользователя:");
                    int id = scanner.nextInt();
//        statement
//                .executeUpdate("INSERT INTO owner(name, age) VALUES " +
//                "('" + name + "', " + age + ");");
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO car(model, color, owner_id ) VALUES (?, ?, ?)");
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, color);
                    preparedStatement.setInt(3, id);
                    preparedStatement.execute();
                }
                break;
                case 3: {
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM owner;");
                    // пока в resultSet что-то есть
                    while (resultSet.next()) {
                        // печатаем текущую строку resultSet
                        // двигаем дальше
                        System.out.println(
                                resultSet.getInt("id") + " " +
                                        resultSet.getString("name") + " " +
                                        resultSet.getInt("age")
                        );
                    }
                }
                break;
                case 4: {
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM car;");
                    // пока в resultSet что-то есть
                    while (resultSet.next()) {
                        // печатаем текущую строку resultSet
                        // двигаем дальше
                        System.out.println(
                                resultSet.getInt("id") + " " +
                                        resultSet.getString("model") + " " +
                                        resultSet.getString("color") + " " + resultSet.getInt("owner_id"));
                    }
                }
                break;
            }

        }
    }

}
