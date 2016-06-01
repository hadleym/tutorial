package com.coyotee.tutorial.client.render.items;

import com.coyotee.tutorial.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public final class ItemRenderRegister {
	public static void registerItemRenderer(){
		
		ModelResourceLocation loc = new ModelResourceLocation("coyoteetutorial:widget", "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.widget, 0, loc);
		loc = new ModelResourceLocation("coyoteetutorial:magicwand", "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.magicWand, 0, loc);
		loc = new ModelResourceLocation("coyoteetutorial:teleportwand", "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.teleportWand, 0, loc);
	}

}
