package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import static xstore.content.client.xeon.xdk.v1.impl.ImplSpec.IMPL_TYPE.*;
import xstore.content.client.xeon.xdk.v1.impl.XDKImpl;

public class XDK100 {
	//Minecraft
	public static ImplSpec theMinecraft = new ImplSpec(true, "mc_mcget()L/mc", METHOD);
	//retriving the player from minecraft
	public static ImplSpec thePlayer = new ImplSpec(false, "mc_getplayer", FIELD);
	//jump function from entity living base
	public static ImplSpec elbJump = new ImplSpec(false, "elb_jump()", METHOD);
	
}
