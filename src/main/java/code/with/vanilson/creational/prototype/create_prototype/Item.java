package code.with.vanilson.prototype.create_prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Item
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
@Slf4j
@Getter
@Setter
public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}