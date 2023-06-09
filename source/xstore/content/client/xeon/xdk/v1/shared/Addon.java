package xstore.content.client.xeon.xdk.v1.shared;

public interface Addon {
	public String name();
	public short[] version();
	public AddonKind kind();
}
