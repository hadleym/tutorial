package com.coyotee.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static BasicItem widget;
	public static ItemMagicWand magicWand;
	public static ItemTeleportWand teleportWand;
	public static void registerItems(){
		magicWand = new ItemMagicWand();
		teleportWand = new ItemTeleportWand();
		widget = new BasicItem("widget");
		GameRegistry.register(widget);
		GameRegistry.register(magicWand);
		GameRegistry.register(teleportWand);
	}

}
