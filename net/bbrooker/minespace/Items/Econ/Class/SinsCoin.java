package net.bbrooker.minespace.Items

import java.util.Random;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.MCSpaceInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SinsCoin  extends Item {
	
	public SinsCoin (int id) {
		super(id);
		setMaxStackSize(1024);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("SinsCoin");
		setTextureName("minespace:SinsCoin");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[SC] Use to exchange rare crystal in Sins side");
		}
		
	}
