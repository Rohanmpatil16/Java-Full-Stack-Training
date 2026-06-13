package com.rohan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/tb1";
        String user = "root";
        String pass = "Rohan@12345";

        Connection connect = DriverManager.getConnection(url, user, pass);

        Statement state = connect.createStatement();

        String sql = "INSERT INTO tb11(city) VALUES ('ishwarpur')";

        int rowaffected = state.executeUpdate(sql);

        if (rowaffected > 0) {
            System.out.println("Data inserted successfully.");
        } else {
            System.out.println("Data not inserted.");
        }

        state.close();
        connect.close();
    }
}