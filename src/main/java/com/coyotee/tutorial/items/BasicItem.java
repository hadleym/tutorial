package com.coyotee.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem extends Item{
	public BasicItem(String itemName){
		setItemName(this, itemName);
		setCreativeTab(CreativeTabs.MISC);
	}
	
	public BasicItem(){
		setCreativeTab(CreativeTabs.MISC);
	}

	public static void setItemName(Item item, String itemName){
			item.setRegistryName(itemName);
			item.setUnlocalizedName(item.getRegistryName().toString());
					
	}
}
