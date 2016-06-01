package com.coyotee.tutorial.tileentity;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ModBlockTileEntity extends BlockContainer {
	
	protected ModBlockTileEntity(String unlocalizedName){
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.MISC);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setHarvestLevel("pickaxe",2);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new ModTileEntity();
	}

}
