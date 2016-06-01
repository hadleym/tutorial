package com.coyotee.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTeleportWand extends Item{
	public ItemTeleportWand() {
		this.setRegistryName("teleportwand");
		this.setUnlocalizedName(this.getRegistryName().toString());
		setCreativeTab(CreativeTabs.MISC);
	}
	
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn,BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		 if( playerIn.dimension != 8) 
                         playerIn.changeDimension(8);
		 else
			 playerIn.changeDimension(0);
		 
		 return EnumActionResult.SUCCESS;

	}
	
	
}