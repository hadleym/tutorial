package com.coyotee.tutorial.client.render.blocks;

import com.coyotee.tutorial.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public final class BlockRenderRegister {
	public static String modid = "coyoteetutorial";
	public static void registerBlockRenderer(){
			reg(ModBlocks.tutorialBlock, "tutorial_block");
	}

	public static void reg(Block block, String name){
		ModelResourceLocation loc = new ModelResourceLocation(modid+":"+name, "inventory");	
		Item i = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(i, 0, loc);

	}
}
