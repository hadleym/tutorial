package com.coyotee.tutorial.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMagicWand extends Item{

	public ItemMagicWand() {
		this.setRegistryName("magicwand");
		this.setUnlocalizedName(this.getRegistryName().toString());
		setCreativeTab(CreativeTabs.MISC);

	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		IBlockState iblockstate = worldIn.getBlockState(pos);
		Block block = iblockstate.getBlock();
		BlockPos placementPos = new BlockPos(pos);
		switch(facing){
		case UP:
			if (worldIn.getBlockState(pos.up()).getMaterial() == Material.AIR)
				placementPos = placementPos.up();
			break;
		case DOWN:
			if (worldIn.getBlockState(pos.down()).getMaterial() == Material.AIR)
				placementPos = placementPos.down();
			break;
		case NORTH:
			if (worldIn.getBlockState(pos.north()).getMaterial() == Material.AIR)
				placementPos = placementPos.north();
			break;
		case SOUTH:
			if (worldIn.getBlockState(pos.south()).getMaterial() == Material.AIR)
				placementPos = placementPos.south();
			break;
		case EAST:
			if (worldIn.getBlockState(pos.east()).getMaterial() == Material.AIR)
				placementPos = placementPos.east();
			break;
		case WEST:
			if (worldIn.getBlockState(pos.west()).getMaterial() == Material.AIR)
				placementPos = placementPos.west();
			break;
        default:
        	return EnumActionResult.PASS;
		}
		
        IBlockState iblockstate1 = Blocks.STONE.getDefaultState();
        worldIn.playSound(playerIn,  placementPos,  SoundEvents.BLOCK_ANVIL_HIT, SoundCategory.BLOCKS, 2.0F, 1.0F);
        if (!worldIn.isRemote){
        	worldIn.setBlockState(placementPos, iblockstate1, 3);
		}
		return EnumActionResult.SUCCESS;
		
	}

}
