package xstore.content.client.xeon.xdk.v1.hook;

import xstore.content.client.xeon.xdk.v1.util.Ptr;

@FunctionalInterface
public interface EventMotionHook {
	public void invokeOnMotion(
			Ptr<Double> posX, 
			Ptr<Double> posY, 
			Ptr<Double> posZ,
			Ptr<Float> yaw,
			Ptr<Float> pitch,
			Ptr<Boolean> onGround,
			Ptr<Boolean> cancelled
		);
}
