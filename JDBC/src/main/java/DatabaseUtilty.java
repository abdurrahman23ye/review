import java.sql.*;

public class DatabaseUtilty {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createconnection(){

        String url = "jdbc:mysql://localhost:3306/okul?serverTimezone=UTC";
        String user = "root";
        String password = "Murat34+";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
