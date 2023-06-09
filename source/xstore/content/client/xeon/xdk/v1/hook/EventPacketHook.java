package xstore.content.client.xeon.xdk.v1.hook;

import xstore.content.client.xeon.xdk.v1.hook.packet.Packet;
import xstore.content.client.xeon.xdk.v1.util.Ptr;

@FunctionalInterface
public interface EventPacketHook {
	public void invokeOnPacket(Ptr<Packet> packet, Ptr<Boolean> cancelled);
}
