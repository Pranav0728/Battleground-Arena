package jdbc.util;
import jdbc.config.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // IMPORTANT

            return DriverManager.getConnection(
                    DBConfig.URL,
                    DBConfig.USER,
                    DBConfig.PASSWORD
            );

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
