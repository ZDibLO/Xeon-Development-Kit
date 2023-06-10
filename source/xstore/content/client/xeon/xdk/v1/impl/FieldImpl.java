package xstore.content.client.xeon.xdk.v1.impl;

public interface FieldImpl<R, P> {
	public R get(P parent);
	public R set(P parent);
}