package xstore.content.client.xeon.xdk.v1.shared;

public enum XDKPluginVersion {
	XDK_100("XDK 1.0.0", 1, 0, 0);
	
	public final String name;
	public final int version, major, minor;
	private XDKPluginVersion(String name, int version, int major, int minor) {
		this.name = name;
		this.version = version;
		this.major = major;
		this.minor = minor;
	}
	
}
