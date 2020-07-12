package com.codem.dynamicDatabase.annotation;
import java.lang.annotation.*;


@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

    String value();

}
