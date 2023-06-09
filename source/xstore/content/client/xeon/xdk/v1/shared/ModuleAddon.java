package xstore.content.client.xeon.xdk.v1.shared;

import xstore.content.client.xeon.xdk.v1.hook.EventMotionHook;
import xstore.content.client.xeon.xdk.v1.hook.EventPacketHook;
import xstore.content.client.xeon.xdk.v1.hook.packet.Packet;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

public abstract class ModuleAddon implements Addon, EventMotionHook, EventPacketHook{
	public final String name;
	public final Category category;
	public boolean toggled = false;
	
	public ModuleAddon(String name, Category category) {
		this.name = name;
		this.category = category;
	}
	
	@Override
	public void invokeOnMotion(Ptr<Double> posX, Ptr<Double> posY, Ptr<Double> posZ, Ptr<Float> yaw, Ptr<Float> pitch, Ptr<Boolean> onGround, Ptr<Boolean> cancelled) {}
	
	@Override
	public void invokeOnPacket(Ptr<Packet> packet, Ptr<Boolean> cancelled) {}
	
	public abstract void onEnable();
	public abstract void onDisable();
}