package com.coyotee.tutorial.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTileEntities {
	public static void init(){
		ModBlockTileEntity mbte = new ModBlockTileEntity("modblocktileentity");
		GameRegistry.register(mbte);
		
		GameRegistry.registerTileEntity(ModTileEntity.class, "tutorial_tile_entity");
	}

}
