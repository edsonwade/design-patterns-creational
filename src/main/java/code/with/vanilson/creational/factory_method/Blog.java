package code.with.vanilson.creational.factory_method;

/**
 * Blog
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}