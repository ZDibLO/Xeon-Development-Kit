package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.FieldImpl;
import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import xstore.content.client.xeon.xdk.v1.impl.MethodImpl;
import xstore.content.client.xeon.xdk.v1.shared.Category;
import xstore.content.client.xeon.xdk.v1.util.ConstListObject;
import xstore.content.client.xeon.xdk.v1.util.ConstPtr;
import xstore.content.client.xeon.xdk.v1.util.ListObject;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

public interface XDK100_impl {
	public <R, P> FieldImpl<R, P> getFieldImplementaion(ImplSpec<R, P> spec);
	public <R, P> MethodImpl<R, P> getMethodImplementation(ImplSpec<R, P> spec);
		
	//modules
	public void getModuleByName(String name, Ptr module);
	public void getModulename(Object module, Ptr<String> name);
	public void getModuleCategory(Object module, Ptr<Category> cat);
	public void getModuleSuffix(Object Module, Ptr<String> suffix);
	public void isModuleEnabled(Object modue, Ptr<Boolean> value);
	public void toggleModule(Object module, boolean value);
	public void getModuleSettings(Object module, ListObject settings);
	
	//settings
	public void getSettingType(Object setting, Ptr<SettingType> type);
	
	public void getBooleanSettingValuePointer(Object setting, Ptr<Boolean> ptr);
	public void getNumberSettingValuePointer(Object setting, Ptr<Float> ptr);
	public void getKeySettingValuePointer(Object setting, Ptr<Integer> ptr);
	public void getStringSettingValuePointer(Object setting, Ptr<String> ptr);
	public void getModeSettingValuePointer(Object setting, Ptr<Integer> ptr);
	public void getRangeSettingValuePointer(Object setting, Ptr<Float> ptrMin, Ptr<Float> ptrMax);
	public void getColorSettingValuePointer(Object setting, Ptr<Boolean> ptrR, Ptr<Boolean> ptrG, Ptr<Boolean> ptrB, Ptr<Boolean> ptrA);
	public void getSectionSettingValuePointer(Object setting, Ptr<ListObject> ptr);
	
	public void getSettingName(Object setting, Ptr<String> ptr);
	public void getNumberSettingProperties(Object setting, ConstPtr<Float> min, ConstPtr<Float> max, ConstPtr<Float> inc);
	public void getModeSettingValues(Object setting, Ptr<ConstListObject<String>> modes);
	public void getRangeSettingProperties(Object setting, ConstPtr<Float> min, ConstPtr<Float> max, ConstPtr<Float> inc);
	
	public static enum SettingType {
		BOOLEAN,
		NUMBER,
		KEY,
		STRING,
		MODE,
		RANGE,
		COLOR,
		SECTION
	}
}
