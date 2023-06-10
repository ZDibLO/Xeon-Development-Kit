package xstore.content.client.xeon.xdk.v1.annotate;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(FIELD)
public @interface Constant {
//Constant doesn't really mean that passed value can't be set, it actually means that can't be set but via XDK, it can change on client side
}
