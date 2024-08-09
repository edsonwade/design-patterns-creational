package code.with.vanilson.creational.singleton;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DbSingleton
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
@Slf4j
public class DbSingleton {
    // Using Eager Initialization
    //private static DbSingleton instance = new DbSingleton();

    private Connection conn = null;

    // Using Lazy Initialization with Double-Checked Locking (DCL)
    private static class LazyHolder {
        private static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        // Prevent instantiation from outside the class
        try {
            String jdbc = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(jdbc);
        } catch (SQLException e) {

            log.error("Error while creating DB connection {}", e.getMessage());
        }
    }

    public static DbSingleton getInstance() {
        // Double-Checked Locking (DCL) optimization lazy loaded and thread safety at the same time.
        return LazyHolder.INSTANCE;
    }
    public Connection getConnection() {
        return conn;
    }

}