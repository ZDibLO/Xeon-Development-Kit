package xstore.content.client.xeon.xdk.v1.specification;

import xstore.content.client.xeon.xdk.v1.impl.ImplSpec;
import xstore.content.client.xeon.xdk.v1.util.ListObject;

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
	public static ImplSpec e_posX = new ImplSpec<Double, Object>(false, "e_x", FIELD);
	public static ImplSpec e_posY = new ImplSpec<Double, Object>(false, "e_y", FIELD);
	public static ImplSpec e_posZ = new ImplSpec<Double, Object>(false, "e_z", FIELD);
	public static ImplSpec e_rotY = new ImplSpec<Float, Object>(false, "e_yaw", FIELD);
	public static ImplSpec e_rotP = new ImplSpec<Float, Object>(false, "e_pitch", FIELD);
	public static ImplSpec e_ground = new ImplSpec<Boolean, Object>(false, "e_onground", FIELD);
	public static ImplSpec e_motX = new ImplSpec<Double, Object>(false, "e_mx", FIELD);
	public static ImplSpec e_motY = new ImplSpec<Double, Object>(false, "e_my", FIELD);
	public static ImplSpec e_motZ = new ImplSpec<Double, Object>(false, "e_mz", FIELD);
	public static ImplSpec e_width = new ImplSpec<Float, Object>(false, "e_sw", FIELD);
	public static ImplSpec e_height = new ImplSpec<Float, Object>(false, "e_sh", FIELD);
	public static ImplSpec e_ticksexisted = new ImplSpec<Integer, Object>(false, "e_texist", FIELD);
	//EntityLivingbase
	public static ImplSpec elb_hp = new ImplSpec<Float, Object>(false, "elb_hp", FIELD);
	public static ImplSpec elb_absorption = new ImplSpec<Float, Object>(false, "elb_hp+", FIELD);
	public static ImplSpec elb_hurttime = new ImplSpec<Integer, Object>(false, "elb_ht", FIELD);
	public static ImplSpec elb_move_forward= new ImplSpec<Float, Object>(false, "elb_m_fwd", FIELD);
	public static ImplSpec elb_move_strafing = new ImplSpec<Float, Object>(false, "elb_m_strf", FIELD);
	//EntityPlayer
	public static ImplSpec ep_inventory = new ImplSpec(false, "ep_inv", FIELD);
	public static ImplSpec ep_iteminuse = new ImplSpec(false, "ep_iiu", FIELD);
	//Some entity methods
	public static ImplSpec elb_jump = new ImplSpec(false, "elb_jump()V", METHOD);
	//Xeon modules
	@Constant public static ImplSpec xn_modulemanager = new ImplSpec(false, "x_mdmng", FIELD);
	@Constant public static ImplSpec modmanager_getlist = new ImplSpec<ListObject, Object>(false, "mmg_list", FIELD);
}
