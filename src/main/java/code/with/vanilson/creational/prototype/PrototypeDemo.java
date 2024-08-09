package code.with.vanilson.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * PrototypeDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        String sql = "SELECT * FROM movies where title=?";
        List<String> params = new ArrayList<>();
        params.add("Star wars");

        Record record = new Record();
        Statement firstStatement = new Statement(sql, params, record);
        System.out.println("First Statement sql: " + firstStatement.getSql());
        System.out.println("First Statement params: " + firstStatement.getParameters());
        System.out.println("First Statement record: " + firstStatement.getRecord());

        Statement secondeStatement = firstStatement.clone();

        System.out.println("\nSecond Statement sql: " + secondeStatement.getSql());
        System.out.println("Second Statement params: " + secondeStatement.getParameters());
        System.out.println("Second Statement record: " + secondeStatement.getRecord());

    }
}