package xstore.content.client.xeon.xdk.v1.shared;

import xstore.content.client.xeon.xdk.v1.hook.EventMotionHook;
import xstore.content.client.xeon.xdk.v1.hook.EventPacketHook;

public abstract class ModuleAddon implements Addon, EventMotionHook, EventPacketHook{
	public final String name;
	public final Category category;
	public boolean toggled = false;
	
	public ModuleAddon(String name, Category category) {
		this.name = name;
		this.category = category;
	}
	
	public abstract void onEnable();
	public abstract void onDisable();
}