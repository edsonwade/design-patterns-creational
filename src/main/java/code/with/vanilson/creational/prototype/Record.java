package code.with.vanilson.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * Record
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
@Slf4j
public class Record implements Cloneable {
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("java Record clone() throws CloneNotSupportedException{}", e.getMessage());

        }
        return null;
    }
}