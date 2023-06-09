package xstore.content.client.xeon.xdk.v1.annotate;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(FIELD)
public @interface Include {
//determines that this addon will be included while indexing plugin
}