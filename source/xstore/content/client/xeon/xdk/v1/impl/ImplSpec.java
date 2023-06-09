package xstore.content.client.xeon.xdk.v1.impl;

public class ImplSpec {
	private final boolean is_static;
	private final String name;
	private final IMPL_TYPE type;
	private final String arg[]; //optional
	
	public ImplSpec(boolean is_static, String name, IMPL_TYPE type) {
		this.is_static = is_static;
		this.name = name;
		this.type = type;
		this.arg = null;
	}
	
	public ImplSpec(boolean is_static, String name, IMPL_TYPE type, String arg[]) {
		this.is_static = is_static;
		this.name = name;
		this.type = type;
		this.arg = arg;
	}
	
	public boolean is_static() {
		return is_static;
	}

	public String name() {
		return name;
	}

	public IMPL_TYPE type() {
		return type;
	}

	public String[] arg() {
		return arg;
	}

	public static enum IMPL_TYPE {
		FIELD, METHOD
	}
}
