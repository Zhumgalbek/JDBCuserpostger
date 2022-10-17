package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
//    private static final String user = "postgres";
//    private static final String password = "1234";
//    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
//
//    public static Connection connect() throws SQLException {
//
//        return DriverManager.getConnection(url, user, password);
//    }

    public final Connection connection;
    public Util() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "1234"
        );
    }
    public  Connection getConnection() {
        return connection;
    }
    // реализуйте настройку соеденения с БД

}
