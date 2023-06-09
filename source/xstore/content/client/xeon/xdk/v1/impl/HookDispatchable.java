package xstore.content.client.xeon.xdk.v1.impl;

import xstore.content.client.xeon.xdk.v1.hook.EventMotionHook;
import xstore.content.client.xeon.xdk.v1.hook.EventPacketHook;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

public class HookDispatchable implements EventPacketHook, EventMotionHook{

	@Override
	public void invokeOnMotion(Ptr<Double> posX, Ptr<Double> posY, Ptr<Double> posZ, Ptr<Float> yaw, Ptr<Float> pitch, Ptr<Boolean> onGround, Ptr<Boolean> cancelled) {}

	@Override
	public void invokeOnPacket(Object packet, Ptr<Boolean> cancelled) {}

}
