package xstore.content.client.xeon.xdk.v1.util;

public interface ListObject<T> {
	public int size();
	public T get(int pos);
	public void remove(int index);
	public void removeObj(T obj);
}
