package code.with.vanilson.creational.singleton;

/**
 * Singleton
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
public class Singleton {

    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime); // java.lang.Runtime@6ce253f1

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance); //java.lang.Runtime@6ce253f1

        if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}