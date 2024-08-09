package code.with.vanilson.creational.factory_method;

import java.util.Calendar;

/**
 * FactoryMethodDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}