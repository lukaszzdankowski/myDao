package pl.coderslab;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connection();
             Statement stat = conn.createStatement()){

            ResultSet rs = stat.executeQuery("select * from users");
            while (rs.next()){
                System.out.println(rs.getString("id") + " : " +
                        rs.getString("email") + " : " +
                        rs.getString("username") + " : " +
                        rs.getString("password"));
            }

        } catch (SQLException e) {
            System.out.println("ERROR in getConnection()");
        }
    }
}
