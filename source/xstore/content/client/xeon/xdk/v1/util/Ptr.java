package xstore.content.client.xeon.xdk.v1.util;

public class Ptr<V> {
	public V value;
	public Ptr(V value) {
		this.value = value;
	}
	public void set(V value) {
		this.value = value;
	}
	public V get() {
		return value;
	}
	
	public static <T> Ptr<T> __ptr(T val) {
		return new Ptr(val);
	}
}
