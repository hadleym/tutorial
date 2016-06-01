package com.coyotee.tutorial;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void addRecipes(){
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN), 
    			"AAA",
    			"AAA",
    			"AAA",
    			'A', Items.COOKIE);
    	GameRegistry.addRecipe(new ItemStack(Items.APPLE, 4),
    			"AA",
    			"AA",
    			'A', Blocks.COBBLESTONE);
    	GameRegistry.addRecipe(new ItemStack(Items.DYE, 2, 15),
    		"AB ",
    		"AAC",
    		"   ",
    		'A', Items.COOKIE, 'B', Blocks.DIRT, 'C', new ItemStack(Items.DYE, 1, 1));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK), Items.DIAMOND, Items.LAVA_BUCKET, new ItemStack(Blocks.WOOL, 1, 2));
    	GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(Items.DIAMOND,2), 1F);	
	}
}
