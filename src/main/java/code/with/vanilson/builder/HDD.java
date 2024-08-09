package code.with.vanilson.builder;

/**
 * HDD
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
public enum HDD {
    DEFAULT(1024),
    UPGRADE(2048),
    MAX(4096);

    private int size;

    HDD(int size) {
        this.size = size;
    }
}