package xstore.content.client.xeon.xdk.v1.annotate;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import xstore.content.client.xeon.xdk.v1.shared.XDKPluginVersion;

@Retention(CLASS)
@Target(TYPE)
public @interface XDKPlugin {
	public XDKPluginVersion version();
}
