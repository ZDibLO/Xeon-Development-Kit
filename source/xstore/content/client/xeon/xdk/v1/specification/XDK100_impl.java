package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.FieldImpl;
import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import xstore.content.client.xeon.xdk.v1.impl.MethodImpl;

public interface XDK100_impl {
	public FieldImpl getFieldImplementaion(ImplSpec spec);
	public MethodImpl getMethodImplementation(ImplSpec spec);
	
	public Object getModuleFromListByName(String name);
	public String getModulename(Object module);
	public String getModuleSuffix(Object Module);
	public boolean isModuleEnabled(Object modue);
}
