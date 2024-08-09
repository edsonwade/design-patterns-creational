package code.with.vanilson.prototype.create_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class Registry {
    private Map<String, code.with.vanilson.prototype.create_prototype.Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public code.with.vanilson.prototype.create_prototype.Item createItem(@SuppressWarnings("unused") String type) {
        code.with.vanilson.prototype.create_prototype.Item item = null;
        try {
            item = (code.with.vanilson.prototype.create_prototype.Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return item;
    }

    private void loadItems() {
        code.with.vanilson.prototype.create_prototype.Movie
                movie = new code.with.vanilson.prototype.create_prototype.Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(10.0);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        code.with.vanilson.prototype.create_prototype.Book
                book = new code.with.vanilson.prototype.create_prototype.Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Harry Potter and the Philosopher's Stone");
        items.put("Book", book);
    }
}