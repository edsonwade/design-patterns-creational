package code.with.vanilson.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Statement
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
@Slf4j
@Getter
@Setter
public class Statement implements Cloneable {
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            Statement cloned = (Statement) super.clone();
            cloned.setRecord(this.record.clone());
            return cloned;
        } catch (CloneNotSupportedException e) {
            log.error("java Statement clone() throws CloneNotSupportedException{}", e.getMessage());

        }
        return null;
    }
}