package code.with.vanilson.creational.builder;

/**
 * RAM
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
public enum RAM {
    DEFAULT(512),
    UPGRADE(1024),
    MAX(2048);

    private int size;

    RAM(int size) {
        this.size = size;
    }
}