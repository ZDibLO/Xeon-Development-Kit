package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.FieldImpl;
import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import xstore.content.client.xeon.xdk.v1.impl.MethodImpl;
import xstore.content.client.xeon.xdk.v1.util.ListObject;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

public interface XDK100_impl {
	public <R, P> FieldImpl<R, P> getFieldImplementaion(ImplSpec<R, P> spec);
	public <R, P> MethodImpl<R, P> getMethodImplementation(ImplSpec<R, P> spec);
	
	public void getModuleByName(String name, Ptr module);
	public void getModulename(Object module, Ptr<String> name);
	public void getModuleSuffix(Object Module, Ptr<String> suffix);
	public void isModuleEnabled(Object modue, Ptr<Boolean> value);
	
	public void toggleModule(Object module, boolean value);
	public void getModuleSettings(Object module, ListObject settings); 
}
