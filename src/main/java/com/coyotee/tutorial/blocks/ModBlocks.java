package com.coyotee.tutorial.blocks;

import com.coyotee.tutorial.tileentity.ModBlockTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static Block tutorialBlock;
	public static ItemBlock tutorialItemBlock;
	public static void createBlocks(){

		GameRegistry.register(tutorialBlock = new BasicBlock("tutorial_block"));
		tutorialItemBlock = new ItemBlock(tutorialBlock);
		tutorialItemBlock.setRegistryName("tutorial_block");
		GameRegistry.register(tutorialItemBlock);
		DataBlock dataBlock = new DataBlock();
		dataBlock.initModel();

	}
	
	public static void reg(String name){
		
	}

}
