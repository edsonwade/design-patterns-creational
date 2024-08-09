package code.with.vanilson.creational.factory_method;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Website
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
@Getter
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    /* This method is called when the website is created and initialized.*/
    public abstract void createWebsite();
}