package xstore.content.client.xeon.xdk.v1.shared;

import xstore.content.client.xeon.xdk.v1.hook.EventMotionHook;
import xstore.content.client.xeon.xdk.v1.hook.EventPacketHook;
import xstore.content.client.xeon.xdk.v1.impl.HookDispatchable;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

public abstract class ModuleAddon extends HookDispatchable implements Addon{
	public final String name;
	public final Category category;
	public boolean toggled = false;
	
	public ModuleAddon(String name, Category category) {
		this.name = name;
		this.category = category;
	}
	
	
	public void onEnable() {}
	public void onDisable() {}
}