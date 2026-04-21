import java.sql.*;

public class DbConnection {


    private static Statement Helper() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://MYSQL_URL/SCHEMA_NAME", "root", "Password");
        return connection.createStatement();
    }


    public static void addUser(String name, String password) throws SQLException {
        Statement statement = Helper();
        int rowUpdateAdd = statement.executeUpdate("INSERT INTO users (username, password) VALUES ('" + name + "', '" + password + "')");

        if (rowUpdateAdd == 0) {
            System.out.println("Error adding user!");
        }
        else {
            System.out.println("User added with success!");
        }
    }


    public static void removeUser(String name) throws SQLException {
        Statement statement = Helper();
        int rowUpdateRemove = statement.executeUpdate("DELETE FROM users WHERE username = '" + name + "'");

        if (rowUpdateRemove == 0) {
            System.out.println("Error! There's no user with this name!");
        } else {
            System.out.println("User removed with success!");
        }
    }


    public static void seeUsers() throws SQLException {
        Statement statement = Helper();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

        while (resultSet.next()) {
            System.out.println("\nID: " + resultSet.getString("idusers"));
            System.out.println("Username: " + resultSet.getString("username"));
            System.out.println("Password: " + resultSet.getString("password") + "\n");
        }
    }
}