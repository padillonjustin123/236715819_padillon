import java.sql.*;

public class Example {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database";
        String username = "username";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            // SQL query
            String sql = "SELECT * FROM users WHERE age > 18";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: " + name + " - Age: " + age);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
