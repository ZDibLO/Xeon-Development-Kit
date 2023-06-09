package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import static xstore.content.client.xeon.xdk.v1.impl.ImplSpec.IMPL_TYPE.*;

import xstore.content.client.xeon.xdk.v1.annotate.Constant;

public class XDK100 {
	//Minecraft
	@Constant public static ImplSpec theMinecraft = new ImplSpec(true, "mc_mcget()L/mc", METHOD);
	//retriving the player from minecraft
	@Constant public static ImplSpec thePlayer = new ImplSpec(false, "mc_getplayer", FIELD);
	//jump function from entity living base
	public static ImplSpec elbJ_jump = new ImplSpec(false, "elb_jump()", METHOD);
	//Entity basic variables
	public static ImplSpec e_posX = new ImplSpec(false, "e_x", FIELD);
	public static ImplSpec e_posY = new ImplSpec(false, "e_y", FIELD);
	public static ImplSpec e_posZ = new ImplSpec(false, "e_z", FIELD);
	public static ImplSpec e_rotY = new ImplSpec(false, "e_yaw", FIELD);
	public static ImplSpec e_rotP = new ImplSpec(false, "e_pitch", FIELD);
	public static ImplSpec e_ground = new ImplSpec(false, "e_onground", FIELD);
	public static ImplSpec e_motX = new ImplSpec(false, "e_mx", FIELD);
	public static ImplSpec e_motY = new ImplSpec(false, "e_my", FIELD);
	public static ImplSpec e_motZ = new ImplSpec(false, "e_mz", FIELD);
	public static ImplSpec e_width = new ImplSpec(false, "e_sw", FIELD);
	public static ImplSpec e_height = new ImplSpec(false, "e_sh", FIELD);
	public static ImplSpec e_ticksexisted = new ImplSpec(false, "e_texist", FIELD);
	//EntityLivingbase
	public static ImplSpec elb_hp = new ImplSpec(false, "elb_hp", FIELD);
	public static ImplSpec elb_absorption = new ImplSpec(false, "elb_hp+", FIELD);
	public static ImplSpec elb_hurttime = new ImplSpec(false, "elb_ht", FIELD);
	public static ImplSpec elb_move_forward= new ImplSpec(false, "elb_m_fwd", FIELD);
	public static ImplSpec elb_move_strafing = new ImplSpec(false, "elb_m_strf", FIELD);
	//EntityPlayer
	public static ImplSpec ep_inventory = new ImplSpec(false, "ep_inv", FIELD);
	public static ImplSpec ep_iteminuse = new ImplSpec(false, "ep_iiu", FIELD);
	//Some entity methods
	public static ImplSpec elb_jump = new ImplSpec(false, "elb_jump()V", METHOD);
	//Xeon modules
	@Constant public static ImplSpec xn_modulemanager = new ImplSpec(false, "x_mdmng", FIELD);
	@Constant public static ImplSpec modmanager_getlist = new ImplSpec(false, "mmg_list", FIELD);
}
