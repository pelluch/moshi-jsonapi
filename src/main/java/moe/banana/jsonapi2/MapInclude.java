package moe.banana.jsonapi2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by pablo on 6/21/17.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MapInclude {
    String includeName();
    String foreignKey();
    boolean isArray() default false;
}
