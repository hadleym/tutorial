package com.coyotee.tutorial.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class ModTileEntity extends TileEntity implements ITickable {

	@Override
	public void update() {
		System.out.println("Hello, i'm a tile entity");
		
	}

}
