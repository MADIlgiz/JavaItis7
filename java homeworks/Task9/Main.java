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
            System.out.println("1. �������� ������������");
            System.out.println("2. �������� ������������ ������");
            System.out.println("3. ���������� ���� �������������");
            System.out.println("4. ���������� ��� ������");
            System.out.println("5. �����");
            command = scanner.nextInt();
            switch (command) {
                case 5: {
                    System.exit(0);
                }
                break;
                case 1: {
                    Statement statement = connection.createStatement();
                    // ��������� ��������� � �������� ������������� ���������
                    // ���� � resultSet ���-�� ����
                    System.out.println("������� ���:");
                    String name = scanner.next();
                    System.out.println("������� �������:");
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
                    // ��������� ��������� � �������� ������������� ���������
                    // ���� � resultSet ���-�� ����
                    System.out.println("������� �����:");
                    String name = scanner.next();
                    System.out.println("������� ����:");
                    String color = scanner.next();
                    System.out.println("������� id ������������:");
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
                    // ���� � resultSet ���-�� ����
                    while (resultSet.next()) {
                        // �������� ������� ������ resultSet
                        // ������� ������
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
                    // ���� � resultSet ���-�� ����
                    while (resultSet.next()) {
                        // �������� ������� ������ resultSet
                        // ������� ������
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
