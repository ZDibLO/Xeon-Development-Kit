package xstore.content.client.xeon.xdk.v1.impl;

public class ImplSpec {
	private final boolean is_static;
	private final String name;
	private final IMPL_TYPE type;
	private final String arg[]; //optional
	
	private final int hash;
	
	public ImplSpec(boolean is_static, String name, IMPL_TYPE type) {
		this.is_static = is_static;
		this.name = name;
		this.type = type;
		this.arg = null;
		this.hash = name.hashCode() * type.hashCode() * (is_static ? 1 : 0);
	}
	
	public ImplSpec(boolean is_static, String name, IMPL_TYPE type, String arg[]) {
		this.is_static = is_static;
		this.name = name;
		this.type = type;
		this.arg = arg;
		this.hash = name.hashCode() * type.hashCode() * (is_static ? 1 : 0);// we dont account in our hashcode arguments
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof ImplSpec)) return false;
		ImplSpec co = (ImplSpec)obj;
		return co.hash == this.hash;
	}
	
	@Override
	public int hashCode() {
		return hash;
	}

	public static enum IMPL_TYPE {
		FIELD, METHOD
	}
}
