package com.coyotee.tutorial.crafting;

import com.coyotee.tutorial.blocks.ModBlocks;
import com.coyotee.tutorial.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting(){
		ItemStack stack = new ItemStack(ModBlocks.tutorialItemBlock);
		//Object recipe = new Object[] { "##", "##", '#', ModItems.widget};
		Object recipe = new Object[] { "DD", "DD", 'D', ModItems.widget};
		GameRegistry.addRecipe(stack, new Object[]{
	            "DD",
	            "DD",
	            'D', ModItems.widget
	    });

		GameRegistry.addSmelting(ModItems.widget, new ItemStack(Items.DIAMOND), 1.0F);

		IFuelHandler widgetFuel = new IFuelHandler(){
			@Override
			public int getBurnTime(ItemStack fuel) {
				final int BURN_TIME_SECONDS = 5;	
				final int TICKS_PER_SECOND = 20;
				if (fuel != null && fuel.getItem() == ModItems.widget )
					return BURN_TIME_SECONDS * TICKS_PER_SECOND;
				else
					return 0;
			}
			
		};
		GameRegistry.registerFuelHandler(widgetFuel);
		IFuelHandler wheatFuelHandler = new IFuelHandler() {
		      @Override
		      public int getBurnTime(ItemStack fuel) {
		        final int BURN_TIME_SECONDS = 5;
		        final int TICKS_PER_SECOND = 20;
		        if (fuel != null && fuel.getItem() == Items.WHEAT) {
		          return BURN_TIME_SECONDS * TICKS_PER_SECOND;
		        } else {
		          return 0;
		        }
		      }
		    };
	}

}
