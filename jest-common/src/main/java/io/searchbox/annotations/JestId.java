package io.searchbox.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Dogukan Sonmez
 */


@Inherited
@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JestId {
}
