package com.rohan;

import java.sql.Connection;
import java.sql.*;




public class jdbc {

    // DB Credentials
    static final String URL = "jdbc:mysql://localhost:3306/JDBC_DEMO";
    static final String USER = "root";
    static final String PASS = "Rohan@12345";

    public static void main(String[] args) {
      
        insertStudent("Rohan", 95);
        insertStudent("Amit", 88);
        
        updateMarks(1,88);
        deleteStudent(1);
        readStudent();
        
    }

    static void readStudent() {

        String sql = "SELECT * FROM STUDENT";

        try (
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("ID") + " " +
                    rs.getString("NAME") + " " +
                    rs.getInt("MARKS")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static void insertStudent(String name, int marks) {

        String sql = "INSERT INTO STUDENT(NAME, MARKS) VALUES(?, ?)";

        try (
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(sql);
        ) {

            ps.setString(1, name);
            ps.setInt(2, marks);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static void updateMarks(int id, int newMarks) {

        String sql = "UPDATE STUDENT SET MARKS = ? WHERE ID = ?";

        try (
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(sql);
        ) {

            ps.setInt(1, newMarks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static void deleteStudent(int id) {

        String sql = "DELETE FROM STUDENT WHERE ID = ?";

        try (
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(sql);
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}