package com.coyotee.tutorial;

import com.coyotee.tutorial.blocks.ModBlocks;
import com.coyotee.tutorial.crafting.ModCrafting;
import com.coyotee.tutorial.items.ModItems;
import com.coyotee.tutorial.tileentity.ModTileEntities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e){
    	ModItems.registerItems();
		ModBlocks.createBlocks();
		//ModTileEntities.init();
	}
	
	public void init(FMLInitializationEvent e){
		ModCrafting.initCrafting();
		
	}
	
	public void postInit(FMLPostInitializationEvent e){

	}
	
}
