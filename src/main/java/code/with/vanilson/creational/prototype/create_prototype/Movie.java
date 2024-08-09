package code.with.vanilson.prototype.create_prototype;

import lombok.*;

/**
 * Movie
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-09
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Movie extends code.with.vanilson.prototype.create_prototype.Item {
    private String runtime;
}