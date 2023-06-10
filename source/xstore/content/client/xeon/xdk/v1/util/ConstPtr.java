package xstore.content.client.xeon.xdk.v1.util;

public class ConstPtr<V> {
	public V value;
	public ConstPtr(V value) {
		this.value = value;
	}
	public V get() {
		return value;
	}
	
	public static <T> Ptr<T> __cptr(T val) {
		return new Ptr(val);
	}
}
