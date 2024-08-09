package code.with.vanilson.creational.factory_method;

import static code.with.vanilson.creational.factory_method.WebsiteType.BLOG;
import static code.with.vanilson.creational.factory_method.WebsiteType.SHOP;

/**
 * WebsiteFactory
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
        };
    }

}