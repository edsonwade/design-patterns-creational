package code.with.vanilson.prototype.create_prototype;

/**
 * PrototypeDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        code.with.vanilson.prototype.create_prototype.Registry
                registry = new code.with.vanilson.prototype.create_prototype.Registry();
        code.with.vanilson.prototype.create_prototype.Movie movie =(code.with.vanilson.prototype.create_prototype.Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println("movie " + movie);
        System.out.println(" movie runtime " + movie.getRuntime());
        System.out.println(" movie title " + movie.getTitle());
        System.out.println(" movie url " + movie.getUrl());

        code.with.vanilson.prototype.create_prototype.Movie
                anotherMovie = new code.with.vanilson.prototype.create_prototype.Movie();
        anotherMovie.setTitle("Gang of four");

        System.out.println("movie  " + anotherMovie);
        System.out.println(" anotherMovie runtime " + anotherMovie.getRuntime());
        System.out.println(" anotherMovie title " + anotherMovie.getTitle());
        System.out.println(" anotherMovie url " + anotherMovie.getUrl());
    }
}