package code.with.vanilson.creational.factory_method;

/**
 * Shop
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}