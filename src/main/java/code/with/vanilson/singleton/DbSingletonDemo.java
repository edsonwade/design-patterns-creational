package code.with.vanilson.singleton;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DbSingletonDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
@Slf4j
public class DbSingletonDemo {

    public static void main(String[] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

//        DbSingleton anotherInstance = DbSingleton.getInstance();
//        System.out.println(anotherInstance);

        // Perform database operations
        Connection conn = instance.getConnection();
        Statement statement = conn.createStatement();

        statement.execute("CREATE TABLE IF NOT EXISTS  students(id int primary key  ,name varchar(65))");
        log.info("Created table students");

        System.out.println("Created table students");
        int rows = statement.executeUpdate("insert into students(id,name) values(1, 'John') , (2,'wayne')");
        if (rows > 0) {
            log.info("Inserted a new row.");
        }
       //
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
        while (resultSet.next()) {
            System.out.printf("ID: %d, Name: %s%n", resultSet.getInt("id"),
                    resultSet.getString("name"));
        }

        // Use the connection and statement...
        // Remember to close resources after use
        conn.close();
        statement.close();
        resultSet.close();

    }
}